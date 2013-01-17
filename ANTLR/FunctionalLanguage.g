grammar FunctionalLanguage;

@header {

import java.util.HashMap;
import com.al333z.typechecking.*;

}

@members {

private int staticData = 0;
private int labelCounter = 0;
private int parameterCounter = 0;
private HashMap symTable = new HashMap();
private HashMap localSymTable = new HashMap();
private final static int TRUEVALUE = 1;
private final static int FALSEVALUE = 0;
private final static int EMPTYVALUE = -1;

private String functionCode = new String();

}

// parser

prog	returns [String code]
        	: c=command SEMIC {$code = $c.code+"\n";}
	 (d=command SEMIC {$code += $d.code+"\n";} )* 	{ $code+="\thalt\n"+functionCode;}
 	;
 	
 	//TODO syntax directed translation...
type
	: INT
	| BOOL
	| (LISTOF LSPAR type RSPAR)
	; 	
 	  
command	returns [String code]
	: DEF type i=ID 		//TODO
          	( ASS e=expr {
            symTable.put($i.text,new Integer(staticData));
            $code = $e.code+"\tpush "+(staticData++)+"\n"+"\tsw\n";}
           	|LPAR ( 
           	type	//TODO
            j=ID 
            {localSymTable.put($j.text,new Integer(parameterCounter++));}
            (COMMA type j=ID 	//TODO
            {localSymTable.put($j.text,new Integer(parameterCounter++));} 
            )* )? RPAR ASS e=expr
            {
            String removePar = "";
            for(int c=0; c<parameterCounter; c++)
            	removePar+="\tpop\n";
             functionCode+=$i.text+":\n"+
                            "\tlsp\n"+
                            "\tsfp\n"+
                            "\tlra\n"+
                            $e.code+
                            "\tsrv\n"+
                            "\tsra\n"+
                            removePar+  
                            "\tsfp\n"+
                            "\tlrv\n"+
                            "\tjra\n";
       	$code="";
            parameterCounter=0;
            localSymTable=new HashMap();             
         	} 
          	) 
        	| PRINT e=expr {$code = $e.code+"\tprint\n";} 	  
        	;
        
expr	returns [String code]
	: t=term {$code = $t.code;}
          	( PLUS t=term {$code+=$t.code+"\tadd\n";}
          	| MINUS t=term {$code=$t.code+$code+"\tsub\n";}
          	| OR t=term 
            {
            $code = $code+
            	     "\tpush "+TRUEVALUE+"\n"+
            	     "\tbeq label"+labelCounter+"\n"+
            	     $t.code+
            	     "\tpush "+TRUEVALUE+"\n"+
            	     "\tbeq label"+(labelCounter++)+"\n"+
            	     "\tpush "+FALSEVALUE+"\n"+
            	     "\tb label"+(labelCounter++)+"\n"+
            	     "label"+(labelCounter-2)+":\n"+
            	     "\tpush "+TRUEVALUE+"\n"+
            	     "label"+(labelCounter-1)+":\n";
       	}
          	)*  
        	;
                        
term  	returns [String code]
        	: f=factor {$code=$f.code;} 
          	(AND f=factor
           	{
           	$code = $code+
            	        "\tpush "+FALSEVALUE+"\n"+
            	        "\tbeq label"+labelCounter+"\n"+
            	        $f.code+
            	        "\tpush "+FALSEVALUE+"\n"+
            	        "\tbeq label"+(labelCounter++)+"\n"+
            	        "\tpush "+TRUEVALUE+"\n"+
            	        "\tb label"+(labelCounter++)+"\n"+
            	        "label"+(labelCounter-2)+":\n"+
            	        "\tpush "+FALSEVALUE+"\n"+
            	        "label"+(labelCounter-1)+":\n";
       	}
          	)*
	;

factor 	returns [String code, Checker typeCheck]					//TODO type checking starts here!!
 	: n=NUMBER {$code = "\tpush "+$n.text+"\n"; $typeCheck = new NumberChecker(); }
 	| TRUE {$code = "\tpush "+TRUEVALUE+"\n"; $typeCheck = new BoolChecker(); }
 	| FALSE {$code = "\tpush "+FALSEVALUE+"\n"; $typeCheck = new BoolChecker(); }
 	| EMPTY {$code = "\tpush "+EMPTYVALUE+"\n"; $typeCheck = new ListChecker(); }
 	| NOT e=expr
 	{
 	$code = $e.code+
            	   "\tpush "+TRUEVALUE+"\n"+
            	   "\tbeq label"+(labelCounter++)+"\n"+
            	   "\tpush "+TRUEVALUE+"\n"+
            	   "\tb label"+(labelCounter++)+"\n"+
            	   "label"+(labelCounter-2)+":\n"+
            	   "\tpush "+FALSEVALUE+"\n"+
            	   "label"+(labelCounter-1)+":\n";
   
         	}
        	| LSPAR e=expr COMMA f=expr RSPAR
          	{
          	$code = $f.code+
                   $e.code+
                   "\tlhp\n"+
                   "\tsw\n"+
                   "\tlhp\n"+
                   "\tpush 1\n"+
                   "\tadd\n"+
                   "\tsw\n"+
                   "\tlhp\n"+
                   "\tlhp\n"+
                   "\tpush 2\n"+
                   "\tadd\n"+
                   "\tshp\n";
      	}
        	| i=ID 
          	( 
          	{
          	Integer value = (Integer)localSymTable.get($i.text);
            if (value == null) {
         	$code = "\tpush "+
                        (Integer)symTable.get($i.text)+"\n"+
                        "\tlw\n"; 
            } else {
                $code = "\tlfp\n"+
                        "\tpush "+value.toString()+"\n"+
                        "\tadd\n"+
                        "\tlw\n";
       	}
            }
          	| LPAR {$code = "";}
          	  (e=expr {$code = $e.code;}
       	  (COMMA f=expr {$code = $f.code+$code;})* )? 
              RPAR {$code = "\tlfp\n"+$code+"\tjal "+$i.text+"\n";}
          	)                
        	| LPAR e=expr 
          	( RPAR {$code = $e.code;}
          	| EQUAL e2=expr RPAR 
            {
            $code = $e2.code+$e.code+
                   "\tbeq label"+(labelCounter++)+"\n"+
          	   "\tpush "+FALSEVALUE+"\n"+
          	   "\tb label"+(labelCounter++)+"\n"+
          	   "label"+(labelCounter-2)+":\n"+
          	   "\tpush "+TRUEVALUE+"\n"+
          	   "label"+(labelCounter-1)+":\n";
         	}
          	| LESS e2=expr RPAR 
            {
            $code = $e2.code+$e.code+
                   "\tbless label"+(labelCounter++)+"\n"+
          	   "\tpush "+FALSEVALUE+"\n"+
          	   "\tb label"+(labelCounter++)+"\n"+
          	   "label"+(labelCounter-2)+":\n"+
          	   "\tpush "+TRUEVALUE+"\n"+
          	   "label"+(labelCounter-1)+":\n";
        	}   
         	 | GREATER e2=expr RPAR 
           	{
            $code = $e.code+$e2.code+
                   "\tbless label"+(labelCounter++)+"\n"+
          	   "\tpush "+FALSEVALUE+"\n"+
          	   "\tb label"+(labelCounter++)+"\n"+
          	   "label"+(labelCounter-2)+":\n"+
          	   "\tpush "+TRUEVALUE+"\n"+
          	   "label"+(labelCounter-1)+":\n";
       	}    
        	| DOT 
            ( FIRST {$code = $e.code+"\tlw\n";} 
            | REST
            {
            	$code = $e.code+
                             "\tpush 1"+
                             "\tadd\n"+
                             "\tlw\n";
         	}
            ) RPAR 	          
          	)
  	| IF e1=expr THEN e2=expr ELSE e3=expr  
         	{
         	$code = $e1.code+
                   "\tpush "+TRUEVALUE+"\n"+ 
                   "\tbeq label"+(labelCounter++)+"\n"+
          	   $e3.code+
          	   "\tb label"+(labelCounter++)+"\n"+
          	   "label"+(labelCounter-2)+":\n"+
          	   $e2.code+
          	   "label"+(labelCounter-1)+":\n";
      	}           	   
        	;
        	                        
// lexer

PLUS    	: '+' ;
MINUS   	: '-' ;
LPAR    	: '(' ;
RPAR		: ')' ;
LSPAR   	: '[' ;
RSPAR	: ']' ;
SEMIC   	: ';' ;
COMMA   	: ',' ;
DOT		: '.' ;
DEF    	 	: 'def' ;
ASS     	: '=' ;
EQUAL	: '==' ;
LESS		: '<' ;
GREATER	: '>' ;
OR		: '||' ;
AND		: '&&' ;
NOT		: '!' ;
PRINT  	: 'print' ;	
IF		: 'if' ;
THEN		: 'then' ;
ELSE		: 'else' ;
TRUE		: 'true' ;
FALSE		: 'false' ; 
EMPTY 	: 'empty' ;
FIRST		: 'first' ;
REST		: 'rest' ;
INT 		: 'INT' ;
BOOL		:  'BOOL' ;
LISTOF 	: 'LIST-OF' ;
NUMBER  	: '0' | (('1'..'9')('0'..'9')*) ;
ID		: ('a'..'z' | 'A'..'Z')('0'..'9' | 'a'..'z' | 'A'..'Z')* ;
WHITESP 	: ( '\t' | ' ' | '\r' | '\n' )+ { skip(); } ; 
COMMENT 	: '/*' (options {greedy=false;} : .)* '*/' { skip(); } ;

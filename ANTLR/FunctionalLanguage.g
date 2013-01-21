grammar FunctionalLanguage;

@header {

import java.util.HashMap;
import java.util.LinkedList;
import com.al333z.typechecking.*;

}

@members {

private int staticData = 0;
private int labelCounter = 0;
private int parameterCounter = 0;
private HashMap symTable = new HashMap();
private HashMap typeTable = new HashMap();
private HashMap localSymTable = new HashMap();
private HashMap localTypeTable = new HashMap();

private HashMap functionParametersTypeTable = new HashMap();
private HashMap functionReturnValues = new HashMap();

private LinkedList<Checker> funcParametersTypeList = new LinkedList<Checker>();
private LinkedList<Integer> parametersTypeList = new LinkedList<Integer>();

private final static int TRUEVALUE = 1;
private final static int FALSEVALUE = 0;
private final static int EMPTYVALUE = -1;

private String functionCode = new String();

}

// parser

prog	returns [String code,  Checker typecheck]
        	: c=command SEMIC 
        	{
        	
        	$code = $c.code+"\n";
	$typecheck = new CommandChecker($c.typecheck);
        	
        	}
        	
	 (d=command SEMIC 
	 {
	 
	 $code += $d.code+"\n";
	 
	$typecheck = new ProgramChecker($typecheck, $d.typecheck);
	 
	 } )* 	{ $code+="\thalt\n"+functionCode;}
 	;
 	
type returns [int typevalue]
	: INT	{$typevalue = Checker.INT; }
	| BOOL {$typevalue = Checker.BOOL; }
	| (LISTOF LSPAR type RSPAR) {$typevalue = Checker.LISTOF; }
	;
		 	
 	  
command	returns [String code, Checker typecheck]
	: DEF t=type i=ID
          	( ASS e=expr 
          	{
          	
            symTable.put($i.text,new Integer(staticData));
            typeTable.put($i.text,new Integer($t.typevalue));
            $code = $e.code+"\tpush "+(staticData++)+"\n"+"\tsw\n";
            
            $typecheck = new ExprAssignmentChecker($t.typevalue , $e.typecheck);
            
            }
            
           	|LPAR ( 
           	{
           	
           	// save func return values
           	functionReturnValues.put($i.text, new Integer($t.typevalue));
           	
           	}
           	
           	t=type
            j=ID 
            {
            localSymTable.put($j.text,new Integer(parameterCounter++));
            //TODO
            localTypeTable.put($j.text,new Integer($t.typevalue));
            
            //  save first param type
       	parametersTypeList.add(new Integer($t.typevalue));
            
            }
            (COMMA t=type k=ID
            {
            localSymTable.put($k.text,new Integer(parameterCounter++));
            //TODO
            localTypeTable.put($k.text,new Integer($t.typevalue));
            
       	parametersTypeList.add(new Integer($t.typevalue));
            
            } 
            )* )? RPAR
            {
            	// save parameters type list
            	functionParametersTypeTable.put($i.text, parametersTypeList);
            	
            	System.out.println("saved functionParametersTypeTable id: "+$i.text);
            	System.out.println("saved functionParametersTypeTable size: "+parametersTypeList.size());
            	System.out.println("saved functionParametersTypeTable: "+parametersTypeList.toString());
            	
            	parametersTypeList = new LinkedList<Integer>();
            }
             ASS e=expr
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
            
                        //TODO
            localTypeTable = new HashMap();
            
            $typecheck = new ExprChecker($e.typecheck);
                       
         	} 
          	) 
        	| PRINT e=expr 
        	
        	{
        	
        	$code = $e.code+"\tprint\n";
        	
        	$typecheck = new PrintChecker($e.typecheck);
        	
        	} 	  
        	;
        
expr	returns [String code, Checker typecheck]
	: t=term
	{
	
	$code = $t.code;
	$typecheck = new TermChecker($t.typecheck);
	
	}	
	
          	( PLUS t2=term 
          	{
          	
          	$code+=$t2.code+"\tadd\n";
          	$typecheck = new PlusChecker($typecheck, $t2.typecheck);
          	
          	}
          	
          	
          	| MINUS t2=term 
          	{
          	
          	$code=$t2.code+$code+"\tsub\n";
          	$typecheck = new MinusChecker($typecheck, $t2.typecheck);
          	
          	}
          	| OR t2=term 
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
            	     
        	$typecheck = new OrChecker($typecheck, $t2.typecheck);    	    
            	    
       	}
          	)*  
        	;
                        
term  	returns [String code, Checker typecheck]
        	: f=factor 
        	{
        	$code=$f.code;
        	$typecheck = new FactorChecker($f.typecheck);
        	
        	} 
          	(AND f2=factor
           	{
           	$code = $code+
            	        "\tpush "+FALSEVALUE+"\n"+
            	        "\tbeq label"+labelCounter+"\n"+
            	        $f2.code+
            	        "\tpush "+FALSEVALUE+"\n"+
            	        "\tbeq label"+(labelCounter++)+"\n"+
            	        "\tpush "+TRUEVALUE+"\n"+
            	        "\tb label"+(labelCounter++)+"\n"+
            	        "label"+(labelCounter-2)+":\n"+
            	        "\tpush "+FALSEVALUE+"\n"+
            	        "label"+(labelCounter-1)+":\n";
	        
       	$typecheck = new AndChecker($typecheck, $f2.typecheck);	
            	        
       	}
          	)*
	;

factor 	returns [String code, Checker typecheck]
 	: n=NUMBER {$code = "\tpush "+$n.text+"\n"; $typecheck = new NumberChecker(); }
 	| TRUE {$code = "\tpush "+TRUEVALUE+"\n"; $typecheck = new BoolChecker(); }
 	| FALSE {$code = "\tpush "+FALSEVALUE+"\n"; $typecheck = new BoolChecker(); }
 	| EMPTY {$code = "\tpush "+EMPTYVALUE+"\n"; $typecheck = new ListChecker(); }
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
            	   
        	$typecheck = new NotChecker($e.typecheck);
        	
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
                   
                   //TODO
                   
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
       	
       	Integer localTypeValue = (Integer)localTypeTable.get($i.text);
            if (localTypeValue == null) {
            	System.out.println("id :"+$i.text);
            	Integer typeValue = (Integer)typeTable.get($i.text);
		if(typeValue == null){
			$typecheck = new ErrorChecker();
		}else{
			$typecheck = new IdChecker(typeValue.intValue());
		}
            } else {
		$typecheck = new IdChecker(localTypeValue.intValue());
       	}
       	
            }
          	| LPAR 
          	{
          	$code = "";
          	
          	
          	   	
          	}
          	  (e=expr 
          	  {
          	  $code = $e.code;
          	  
          	  funcParametersTypeList.add(new ExprChecker($e.typecheck));
          	  
          	  }
       	  (COMMA f=expr 
       	  {
       	  
       	  $code = $f.code+$code;
       	  
       	  funcParametersTypeList.add(new ExprChecker($f.typecheck));
       	  
       	  }
       	  )* )? 
              RPAR 
              {
              
              $code = "\tlfp\n"+$code+"\tjal "+$i.text+"\n";
              
              LinkedList<Integer> declaredParametersTypeList = (LinkedList<Integer>) functionParametersTypeTable.get($i.text);
              System.out.println("retrieved functionParametersTypeTable id: "+$i.text);
              System.out.println("retrieved functionParametersTypeTable size: "+declaredParametersTypeList.size());
              System.out.println("retrieved functionParametersTypeTable: "+declaredParametersTypeList.toString());
              
              int returnType =((Integer)functionReturnValues.get($i.text)).intValue();
              $typecheck = new FuncChecker( returnType, funcParametersTypeList, declaredParametersTypeList);
              
              // empty
              funcParametersTypeList = new LinkedList<Checker>();
              
              }
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
          	   
        	$typecheck = new EqualChecker($e.typecheck, $e2.typecheck);
        	
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
          
       	$typecheck = new LessChecker($e.typecheck, $e2.typecheck);
       	
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
          	   
        	$typecheck = new GreaterChecker($e.typecheck, $e2.typecheck);
          	   
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
        
        	$typecheck = new IfChecker($e1.typecheck, $e2.typecheck, $e3.typecheck);  	   
          	   
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

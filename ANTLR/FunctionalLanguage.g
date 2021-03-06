grammar FunctionalLanguage;

@header {

import java.util.HashMap;
import java.util.LinkedList;
import com.al333z.typechecking.*;
import com.al333z.type.*;

}

@members {

private int staticData = 0;
private int labelCounter = 0;
private int parameterCounter = 0;

// Symbol Table
private HashMap symTable = new HashMap();
private HashMap localSymTable = new HashMap();

// Type Table
private HashMap typeTable = new HashMap();
private HashMap localTypeTable = new HashMap();

// Table to keep track of Function Return Values
private HashMap functionReturnValues = new HashMap();

// Table to keep track of Function Parameter Types
private HashMap functionParametersTypeTable = new HashMap();

// Run-time variables
private LinkedList<LinkedList<Node>> funcParametersTypeListOfList = new LinkedList<LinkedList<Node>>();
private LinkedList<Type> parametersTypeList = new LinkedList<Type>();

private final static int TRUEVALUE = 1;
private final static int FALSEVALUE = 0;
private final static int EMPTYVALUE = -1;

private String functionCode = new String();

}

// parser

prog	returns [String code,  Node node]
        	: c=command SEMIC 
        	{
        	$code = $c.code+"\n";
	$node = new CommandNode($c.node);
        	}
        	
	(d=command SEMIC 
	{
	$code += $d.code+"\n"; 
	$node = new ProgramNode($node, $d.node); 
	 } )* 	{ $code+="\thalt\n"+functionCode;}
 	;
 	
type	 returns [Type typevalue]
	: p=primitiveType { $typevalue = $p.typevalue; }
	| c=compoundType {$typevalue = $c.typevalue; }
	;

primitiveType returns[Type typevalue]
	// Symply return Type objs
	: INT		{$typevalue = new IntType(); }
	| BOOL 	{$typevalue = new BoolType(); }
	;

compoundType returns [Type typevalue]
	// return Type obj with a contained type
	: (LISTOF LSPAR t=primitiveType RSPAR) {$typevalue = new ListType($t.typevalue); }
	;
	  
command	returns [String code, Node node]
	: DEF t=type i=ID
          	( ASS e=expr 
          	{
          	// Save value and type of the Expr
            symTable.put($i.text,new Integer(staticData));
            typeTable.put($i.text, $t.typevalue);
            
            $code = $e.code+"\tpush "+(staticData++)+"\n"+"\tsw\n";
            
          	// Assigment operation check
            $node = new ExprAssignmentNode($t.typevalue , $e.node);
            }
            
           	|LPAR ( 
           	{
           	// Function definition
           	
           	// Save func return values
           	functionReturnValues.put($i.text, $t.typevalue);
           	}
           	
           	t=type
            j=ID 
            {
            
            // Save local Sym pos
            localSymTable.put($j.text,new Integer(parameterCounter++));
            
            // Save local arg Type
            localTypeTable.put($j.text,$t.typevalue);
            
            //  Save first param type
       	parametersTypeList.add($t.typevalue);           
       	
            }
            (COMMA t=type k=ID
            {
            
            // Iterate for each arguments..
            localSymTable.put($k.text,new Integer(parameterCounter++));
            localTypeTable.put($k.text, $t.typevalue);
       	parametersTypeList.add($t.typevalue);
       	
            } 
            )* )? RPAR
            {
            	// Save parameters type list
            	functionParametersTypeTable.put($i.text, parametersTypeList);           
            	
            	// Clean var.. 	
            	parametersTypeList = new LinkedList<Type>();
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
            
            // Clean vars..
            localSymTable=new HashMap();
            localTypeTable = new HashMap();
            
            // Check Expr body
            $node = new ExprNode($e.node);
            
         	} 
          	) 
        	| PRINT e=expr 
        	{
        	$code = $e.code+"\tprint\n";
        	$node = new PrintNode($e.node);
        	} 	  
        	;
        
expr	returns [String code, Node node]
	: t=term
	{
	$code = $t.code;
	$node = new TermNode($t.node);
	}	
	
          	( PLUS t2=term 
          	{
          	$code+=$t2.code+"\tadd\n";
          	$node = new PlusNode($node, $t2.node);
          	}
          	
          	| MINUS t2=term 
          	{
          	$code=$t2.code+$code+"\tsub\n";
          	$node = new MinusNode($node, $t2.node);
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
            	     
        	$node = new OrNode($node, $t2.node);    	    	    
       	}
          	)*  
        	;
                        
term  	returns [String code, Node node]
        	: f=factor 
        	{
        	$code=$f.code;
        	$node = new FactorNode($f.node);
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
	        
       	$node = new AndNode($node, $f2.node);		        
       	}
          	)*
	;

factor 	returns [String code, Node node]
	// Basic factors
 	: n=NUMBER {$code = "\tpush "+$n.text+"\n"; $node = new NumberNode(); }
 	| TRUE {$code = "\tpush "+TRUEVALUE+"\n"; $node = new BoolNode(); }
 	| FALSE {$code = "\tpush "+FALSEVALUE+"\n"; $node = new BoolNode(); }
 	| EMPTY {$code = "\tpush "+EMPTYVALUE+"\n"; $node = new ListNode(null, null);  }
 	
 	// (Not-so basic) factors
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
            	   
        	$node = new NotNode($e.node);
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
                   
                   $node = new ListNode($e.node, $f.node);
      	}
        	| i=ID 
          	( 
          	{
          	
          	// Retrieve id value from localSymTable, or from symTable
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
       	
       	// Retrieve id value from localTypeTable, or from typeTable
       	Type localTypeValue = (Type)localTypeTable.get($i.text);
            if (localTypeValue == null) {
            	Type typeValue = (Type)typeTable.get($i.text);
		if(typeValue == null){
			$node = new ErrorNode();
		}else{
			$node = new IdNode(typeValue);
		}
            } else {
		$node = new IdNode(localTypeValue);
       	}
       	
            }
          	| LPAR 
          	{
          	$code = "";
          	
          	// Func call
          	LinkedList<Node> funcParametersTypeList = new LinkedList<Node>();   	
          	}
          	  (e=expr 
          	  {
          	  $code = $e.code;
          	  
          	  // Save arguments expr
          	  funcParametersTypeList.add(new ExprNode($e.node));
          	  }
       	  (COMMA f=expr 
       	  {
       	  $code = $f.code+$code;
       	  funcParametersTypeList.add(new ExprNode($f.node));
       	  }
       	  )* )? 
              RPAR 
              {
              
              $code = "\tlfp\n"+$code+"\tjal "+$i.text+"\n";
              
              // Retrieve declared arguments in func declaration, from functionParametersTypeTable
              LinkedList<Type> declaredParametersTypeList = (LinkedList<Type>) functionParametersTypeTable.get($i.text);
              // Retrieve declared func return Type
              Type returnType =((Type)functionReturnValues.get($i.text));
              
              // Using a list of list of arguments, to support nested func call
              funcParametersTypeListOfList.add(funcParametersTypeList);
              
              // Perform func invocation typecheck
              $node = new FuncNode( returnType, funcParametersTypeList, declaredParametersTypeList);
              
              // Clean..
              funcParametersTypeListOfList.removeLastOccurrence(funcParametersTypeList);
              }
          	)                
        	| LPAR e=expr 
          	( RPAR 
          	{
          	$code = $e.code;
          	$node = $e.node;
          	}
          	| EQUAL e2=expr RPAR 
            {
            $code = $e2.code+$e.code+
                   "\tbeq label"+(labelCounter++)+"\n"+
          	   "\tpush "+FALSEVALUE+"\n"+
          	   "\tb label"+(labelCounter++)+"\n"+
          	   "label"+(labelCounter-2)+":\n"+
          	   "\tpush "+TRUEVALUE+"\n"+
          	   "label"+(labelCounter-1)+":\n";
          	   
        	$node = new EqualNode($e.node, $e2.node);
        	
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
          
       	$node = new LessNode($e.node, $e2.node);
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
          	   
        	$node = new GreaterNode($e.node, $e2.node);
       	}    
        	| DOT        	
            ( FIRST 
            {
            
            $code = $e.code+"\tlw\n";
            
            ExprNode checker = new ExprNode($e.node);
            if(!checker.isListType()){
            	$node = new ErrorNode();
            }else{
            	$node = new FirstNode($e.node);
            }
            } 
            | REST
            {
            $code = $e.code+
                             "\tpush 1"+
                             "\tadd\n"+
                             "\tlw\n";    
                             
       	ExprNode checker = new ExprNode($e.node);
          	 if(!checker.isListType()){
            	$node = new ErrorNode();
            }else{
            	$node =checker;
            }  
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
        
        	$node = new IfNode($e1.node, $e2.node, $e3.node);
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

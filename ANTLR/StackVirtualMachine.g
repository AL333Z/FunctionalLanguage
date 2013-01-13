grammar StackVirtualMachine;

@header{
import java.util.HashMap;
import java.util.Vector;
}

@members{

private int[] code = new int[10000];
private int i = 0;
private HashMap labelAddress = new HashMap();
private Vector labels = new Vector();
private Vector addresses = new Vector();

public int[] createCode() throws Exception {
	assembly();
	return code;
}

}

// parser

assembly:
	( PUSH e=NUMBER {code[i++] = PUSH;
		 	 code[i++] = Integer.parseInt($e.text);}
	| POP {code[i++] = POP;}
	| ADD {code[i++] = ADD;}
	| SUB {code[i++] = SUB;}
	| LOADW {code[i++] = LOADW;}
	| STOREW {code[i++] = STOREW;}
	| LOADFP {code[i++] = LOADFP;}
	| STOREFP {code[i++] = STOREFP;}	
	| LOADSP {code[i++] = LOADSP;}
	| STORESP {code[i++] = STORESP;}	
	| LOADHP {code[i++] = LOADHP;}
	| STOREHP {code[i++] = STOREHP;}	
	| LOADRA {code[i++] = LOADRA;}
	| STORERA {code[i++] = STORERA;}		
	| LOADRV {code[i++] = LOADRV;}
	| STORERV {code[i++] = STORERV;}	
	| e=LABEL COL {labelAddress.put($e.text, new Integer(i));}
	| BRANCH e=LABEL {code[i++] = BRANCH;
			  labels.addElement($e.text);
			  addresses.addElement(new Integer(i));
			  i++;}
	| BRANCHEQ e=LABEL {code[i++] = BRANCHEQ;
			    labels.addElement($e.text);
			    addresses.addElement(new Integer(i));
		            i++;}
	| BRANCHLESS e=LABEL {code[i++] = BRANCHLESS;
			      labels.addElement($e.text);
			      addresses.addElement(new Integer(i));
		              i++;}
	| JAL e=LABEL { code[i++] = JAL;
			labels.addElement($e.text);
		 	addresses.addElement(new Integer(i));
		        i++; }	
	| JRA { code[i++] = JRA; }		                      
	| PRINT {code[i++] = PRINT;}
	| HALT {code[i++] = HALT;}
	)* { for (int ind=0; ind<labels.size(); ind++) {
        	Integer t = (Integer) labelAddress.get(labels.get(ind));
        	Integer a = (Integer) addresses.get(ind);
        	code[a.intValue()] = t.intValue();
             }     
           }
        ;
	 	
// lexer 

PUSH 	: 'push';
POP	: 'pop';
ADD	: 'add';
SUB	: 'sub';
LOADW	: 'lw';
STOREW	: 'sw';
LOADFP  : 'lfp';
STOREFP : 'sfp';
LOADSP  : 'lsp';
STORESP : 'ssp';
LOADHP  : 'lhp';
STOREHP : 'shp';
LOADRA  : 'lra';
STORERA : 'sra';
LOADRV  : 'lrv';
STORERV : 'srv';
BRANCH	: 'b' ;
BRANCHEQ: 'beq' ;
BRANCHLESS
	: 'bless' ;	
JAL	: 'jal' ;	
JRA	: 'jra' ;	 
PRINT	: 'print' ;
HALT	: 'halt' ;
COL	: ':' ;
NUMBER  : '0' | ('-')?(('1'..'9')('0'..'9')*) ;
LABEL	: ('a'..'z' | 'A'..'Z')
          ('0'..'9' | 'a'..'z' | 'A'..'Z')* ;
WHITESP : ( '\t' | ' ' | '\r' | '\n' )+ { skip(); } ; 

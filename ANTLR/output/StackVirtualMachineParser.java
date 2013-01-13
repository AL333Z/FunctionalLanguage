// $ANTLR 3.2 Sep 23, 2009 12:02:23 S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g 2012-12-14 16:30:20

import java.util.HashMap;
import java.util.Vector;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class StackVirtualMachineParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PUSH", "NUMBER", "POP", "ADD", "SUB", "LOADW", "STOREW", "LOADFP", "STOREFP", "LOADSP", "STORESP", "LOADHP", "STOREHP", "LOADRA", "STORERA", "LOADRV", "STORERV", "LABEL", "COL", "BRANCH", "BRANCHEQ", "BRANCHLESS", "JAL", "JRA", "PRINT", "HALT", "WHITESP"
    };
    public static final int JAL=26;
    public static final int HALT=29;
    public static final int BRANCHEQ=24;
    public static final int STORESP=14;
    public static final int NUMBER=5;
    public static final int LOADSP=13;
    public static final int SUB=8;
    public static final int LOADW=9;
    public static final int STORERV=20;
    public static final int WHITESP=30;
    public static final int EOF=-1;
    public static final int PRINT=28;
    public static final int PUSH=4;
    public static final int LOADRA=17;
    public static final int STOREW=10;
    public static final int LOADRV=19;
    public static final int LOADFP=11;
    public static final int STORERA=18;
    public static final int STOREFP=12;
    public static final int LABEL=21;
    public static final int JRA=27;
    public static final int STOREHP=16;
    public static final int BRANCHLESS=25;
    public static final int POP=6;
    public static final int COL=22;
    public static final int BRANCH=23;
    public static final int LOADHP=15;
    public static final int ADD=7;

    // delegates
    // delegators


        public StackVirtualMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public StackVirtualMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return StackVirtualMachineParser.tokenNames; }
    public String getGrammarFileName() { return "S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g"; }



    private int[] code = new int[10000];
    private int i = 0;
    private HashMap labelAddress = new HashMap();
    private Vector labels = new Vector();
    private Vector addresses = new Vector();

    public int[] createCode() throws Exception {
    	assembly();
    	return code;
    }




    // $ANTLR start "assembly"
    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:25:1: assembly : ( PUSH e= NUMBER | POP | ADD | SUB | LOADW | STOREW | LOADFP | STOREFP | LOADSP | STORESP | LOADHP | STOREHP | LOADRA | STORERA | LOADRV | STORERV | e= LABEL COL | BRANCH e= LABEL | BRANCHEQ e= LABEL | BRANCHLESS e= LABEL | JAL e= LABEL | JRA | PRINT | HALT )* ;
    public final void assembly() throws RecognitionException {
        Token e=null;

        try {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:25:9: ( ( PUSH e= NUMBER | POP | ADD | SUB | LOADW | STOREW | LOADFP | STOREFP | LOADSP | STORESP | LOADHP | STOREHP | LOADRA | STORERA | LOADRV | STORERV | e= LABEL COL | BRANCH e= LABEL | BRANCHEQ e= LABEL | BRANCHLESS e= LABEL | JAL e= LABEL | JRA | PRINT | HALT )* )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:26:2: ( PUSH e= NUMBER | POP | ADD | SUB | LOADW | STOREW | LOADFP | STOREFP | LOADSP | STORESP | LOADHP | STOREHP | LOADRA | STORERA | LOADRV | STORERV | e= LABEL COL | BRANCH e= LABEL | BRANCHEQ e= LABEL | BRANCHLESS e= LABEL | JAL e= LABEL | JRA | PRINT | HALT )*
            {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:26:2: ( PUSH e= NUMBER | POP | ADD | SUB | LOADW | STOREW | LOADFP | STOREFP | LOADSP | STORESP | LOADHP | STOREHP | LOADRA | STORERA | LOADRV | STORERV | e= LABEL COL | BRANCH e= LABEL | BRANCHEQ e= LABEL | BRANCHLESS e= LABEL | JAL e= LABEL | JRA | PRINT | HALT )*
            loop1:
            do {
                int alt1=25;
                switch ( input.LA(1) ) {
                case PUSH:
                    {
                    alt1=1;
                    }
                    break;
                case POP:
                    {
                    alt1=2;
                    }
                    break;
                case ADD:
                    {
                    alt1=3;
                    }
                    break;
                case SUB:
                    {
                    alt1=4;
                    }
                    break;
                case LOADW:
                    {
                    alt1=5;
                    }
                    break;
                case STOREW:
                    {
                    alt1=6;
                    }
                    break;
                case LOADFP:
                    {
                    alt1=7;
                    }
                    break;
                case STOREFP:
                    {
                    alt1=8;
                    }
                    break;
                case LOADSP:
                    {
                    alt1=9;
                    }
                    break;
                case STORESP:
                    {
                    alt1=10;
                    }
                    break;
                case LOADHP:
                    {
                    alt1=11;
                    }
                    break;
                case STOREHP:
                    {
                    alt1=12;
                    }
                    break;
                case LOADRA:
                    {
                    alt1=13;
                    }
                    break;
                case STORERA:
                    {
                    alt1=14;
                    }
                    break;
                case LOADRV:
                    {
                    alt1=15;
                    }
                    break;
                case STORERV:
                    {
                    alt1=16;
                    }
                    break;
                case LABEL:
                    {
                    alt1=17;
                    }
                    break;
                case BRANCH:
                    {
                    alt1=18;
                    }
                    break;
                case BRANCHEQ:
                    {
                    alt1=19;
                    }
                    break;
                case BRANCHLESS:
                    {
                    alt1=20;
                    }
                    break;
                case JAL:
                    {
                    alt1=21;
                    }
                    break;
                case JRA:
                    {
                    alt1=22;
                    }
                    break;
                case PRINT:
                    {
                    alt1=23;
                    }
                    break;
                case HALT:
                    {
                    alt1=24;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:26:4: PUSH e= NUMBER
            	    {
            	    match(input,PUSH,FOLLOW_PUSH_in_assembly24); 
            	    e=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_assembly28); 
            	    code[i++] = PUSH;
            	    		 	 code[i++] = Integer.parseInt((e!=null?e.getText():null));

            	    }
            	    break;
            	case 2 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:28:4: POP
            	    {
            	    match(input,POP,FOLLOW_POP_in_assembly35); 
            	    code[i++] = POP;

            	    }
            	    break;
            	case 3 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:29:4: ADD
            	    {
            	    match(input,ADD,FOLLOW_ADD_in_assembly42); 
            	    code[i++] = ADD;

            	    }
            	    break;
            	case 4 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:30:4: SUB
            	    {
            	    match(input,SUB,FOLLOW_SUB_in_assembly49); 
            	    code[i++] = SUB;

            	    }
            	    break;
            	case 5 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:31:4: LOADW
            	    {
            	    match(input,LOADW,FOLLOW_LOADW_in_assembly56); 
            	    code[i++] = LOADW;

            	    }
            	    break;
            	case 6 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:32:4: STOREW
            	    {
            	    match(input,STOREW,FOLLOW_STOREW_in_assembly63); 
            	    code[i++] = STOREW;

            	    }
            	    break;
            	case 7 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:33:4: LOADFP
            	    {
            	    match(input,LOADFP,FOLLOW_LOADFP_in_assembly70); 
            	    code[i++] = LOADFP;

            	    }
            	    break;
            	case 8 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:34:4: STOREFP
            	    {
            	    match(input,STOREFP,FOLLOW_STOREFP_in_assembly77); 
            	    code[i++] = STOREFP;

            	    }
            	    break;
            	case 9 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:35:4: LOADSP
            	    {
            	    match(input,LOADSP,FOLLOW_LOADSP_in_assembly85); 
            	    code[i++] = LOADSP;

            	    }
            	    break;
            	case 10 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:36:4: STORESP
            	    {
            	    match(input,STORESP,FOLLOW_STORESP_in_assembly92); 
            	    code[i++] = STORESP;

            	    }
            	    break;
            	case 11 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:37:4: LOADHP
            	    {
            	    match(input,LOADHP,FOLLOW_LOADHP_in_assembly100); 
            	    code[i++] = LOADHP;

            	    }
            	    break;
            	case 12 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:38:4: STOREHP
            	    {
            	    match(input,STOREHP,FOLLOW_STOREHP_in_assembly107); 
            	    code[i++] = STOREHP;

            	    }
            	    break;
            	case 13 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:39:4: LOADRA
            	    {
            	    match(input,LOADRA,FOLLOW_LOADRA_in_assembly115); 
            	    code[i++] = LOADRA;

            	    }
            	    break;
            	case 14 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:40:4: STORERA
            	    {
            	    match(input,STORERA,FOLLOW_STORERA_in_assembly122); 
            	    code[i++] = STORERA;

            	    }
            	    break;
            	case 15 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:41:4: LOADRV
            	    {
            	    match(input,LOADRV,FOLLOW_LOADRV_in_assembly131); 
            	    code[i++] = LOADRV;

            	    }
            	    break;
            	case 16 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:42:4: STORERV
            	    {
            	    match(input,STORERV,FOLLOW_STORERV_in_assembly138); 
            	    code[i++] = STORERV;

            	    }
            	    break;
            	case 17 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:43:4: e= LABEL COL
            	    {
            	    e=(Token)match(input,LABEL,FOLLOW_LABEL_in_assembly148); 
            	    match(input,COL,FOLLOW_COL_in_assembly150); 
            	    labelAddress.put((e!=null?e.getText():null), new Integer(i));

            	    }
            	    break;
            	case 18 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:44:4: BRANCH e= LABEL
            	    {
            	    match(input,BRANCH,FOLLOW_BRANCH_in_assembly157); 
            	    e=(Token)match(input,LABEL,FOLLOW_LABEL_in_assembly161); 
            	    code[i++] = BRANCH;
            	    			  labels.addElement((e!=null?e.getText():null));
            	    			  addresses.addElement(new Integer(i));
            	    			  i++;

            	    }
            	    break;
            	case 19 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:48:4: BRANCHEQ e= LABEL
            	    {
            	    match(input,BRANCHEQ,FOLLOW_BRANCHEQ_in_assembly168); 
            	    e=(Token)match(input,LABEL,FOLLOW_LABEL_in_assembly172); 
            	    code[i++] = BRANCHEQ;
            	    			    labels.addElement((e!=null?e.getText():null));
            	    			    addresses.addElement(new Integer(i));
            	    		            i++;

            	    }
            	    break;
            	case 20 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:52:4: BRANCHLESS e= LABEL
            	    {
            	    match(input,BRANCHLESS,FOLLOW_BRANCHLESS_in_assembly179); 
            	    e=(Token)match(input,LABEL,FOLLOW_LABEL_in_assembly183); 
            	    code[i++] = BRANCHLESS;
            	    			      labels.addElement((e!=null?e.getText():null));
            	    			      addresses.addElement(new Integer(i));
            	    		              i++;

            	    }
            	    break;
            	case 21 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:56:4: JAL e= LABEL
            	    {
            	    match(input,JAL,FOLLOW_JAL_in_assembly190); 
            	    e=(Token)match(input,LABEL,FOLLOW_LABEL_in_assembly194); 
            	     code[i++] = JAL;
            	    			labels.addElement((e!=null?e.getText():null));
            	    		 	addresses.addElement(new Integer(i));
            	    		        i++; 

            	    }
            	    break;
            	case 22 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:60:4: JRA
            	    {
            	    match(input,JRA,FOLLOW_JRA_in_assembly202); 
            	     code[i++] = JRA; 

            	    }
            	    break;
            	case 23 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:61:4: PRINT
            	    {
            	    match(input,PRINT,FOLLOW_PRINT_in_assembly233); 
            	    code[i++] = PRINT;

            	    }
            	    break;
            	case 24 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:62:4: HALT
            	    {
            	    match(input,HALT,FOLLOW_HALT_in_assembly240); 
            	    code[i++] = HALT;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             for (int ind=0; ind<labels.size(); ind++) {
                    	Integer t = (Integer) labelAddress.get(labels.get(ind));
                    	Integer a = (Integer) addresses.get(ind);
                    	code[a.intValue()] = t.intValue();
                         }     
                       

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assembly"

    // Delegated rules


 

    public static final BitSet FOLLOW_PUSH_in_assembly24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_NUMBER_in_assembly28 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_POP_in_assembly35 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_ADD_in_assembly42 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_SUB_in_assembly49 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_LOADW_in_assembly56 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_STOREW_in_assembly63 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_LOADFP_in_assembly70 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_STOREFP_in_assembly77 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_LOADSP_in_assembly85 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_STORESP_in_assembly92 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_LOADHP_in_assembly100 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_STOREHP_in_assembly107 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_LOADRA_in_assembly115 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_STORERA_in_assembly122 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_LOADRV_in_assembly131 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_STORERV_in_assembly138 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_LABEL_in_assembly148 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_COL_in_assembly150 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_BRANCH_in_assembly157 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LABEL_in_assembly161 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_BRANCHEQ_in_assembly168 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LABEL_in_assembly172 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_BRANCHLESS_in_assembly179 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LABEL_in_assembly183 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_JAL_in_assembly190 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LABEL_in_assembly194 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_JRA_in_assembly202 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_PRINT_in_assembly233 = new BitSet(new long[]{0x000000003FBFFFD2L});
    public static final BitSet FOLLOW_HALT_in_assembly240 = new BitSet(new long[]{0x000000003FBFFFD2L});

}
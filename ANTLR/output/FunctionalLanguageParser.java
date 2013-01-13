// $ANTLR 3.2 Sep 23, 2009 12:02:23 S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g 2012-12-14 16:53:26


import java.util.HashMap;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FunctionalLanguageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SEMIC", "DEF", "ID", "ASS", "LPAR", "COMMA", "RPAR", "PRINT", "PLUS", "MINUS", "OR", "AND", "NUMBER", "TRUE", "FALSE", "EMPTY", "NOT", "LSPAR", "RSPAR", "EQUAL", "LESS", "GREATER", "DOT", "FIRST", "REST", "IF", "THEN", "ELSE", "WHITESP", "COMMENT"
    };
    public static final int DEF=5;
    public static final int REST=28;
    public static final int ELSE=31;
    public static final int NUMBER=16;
    public static final int LSPAR=21;
    public static final int NOT=20;
    public static final int MINUS=13;
    public static final int ID=6;
    public static final int AND=15;
    public static final int WHITESP=32;
    public static final int EOF=-1;
    public static final int TRUE=17;
    public static final int PRINT=11;
    public static final int IF=29;
    public static final int EMPTY=19;
    public static final int GREATER=25;
    public static final int THEN=30;
    public static final int LPAR=8;
    public static final int COMMA=9;
    public static final int EQUAL=23;
    public static final int OR=14;
    public static final int LESS=24;
    public static final int RSPAR=22;
    public static final int RPAR=10;
    public static final int PLUS=12;
    public static final int ASS=7;
    public static final int COMMENT=33;
    public static final int DOT=26;
    public static final int SEMIC=4;
    public static final int FALSE=18;
    public static final int FIRST=27;

    // delegates
    // delegators


        public FunctionalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FunctionalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FunctionalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g"; }



    private int staticData = 0;
    private int labelCounter = 0;
    private int parameterCounter = 0;
    private HashMap symTable = new HashMap();
    private HashMap localSymTable = new HashMap();
    private final static int TRUEVALUE = 1;
    private final static int FALSEVALUE = 0;
    private final static int EMPTYVALUE = -1;
    private String functionCode = new String();




    // $ANTLR start "prog"
    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:25:1: prog returns [String code] : c= command SEMIC (d= command SEMIC )* ;
    public final String prog() throws RecognitionException {
        String code = null;

        String c = null;

        String d = null;


        try {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:26:9: (c= command SEMIC (d= command SEMIC )* )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:26:11: c= command SEMIC (d= command SEMIC )*
            {
            pushFollow(FOLLOW_command_in_prog38);
            c=command();

            state._fsp--;

            match(input,SEMIC,FOLLOW_SEMIC_in_prog40); 
            code = c+"\n";
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:27:5: (d= command SEMIC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEF||LA1_0==PRINT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:27:6: d= command SEMIC
            	    {
            	    pushFollow(FOLLOW_command_in_prog51);
            	    d=command();

            	    state._fsp--;

            	    match(input,SEMIC,FOLLOW_SEMIC_in_prog53); 
            	    code += d+"\n";

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            code+="\thalt\n"+functionCode;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return code;
    }
    // $ANTLR end "prog"


    // $ANTLR start "command"
    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:31:1: command returns [String code] : ( DEF i= ID ( ASS e= expr | LPAR (j= ID ( COMMA j= ID )* )? RPAR ASS e= expr ) | PRINT e= expr );
    public final String command() throws RecognitionException {
        String code = null;

        Token i=null;
        Token j=null;
        String e = null;


        try {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:32:9: ( DEF i= ID ( ASS e= expr | LPAR (j= ID ( COMMA j= ID )* )? RPAR ASS e= expr ) | PRINT e= expr )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DEF) ) {
                alt5=1;
            }
            else if ( (LA5_0==PRINT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:32:11: DEF i= ID ( ASS e= expr | LPAR (j= ID ( COMMA j= ID )* )? RPAR ASS e= expr )
                    {
                    match(input,DEF,FOLLOW_DEF_in_command92); 
                    i=(Token)match(input,ID,FOLLOW_ID_in_command96); 
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:33:11: ( ASS e= expr | LPAR (j= ID ( COMMA j= ID )* )? RPAR ASS e= expr )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ASS) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==LPAR) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:33:13: ASS e= expr
                            {
                            match(input,ASS,FOLLOW_ASS_in_command111); 
                            pushFollow(FOLLOW_expr_in_command115);
                            e=expr();

                            state._fsp--;


                                        symTable.put((i!=null?i.getText():null),new Integer(staticData));
                                        code = e+"\tpush "+(staticData++)+"\n"+"\tsw\n";

                            }
                            break;
                        case 2 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:36:13: LPAR (j= ID ( COMMA j= ID )* )? RPAR ASS e= expr
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_command131); 
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:36:18: (j= ID ( COMMA j= ID )* )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==ID) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:37:13: j= ID ( COMMA j= ID )*
                                    {
                                    j=(Token)match(input,ID,FOLLOW_ID_in_command150); 
                                    localSymTable.put((j!=null?j.getText():null),new Integer(parameterCounter++));
                                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:39:13: ( COMMA j= ID )*
                                    loop2:
                                    do {
                                        int alt2=2;
                                        int LA2_0 = input.LA(1);

                                        if ( (LA2_0==COMMA) ) {
                                            alt2=1;
                                        }


                                        switch (alt2) {
                                    	case 1 :
                                    	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:39:14: COMMA j= ID
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_command180); 
                                    	    j=(Token)match(input,ID,FOLLOW_ID_in_command184); 
                                    	    localSymTable.put((j!=null?j.getText():null),new Integer(parameterCounter++));

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop2;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            match(input,RPAR,FOLLOW_RPAR_in_command221); 
                            match(input,ASS,FOLLOW_ASS_in_command223); 
                            pushFollow(FOLLOW_expr_in_command227);
                            e=expr();

                            state._fsp--;

                            String removePar = "";
                                         for(int c=0; c<parameterCounter; c++)
                                           removePar+="\tpop\n";
                                         functionCode+=(i!=null?i.getText():null)+":\n"+
                                                        "\tlsp\n"+
                                                        "\tsfp\n"+
                                                        "\tlra\n"+
                                                        e+
                                                        "\tsrv\n"+
                                                        "\tsra\n"+
                                                        removePar+  
                                                        "\tsfp\n"+
                                                        "\tlrv\n"+
                                                        "\tjra\n";
                                          code ="";
                                          parameterCounter=0;
                                          localSymTable=new HashMap();             
                                         

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:61:11: PRINT e= expr
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_command267); 
                    pushFollow(FOLLOW_expr_in_command271);
                    e=expr();

                    state._fsp--;

                    code = e+"\tprint\n";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return code;
    }
    // $ANTLR end "command"


    // $ANTLR start "expr"
    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:64:1: expr returns [String code] : t= term ( PLUS t= term | MINUS t= term | OR t= term )* ;
    public final String expr() throws RecognitionException {
        String code = null;

        String t = null;


        try {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:65:2: (t= term ( PLUS t= term | MINUS t= term | OR t= term )* )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:65:4: t= term ( PLUS t= term | MINUS t= term | OR t= term )*
            {
            pushFollow(FOLLOW_term_in_expr309);
            t=term();

            state._fsp--;

            code = t;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:66:11: ( PLUS t= term | MINUS t= term | OR t= term )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt6=1;
                    }
                    break;
                case MINUS:
                    {
                    alt6=2;
                    }
                    break;
                case OR:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:66:13: PLUS t= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_expr325); 
            	    pushFollow(FOLLOW_term_in_expr329);
            	    t=term();

            	    state._fsp--;

            	    code+=t+"\tadd\n";

            	    }
            	    break;
            	case 2 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:67:13: MINUS t= term
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_expr345); 
            	    pushFollow(FOLLOW_term_in_expr349);
            	    t=term();

            	    state._fsp--;

            	    code =t+code+"\tsub\n";

            	    }
            	    break;
            	case 3 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:68:13: OR t= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_expr365); 
            	    pushFollow(FOLLOW_term_in_expr369);
            	    t=term();

            	    state._fsp--;

            	    code = code+
            	                	     "\tpush "+TRUEVALUE+"\n"+
            	                	     "\tbeq label"+labelCounter+"\n"+
            	                	     t+
            	                	     "\tpush "+TRUEVALUE+"\n"+
            	                	     "\tbeq label"+(labelCounter++)+"\n"+
            	                	     "\tpush "+FALSEVALUE+"\n"+
            	                	     "\tb label"+(labelCounter++)+"\n"+
            	                	     "label"+(labelCounter-2)+":\n"+
            	                	     "\tpush "+TRUEVALUE+"\n"+
            	                	     "label"+(labelCounter-1)+":\n";

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return code;
    }
    // $ANTLR end "expr"


    // $ANTLR start "term"
    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:83:1: term returns [String code] : f= factor ( AND f= factor )* ;
    public final String term() throws RecognitionException {
        String code = null;

        String f = null;


        try {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:84:9: (f= factor ( AND f= factor )* )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:84:11: f= factor ( AND f= factor )*
            {
            pushFollow(FOLLOW_factor_in_term457);
            f=factor();

            state._fsp--;

            code =f;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:85:11: ( AND f= factor )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==AND) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:85:12: AND f= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term473); 
            	    pushFollow(FOLLOW_factor_in_term477);
            	    f=factor();

            	    state._fsp--;

            	    code = code+
            	                	        "\tpush "+FALSEVALUE+"\n"+
            	                	        "\tbeq label"+labelCounter+"\n"+
            	                	        f+
            	                	        "\tpush "+FALSEVALUE+"\n"+
            	                	        "\tbeq label"+(labelCounter++)+"\n"+
            	                	        "\tpush "+TRUEVALUE+"\n"+
            	                	        "\tb label"+(labelCounter++)+"\n"+
            	                	        "label"+(labelCounter-2)+":\n"+
            	                	        "\tpush "+FALSEVALUE+"\n"+
            	                	        "label"+(labelCounter-1)+":\n";

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return code;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:100:1: factor returns [String code] : (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR | i= ID ( | LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr );
    public final String factor() throws RecognitionException {
        String code = null;

        Token n=null;
        Token i=null;
        String e = null;

        String f = null;

        String e2 = null;

        String e1 = null;

        String e3 = null;


        try {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:101:3: (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR | i= ID ( | LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr )
            int alt13=9;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt13=1;
                }
                break;
            case TRUE:
                {
                alt13=2;
                }
                break;
            case FALSE:
                {
                alt13=3;
                }
                break;
            case EMPTY:
                {
                alt13=4;
                }
                break;
            case NOT:
                {
                alt13=5;
                }
                break;
            case LSPAR:
                {
                alt13=6;
                }
                break;
            case ID:
                {
                alt13=7;
                }
                break;
            case LPAR:
                {
                alt13=8;
                }
                break;
            case IF:
                {
                alt13=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:101:5: n= NUMBER
                    {
                    n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor526); 
                    code = "\tpush "+(n!=null?n.getText():null)+"\n";

                    }
                    break;
                case 2 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:102:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_factor534); 
                    code = "\tpush "+TRUEVALUE+"\n";

                    }
                    break;
                case 3 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:103:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_factor542); 
                    code = "\tpush "+FALSEVALUE+"\n";

                    }
                    break;
                case 4 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:104:5: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_factor550); 
                    code = "\tpush "+EMPTYVALUE+"\n";

                    }
                    break;
                case 5 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:105:5: NOT e= expr
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor558); 
                    pushFollow(FOLLOW_expr_in_factor562);
                    e=expr();

                    state._fsp--;

                    code = e+
                                	   "\tpush "+TRUEVALUE+"\n"+
                                	   "\tbeq label"+(labelCounter++)+"\n"+
                                	   "\tpush "+TRUEVALUE+"\n"+
                                	   "\tb label"+(labelCounter++)+"\n"+
                                	   "label"+(labelCounter-2)+":\n"+
                                	   "\tpush "+FALSEVALUE+"\n"+
                                	   "label"+(labelCounter-1)+":\n";

                    }
                    break;
                case 6 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:114:11: LSPAR e= expr COMMA f= expr RSPAR
                    {
                    match(input,LSPAR,FOLLOW_LSPAR_in_factor580); 
                    pushFollow(FOLLOW_expr_in_factor584);
                    e=expr();

                    state._fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_factor586); 
                    pushFollow(FOLLOW_expr_in_factor590);
                    f=expr();

                    state._fsp--;

                    match(input,RSPAR,FOLLOW_RSPAR_in_factor592); 
                    code = f+
                                       e+
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
                    break;
                case 7 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:129:11: i= ID ( | LPAR (e= expr ( COMMA f= expr )* )? RPAR )
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_factor618); 
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:130:11: ( | LPAR (e= expr ( COMMA f= expr )* )? RPAR )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==SEMIC||(LA10_0>=COMMA && LA10_0<=RPAR)||(LA10_0>=PLUS && LA10_0<=AND)||(LA10_0>=RSPAR && LA10_0<=DOT)||(LA10_0>=THEN && LA10_0<=ELSE)) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==LPAR) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:130:13: 
                            {
                            Integer value = (Integer)localSymTable.get((i!=null?i.getText():null));
                                         if (value == null) {
                                     	code = "\tpush "+
                                                    (Integer)symTable.get((i!=null?i.getText():null))+"\n"+
                                                    "\tlw\n"; 
                                         } else {
                                            code = "\tlfp\n"+
                                                    "\tpush "+value.toString()+"\n"+
                                                    "\tadd\n"+
                                                    "\tlw\n";
                                         }
                                        

                            }
                            break;
                        case 2 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:143:13: LPAR (e= expr ( COMMA f= expr )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_factor659); 
                            code = "";
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:144:17: (e= expr ( COMMA f= expr )* )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==ID||LA9_0==LPAR||(LA9_0>=NUMBER && LA9_0<=LSPAR)||LA9_0==IF) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:144:18: e= expr ( COMMA f= expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_factor682);
                                    e=expr();

                                    state._fsp--;

                                    code = e;
                                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:145:19: ( COMMA f= expr )*
                                    loop8:
                                    do {
                                        int alt8=2;
                                        int LA8_0 = input.LA(1);

                                        if ( (LA8_0==COMMA) ) {
                                            alt8=1;
                                        }


                                        switch (alt8) {
                                    	case 1 :
                                    	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:145:20: COMMA f= expr
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_factor705); 
                                    	    pushFollow(FOLLOW_expr_in_factor709);
                                    	    f=expr();

                                    	    state._fsp--;

                                    	    code = f+code;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop8;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            match(input,RPAR,FOLLOW_RPAR_in_factor731); 
                            code = "\tlfp\n"+code+"\tjal "+(i!=null?i.getText():null)+"\n";

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:148:11: LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_factor773); 
                    pushFollow(FOLLOW_expr_in_factor777);
                    e=expr();

                    state._fsp--;

                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:149:11: ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
                    int alt12=5;
                    switch ( input.LA(1) ) {
                    case RPAR:
                        {
                        alt12=1;
                        }
                        break;
                    case EQUAL:
                        {
                        alt12=2;
                        }
                        break;
                    case LESS:
                        {
                        alt12=3;
                        }
                        break;
                    case GREATER:
                        {
                        alt12=4;
                        }
                        break;
                    case DOT:
                        {
                        alt12=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:149:13: RPAR
                            {
                            match(input,RPAR,FOLLOW_RPAR_in_factor792); 
                            code = e;

                            }
                            break;
                        case 2 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:150:13: EQUAL e2= expr RPAR
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_factor808); 
                            pushFollow(FOLLOW_expr_in_factor812);
                            e2=expr();

                            state._fsp--;

                            match(input,RPAR,FOLLOW_RPAR_in_factor814); 
                            code = e2+e+
                                               "\tbeq label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";

                            }
                            break;
                        case 3 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:158:13: LESS e2= expr RPAR
                            {
                            match(input,LESS,FOLLOW_LESS_in_factor843); 
                            pushFollow(FOLLOW_expr_in_factor847);
                            e2=expr();

                            state._fsp--;

                            match(input,RPAR,FOLLOW_RPAR_in_factor849); 
                            code = e2+e+
                                               "\tbless label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";

                            }
                            break;
                        case 4 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:166:13: GREATER e2= expr RPAR
                            {
                            match(input,GREATER,FOLLOW_GREATER_in_factor881); 
                            pushFollow(FOLLOW_expr_in_factor885);
                            e2=expr();

                            state._fsp--;

                            match(input,RPAR,FOLLOW_RPAR_in_factor887); 
                            code = e+e2+
                                               "\tbless label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";

                            }
                            break;
                        case 5 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:174:13: DOT ( FIRST | REST ) RPAR
                            {
                            match(input,DOT,FOLLOW_DOT_in_factor920); 
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:175:13: ( FIRST | REST )
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==FIRST) ) {
                                alt11=1;
                            }
                            else if ( (LA11_0==REST) ) {
                                alt11=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 0, input);

                                throw nvae;
                            }
                            switch (alt11) {
                                case 1 :
                                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:175:15: FIRST
                                    {
                                    match(input,FIRST,FOLLOW_FIRST_in_factor937); 
                                    code = e+"\tlw\n";

                                    }
                                    break;
                                case 2 :
                                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:176:15: REST
                                    {
                                    match(input,REST,FOLLOW_REST_in_factor956); 
                                    code = e+
                                                                 "\tpush 1"+
                                                                 "\tadd\n"+
                                                                 "\tlw\n";

                                    }
                                    break;

                            }

                            match(input,RPAR,FOLLOW_RPAR_in_factor975); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:182:11: IF e1= expr THEN e2= expr ELSE e3= expr
                    {
                    match(input,IF,FOLLOW_IF_in_factor1011); 
                    pushFollow(FOLLOW_expr_in_factor1015);
                    e1=expr();

                    state._fsp--;

                    match(input,THEN,FOLLOW_THEN_in_factor1017); 
                    pushFollow(FOLLOW_expr_in_factor1021);
                    e2=expr();

                    state._fsp--;

                    match(input,ELSE,FOLLOW_ELSE_in_factor1023); 
                    pushFollow(FOLLOW_expr_in_factor1027);
                    e3=expr();

                    state._fsp--;

                    code = e1+
                                       "\tpush "+TRUEVALUE+"\n"+ 
                                       "\tbeq label"+(labelCounter++)+"\n"+
                              	   e3+
                              	   "\tb label"+(labelCounter++)+"\n"+
                              	   "label"+(labelCounter-2)+":\n"+
                              	   e2+
                              	   "label"+(labelCounter-1)+":\n";

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return code;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_command_in_prog38 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMIC_in_prog40 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_command_in_prog51 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMIC_in_prog53 = new BitSet(new long[]{0x0000000000000822L});
    public static final BitSet FOLLOW_DEF_in_command92 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_command96 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ASS_in_command111 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_command115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_command131 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_ID_in_command150 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_COMMA_in_command180 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_command184 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RPAR_in_command221 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASS_in_command223 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_command227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_command267 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_command271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr309 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_PLUS_in_expr325 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_term_in_expr329 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_MINUS_in_expr345 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_term_in_expr349 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_OR_in_expr365 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_term_in_expr369 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_factor_in_term457 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_AND_in_term473 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_factor_in_term477 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_NUMBER_in_factor526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factor534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factor542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_factor550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor558 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSPAR_in_factor580 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor584 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_factor586 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor590 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RSPAR_in_factor592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor618 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_LPAR_in_factor659 = new BitSet(new long[]{0x00000000203F0540L});
    public static final BitSet FOLLOW_expr_in_factor682 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_COMMA_in_factor705 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor709 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_RPAR_in_factor731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_factor773 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor777 = new BitSet(new long[]{0x0000000007800400L});
    public static final BitSet FOLLOW_RPAR_in_factor792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_factor808 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor812 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RPAR_in_factor814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_factor843 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor847 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RPAR_in_factor849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_factor881 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor885 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RPAR_in_factor887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_factor920 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_FIRST_in_factor937 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_REST_in_factor956 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RPAR_in_factor975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_factor1011 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor1015 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_THEN_in_factor1017 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor1021 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ELSE_in_factor1023 = new BitSet(new long[]{0x00000000203F0140L});
    public static final BitSet FOLLOW_expr_in_factor1027 = new BitSet(new long[]{0x0000000000000002L});

}
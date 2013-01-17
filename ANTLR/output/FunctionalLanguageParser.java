// $ANTLR 3.4 /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g 2013-01-17 23:15:10


import java.util.HashMap;
import com.al333z.typechecking.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FunctionalLanguageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASS", "BOOL", "COMMA", "COMMENT", "DEF", "DOT", "ELSE", "EMPTY", "EQUAL", "FALSE", "FIRST", "GREATER", "ID", "IF", "INT", "LESS", "LISTOF", "LPAR", "LSPAR", "MINUS", "NOT", "NUMBER", "OR", "PLUS", "PRINT", "REST", "RPAR", "RSPAR", "SEMIC", "THEN", "TRUE", "WHITESP"
    };

    public static final int EOF=-1;
    public static final int AND=4;
    public static final int ASS=5;
    public static final int BOOL=6;
    public static final int COMMA=7;
    public static final int COMMENT=8;
    public static final int DEF=9;
    public static final int DOT=10;
    public static final int ELSE=11;
    public static final int EMPTY=12;
    public static final int EQUAL=13;
    public static final int FALSE=14;
    public static final int FIRST=15;
    public static final int GREATER=16;
    public static final int ID=17;
    public static final int IF=18;
    public static final int INT=19;
    public static final int LESS=20;
    public static final int LISTOF=21;
    public static final int LPAR=22;
    public static final int LSPAR=23;
    public static final int MINUS=24;
    public static final int NOT=25;
    public static final int NUMBER=26;
    public static final int OR=27;
    public static final int PLUS=28;
    public static final int PRINT=29;
    public static final int REST=30;
    public static final int RPAR=31;
    public static final int RSPAR=32;
    public static final int SEMIC=33;
    public static final int THEN=34;
    public static final int TRUE=35;
    public static final int WHITESP=36;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FunctionalLanguageParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FunctionalLanguageParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return FunctionalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g"; }



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
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:27:1: prog returns [String code] : c= command SEMIC (d= command SEMIC )* ;
    public final String prog() throws RecognitionException {
        String code = null;


        String c =null;

        String d =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:28:10: (c= command SEMIC (d= command SEMIC )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:28:12: c= command SEMIC (d= command SEMIC )*
            {
            pushFollow(FOLLOW_command_in_prog39);
            c=command();

            state._fsp--;


            match(input,SEMIC,FOLLOW_SEMIC_in_prog41); 

            code = c+"\n";

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:29:3: (d= command SEMIC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEF||LA1_0==PRINT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:29:4: d= command SEMIC
            	    {
            	    pushFollow(FOLLOW_command_in_prog50);
            	    d=command();

            	    state._fsp--;


            	    match(input,SEMIC,FOLLOW_SEMIC_in_prog52); 

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
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "prog"



    // $ANTLR start "type"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:33:1: type : ( INT | BOOL | ( LISTOF LSPAR type RSPAR ) );
    public final void type() throws RecognitionException {
        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:34:2: ( INT | BOOL | ( LISTOF LSPAR type RSPAR ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt2=1;
                }
                break;
            case BOOL:
                {
                alt2=2;
                }
                break;
            case LISTOF:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:34:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_type77); 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:35:4: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_type82); 

                    }
                    break;
                case 3 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:36:4: ( LISTOF LSPAR type RSPAR )
                    {
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:36:4: ( LISTOF LSPAR type RSPAR )
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:36:5: LISTOF LSPAR type RSPAR
                    {
                    match(input,LISTOF,FOLLOW_LISTOF_in_type88); 

                    match(input,LSPAR,FOLLOW_LSPAR_in_type90); 

                    pushFollow(FOLLOW_type_in_type92);
                    type();

                    state._fsp--;


                    match(input,RSPAR,FOLLOW_RSPAR_in_type94); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "type"



    // $ANTLR start "command"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:39:1: command returns [String code] : ( DEF type i= ID ( ASS e= expr | LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr ) | PRINT e= expr );
    public final String command() throws RecognitionException {
        String code = null;


        Token i=null;
        Token j=null;
        String e =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:40:2: ( DEF type i= ID ( ASS e= expr | LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr ) | PRINT e= expr )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==DEF) ) {
                alt6=1;
            }
            else if ( (LA6_0==PRINT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:40:4: DEF type i= ID ( ASS e= expr | LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr )
                    {
                    match(input,DEF,FOLLOW_DEF_in_command116); 

                    pushFollow(FOLLOW_type_in_command118);
                    type();

                    state._fsp--;


                    i=(Token)match(input,ID,FOLLOW_ID_in_command122); 

                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:41:12: ( ASS e= expr | LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ASS) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==LPAR) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:41:14: ASS e= expr
                            {
                            match(input,ASS,FOLLOW_ASS_in_command140); 

                            pushFollow(FOLLOW_expr_in_command144);
                            e=expr();

                            state._fsp--;



                                        symTable.put((i!=null?i.getText():null),new Integer(staticData));
                                        code = e+"\tpush "+(staticData++)+"\n"+"\tsw\n";

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:44:14: LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_command161); 

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:44:19: ( type j= ID ( COMMA type j= ID )* )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0==BOOL||LA4_0==INT||LA4_0==LISTOF) ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:45:13: type j= ID ( COMMA type j= ID )*
                                    {
                                    pushFollow(FOLLOW_type_in_command178);
                                    type();

                                    state._fsp--;


                                    j=(Token)match(input,ID,FOLLOW_ID_in_command195); 

                                    localSymTable.put((j!=null?j.getText():null),new Integer(parameterCounter++));

                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:48:13: ( COMMA type j= ID )*
                                    loop3:
                                    do {
                                        int alt3=2;
                                        int LA3_0 = input.LA(1);

                                        if ( (LA3_0==COMMA) ) {
                                            alt3=1;
                                        }


                                        switch (alt3) {
                                    	case 1 :
                                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:48:14: COMMA type j= ID
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_command225); 

                                    	    pushFollow(FOLLOW_type_in_command227);
                                    	    type();

                                    	    state._fsp--;


                                    	    j=(Token)match(input,ID,FOLLOW_ID_in_command231); 

                                    	    localSymTable.put((j!=null?j.getText():null),new Integer(parameterCounter++));

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop3;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_command268); 

                            match(input,ASS,FOLLOW_ASS_in_command270); 

                            pushFollow(FOLLOW_expr_in_command274);
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:71:12: PRINT e= expr
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_command316); 

                    pushFollow(FOLLOW_expr_in_command320);
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
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "command"



    // $ANTLR start "expr"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:74:1: expr returns [String code] : t= term ( PLUS t= term | MINUS t= term | OR t= term )* ;
    public final String expr() throws RecognitionException {
        String code = null;


        String t =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:75:2: (t= term ( PLUS t= term | MINUS t= term | OR t= term )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:75:4: t= term ( PLUS t= term | MINUS t= term | OR t= term )*
            {
            pushFollow(FOLLOW_term_in_expr359);
            t=term();

            state._fsp--;


            code = t;

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:76:12: ( PLUS t= term | MINUS t= term | OR t= term )*
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt7=1;
                    }
                    break;
                case MINUS:
                    {
                    alt7=2;
                    }
                    break;
                case OR:
                    {
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:76:14: PLUS t= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_expr376); 

            	    pushFollow(FOLLOW_term_in_expr380);
            	    t=term();

            	    state._fsp--;


            	    code+=t+"\tadd\n";

            	    }
            	    break;
            	case 2 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:77:14: MINUS t= term
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_expr397); 

            	    pushFollow(FOLLOW_term_in_expr401);
            	    t=term();

            	    state._fsp--;


            	    code =t+code+"\tsub\n";

            	    }
            	    break;
            	case 3 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:78:14: OR t= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_expr418); 

            	    pushFollow(FOLLOW_term_in_expr422);
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
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "expr"



    // $ANTLR start "term"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:95:1: term returns [String code] : f= factor ( AND f= factor )* ;
    public final String term() throws RecognitionException {
        String code = null;


        FunctionalLanguageParser.factor_return f =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:96:10: (f= factor ( AND f= factor )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:96:12: f= factor ( AND f= factor )*
            {
            pushFollow(FOLLOW_factor_in_term512);
            f=factor();

            state._fsp--;


            code =(f!=null?f.code:null);

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:97:12: ( AND f= factor )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:97:13: AND f= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term529); 

            	    pushFollow(FOLLOW_factor_in_term533);
            	    f=factor();

            	    state._fsp--;



            	               	code = code+
            	                	        "\tpush "+FALSEVALUE+"\n"+
            	                	        "\tbeq label"+labelCounter+"\n"+
            	                	        (f!=null?f.code:null)+
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
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return code;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        public String code;
        public Checker typeCheck;
    };


    // $ANTLR start "factor"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:114:1: factor returns [String code, Checker typeCheck] : (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR |i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr );
    public final FunctionalLanguageParser.factor_return factor() throws RecognitionException {
        FunctionalLanguageParser.factor_return retval = new FunctionalLanguageParser.factor_return();
        retval.start = input.LT(1);


        Token n=null;
        Token i=null;
        String e =null;

        String f =null;

        String e2 =null;

        String e1 =null;

        String e3 =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:115:3: (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR |i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr )
            int alt14=9;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt14=1;
                }
                break;
            case TRUE:
                {
                alt14=2;
                }
                break;
            case FALSE:
                {
                alt14=3;
                }
                break;
            case EMPTY:
                {
                alt14=4;
                }
                break;
            case NOT:
                {
                alt14=5;
                }
                break;
            case LSPAR:
                {
                alt14=6;
                }
                break;
            case ID:
                {
                alt14=7;
                }
                break;
            case LPAR:
                {
                alt14=8;
                }
                break;
            case IF:
                {
                alt14=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:115:5: n= NUMBER
                    {
                    n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor585); 

                    retval.code = "\tpush "+(n!=null?n.getText():null)+"\n"; retval.typeCheck = new NumberChecker(); 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:116:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_factor593); 

                    retval.code = "\tpush "+TRUEVALUE+"\n"; retval.typeCheck = new BoolChecker(); 

                    }
                    break;
                case 3 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:117:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_factor601); 

                    retval.code = "\tpush "+FALSEVALUE+"\n"; retval.typeCheck = new BoolChecker(); 

                    }
                    break;
                case 4 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:118:5: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_factor609); 

                    retval.code = "\tpush "+EMPTYVALUE+"\n"; retval.typeCheck = new ListChecker(); 

                    }
                    break;
                case 5 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:119:5: NOT e= expr
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor617); 

                    pushFollow(FOLLOW_expr_in_factor621);
                    e=expr();

                    state._fsp--;



                     	retval.code = e+
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:131:12: LSPAR e= expr COMMA f= expr RSPAR
                    {
                    match(input,LSPAR,FOLLOW_LSPAR_in_factor638); 

                    pushFollow(FOLLOW_expr_in_factor642);
                    e=expr();

                    state._fsp--;


                    match(input,COMMA,FOLLOW_COMMA_in_factor644); 

                    pushFollow(FOLLOW_expr_in_factor648);
                    f=expr();

                    state._fsp--;


                    match(input,RSPAR,FOLLOW_RSPAR_in_factor650); 


                              	retval.code = f+
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:147:12: i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR )
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_factor678); 

                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:148:12: (| LPAR (e= expr ( COMMA f= expr )* )? RPAR )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==AND||LA11_0==COMMA||(LA11_0 >= DOT && LA11_0 <= ELSE)||LA11_0==EQUAL||LA11_0==GREATER||LA11_0==LESS||LA11_0==MINUS||(LA11_0 >= OR && LA11_0 <= PLUS)||(LA11_0 >= RPAR && LA11_0 <= THEN)) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==LPAR) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:149:12: 
                            {

                                      	Integer value = (Integer)localSymTable.get((i!=null?i.getText():null));
                                        if (value == null) {
                                     	retval.code = "\tpush "+
                                                    (Integer)symTable.get((i!=null?i.getText():null))+"\n"+
                                                    "\tlw\n"; 
                                        } else {
                                            retval.code = "\tlfp\n"+
                                                    "\tpush "+value.toString()+"\n"+
                                                    "\tadd\n"+
                                                    "\tlw\n";
                                   	}
                                        

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:162:14: LPAR (e= expr ( COMMA f= expr )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_factor721); 

                            retval.code = "";

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:163:14: (e= expr ( COMMA f= expr )* )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==EMPTY||LA10_0==FALSE||(LA10_0 >= ID && LA10_0 <= IF)||(LA10_0 >= LPAR && LA10_0 <= LSPAR)||(LA10_0 >= NOT && LA10_0 <= NUMBER)||LA10_0==TRUE) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:163:15: e= expr ( COMMA f= expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_factor741);
                                    e=expr();

                                    state._fsp--;


                                    retval.code = e;

                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:164:11: ( COMMA f= expr )*
                                    loop9:
                                    do {
                                        int alt9=2;
                                        int LA9_0 = input.LA(1);

                                        if ( (LA9_0==COMMA) ) {
                                            alt9=1;
                                        }


                                        switch (alt9) {
                                    	case 1 :
                                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:164:12: COMMA f= expr
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_factor756); 

                                    	    pushFollow(FOLLOW_expr_in_factor760);
                                    	    f=expr();

                                    	    state._fsp--;


                                    	    retval.code = f+retval.code;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop9;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_factor784); 

                            retval.code = "\tlfp\n"+retval.code+"\tjal "+(i!=null?i.getText():null)+"\n";

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:167:12: LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_factor828); 

                    pushFollow(FOLLOW_expr_in_factor832);
                    e=expr();

                    state._fsp--;


                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:168:12: ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
                    int alt13=5;
                    switch ( input.LA(1) ) {
                    case RPAR:
                        {
                        alt13=1;
                        }
                        break;
                    case EQUAL:
                        {
                        alt13=2;
                        }
                        break;
                    case LESS:
                        {
                        alt13=3;
                        }
                        break;
                    case GREATER:
                        {
                        alt13=4;
                        }
                        break;
                    case DOT:
                        {
                        alt13=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }

                    switch (alt13) {
                        case 1 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:168:14: RPAR
                            {
                            match(input,RPAR,FOLLOW_RPAR_in_factor848); 

                            retval.code = e;

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:169:14: EQUAL e2= expr RPAR
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_factor865); 

                            pushFollow(FOLLOW_expr_in_factor869);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor871); 


                                        retval.code = e2+e+
                                               "\tbeq label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                     	

                            }
                            break;
                        case 3 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:179:14: LESS e2= expr RPAR
                            {
                            match(input,LESS,FOLLOW_LESS_in_factor901); 

                            pushFollow(FOLLOW_expr_in_factor905);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor907); 


                                        retval.code = e2+e+
                                               "\tbless label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                    	

                            }
                            break;
                        case 4 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:189:14: GREATER e2= expr RPAR
                            {
                            match(input,GREATER,FOLLOW_GREATER_in_factor940); 

                            pushFollow(FOLLOW_expr_in_factor944);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor946); 


                                        retval.code = e+e2+
                                               "\tbless label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                   	

                            }
                            break;
                        case 5 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:199:12: DOT ( FIRST | REST ) RPAR
                            {
                            match(input,DOT,FOLLOW_DOT_in_factor978); 

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:200:13: ( FIRST | REST )
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==FIRST) ) {
                                alt12=1;
                            }
                            else if ( (LA12_0==REST) ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 0, input);

                                throw nvae;

                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:200:15: FIRST
                                    {
                                    match(input,FIRST,FOLLOW_FIRST_in_factor995); 

                                    retval.code = e+"\tlw\n";

                                    }
                                    break;
                                case 2 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:201:15: REST
                                    {
                                    match(input,REST,FOLLOW_REST_in_factor1014); 


                                                	retval.code = e+
                                                                 "\tpush 1"+
                                                                 "\tadd\n"+
                                                                 "\tlw\n";
                                             	

                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_factor1044); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:210:6: IF e1= expr THEN e2= expr ELSE e3= expr
                    {
                    match(input,IF,FOLLOW_IF_in_factor1076); 

                    pushFollow(FOLLOW_expr_in_factor1080);
                    e1=expr();

                    state._fsp--;


                    match(input,THEN,FOLLOW_THEN_in_factor1082); 

                    pushFollow(FOLLOW_expr_in_factor1086);
                    e2=expr();

                    state._fsp--;


                    match(input,ELSE,FOLLOW_ELSE_in_factor1088); 

                    pushFollow(FOLLOW_expr_in_factor1092);
                    e3=expr();

                    state._fsp--;



                             	retval.code = e1+
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
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_command_in_prog39 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEMIC_in_prog41 = new BitSet(new long[]{0x0000000020000202L});
    public static final BitSet FOLLOW_command_in_prog50 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEMIC_in_prog52 = new BitSet(new long[]{0x0000000020000202L});
    public static final BitSet FOLLOW_INT_in_type77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_type82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LISTOF_in_type88 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LSPAR_in_type90 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_type92 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RSPAR_in_type94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_command116 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_command118 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command122 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ASS_in_command140 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_command161 = new BitSet(new long[]{0x0000000080280040L});
    public static final BitSet FOLLOW_type_in_command178 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command195 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_COMMA_in_command225 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_command227 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command231 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_RPAR_in_command268 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASS_in_command270 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_command316 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr359 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_PLUS_in_expr376 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr380 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_MINUS_in_expr397 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr401 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_OR_in_expr418 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr422 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_factor_in_term512 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_term529 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_factor_in_term533 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NUMBER_in_factor585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factor593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factor601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_factor609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor617 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSPAR_in_factor638 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor642 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_factor644 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor648 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RSPAR_in_factor650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor678 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LPAR_in_factor721 = new BitSet(new long[]{0x0000000886C65000L});
    public static final BitSet FOLLOW_expr_in_factor741 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_COMMA_in_factor756 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor760 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_RPAR_in_factor784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_factor828 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor832 = new BitSet(new long[]{0x0000000080112400L});
    public static final BitSet FOLLOW_RPAR_in_factor848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_factor865 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor869 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_factor901 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor905 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_factor940 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor944 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_factor978 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_FIRST_in_factor995 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_REST_in_factor1014 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_factor1076 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1080 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_THEN_in_factor1082 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1086 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELSE_in_factor1088 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1092 = new BitSet(new long[]{0x0000000000000002L});

}
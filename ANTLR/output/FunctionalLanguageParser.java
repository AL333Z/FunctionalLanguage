// $ANTLR 3.4 /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g 2013-01-20 15:53:57


import java.util.HashMap;
import java.util.LinkedList;
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
    private HashMap typeTable = new HashMap();
    private HashMap localSymTable = new HashMap();
    private final static int TRUEVALUE = 1;
    private final static int FALSEVALUE = 0;
    private final static int EMPTYVALUE = -1;

    private String functionCode = new String();



    public static class prog_return extends ParserRuleReturnScope {
        public String code;
        public Checker typecheck;
    };


    // $ANTLR start "prog"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:30:1: prog returns [String code, Checker typecheck] : c= command SEMIC (d= command SEMIC )* ;
    public final FunctionalLanguageParser.prog_return prog() throws RecognitionException {
        FunctionalLanguageParser.prog_return retval = new FunctionalLanguageParser.prog_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.command_return c =null;

        FunctionalLanguageParser.command_return d =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:31:10: (c= command SEMIC (d= command SEMIC )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:31:12: c= command SEMIC (d= command SEMIC )*
            {
            pushFollow(FOLLOW_command_in_prog40);
            c=command();

            state._fsp--;


            match(input,SEMIC,FOLLOW_SEMIC_in_prog42); 


                    	
                    	retval.code = (c!=null?c.code:null)+"\n";
            	retval.typecheck = new CommandChecker((c!=null?c.typecheck:null));
                    	
                    	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:39:3: (d= command SEMIC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEF||LA1_0==PRINT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:39:4: d= command SEMIC
            	    {
            	    pushFollow(FOLLOW_command_in_prog71);
            	    d=command();

            	    state._fsp--;


            	    match(input,SEMIC,FOLLOW_SEMIC_in_prog73); 


            	    	 
            	    	 retval.code += (d!=null?d.code:null)+"\n";
            	    	 
            	    	retval.typecheck = new ProgramChecker(retval.typecheck, (d!=null?d.typecheck:null));
            	    	 
            	    	 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


             retval.code+="\thalt\n"+functionCode;

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
    // $ANTLR end "prog"



    // $ANTLR start "type"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:49:1: type returns [int typevalue] : ( INT | BOOL | ( LISTOF LSPAR type RSPAR ) );
    public final int type() throws RecognitionException {
        int typevalue = 0;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:50:2: ( INT | BOOL | ( LISTOF LSPAR type RSPAR ) )
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:50:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_type102); 

                    typevalue = Checker.INT; 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:51:4: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_type109); 

                    typevalue = Checker.BOOL; 

                    }
                    break;
                case 3 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:52:4: ( LISTOF LSPAR type RSPAR )
                    {
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:52:4: ( LISTOF LSPAR type RSPAR )
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:52:5: LISTOF LSPAR type RSPAR
                    {
                    match(input,LISTOF,FOLLOW_LISTOF_in_type117); 

                    match(input,LSPAR,FOLLOW_LSPAR_in_type119); 

                    pushFollow(FOLLOW_type_in_type121);
                    type();

                    state._fsp--;


                    match(input,RSPAR,FOLLOW_RSPAR_in_type123); 

                    }


                    typevalue = Checker.LISTOF; 

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
        return typevalue;
    }
    // $ANTLR end "type"


    public static class command_return extends ParserRuleReturnScope {
        public String code;
        public Checker typecheck;
    };


    // $ANTLR start "command"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:56:1: command returns [String code, Checker typecheck] : ( DEF t= type i= ID ( ASS e= expr | LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr ) | PRINT e= expr );
    public final FunctionalLanguageParser.command_return command() throws RecognitionException {
        FunctionalLanguageParser.command_return retval = new FunctionalLanguageParser.command_return();
        retval.start = input.LT(1);


        Token i=null;
        Token j=null;
        int t =0;

        FunctionalLanguageParser.expr_return e =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:57:2: ( DEF t= type i= ID ( ASS e= expr | LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr ) | PRINT e= expr )
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:57:4: DEF t= type i= ID ( ASS e= expr | LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr )
                    {
                    match(input,DEF,FOLLOW_DEF_in_command150); 

                    pushFollow(FOLLOW_type_in_command154);
                    t=type();

                    state._fsp--;


                    i=(Token)match(input,ID,FOLLOW_ID_in_command158); 

                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:58:12: ( ASS e= expr | LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr )
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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:58:14: ASS e= expr
                            {
                            match(input,ASS,FOLLOW_ASS_in_command173); 

                            pushFollow(FOLLOW_expr_in_command177);
                            e=expr();

                            state._fsp--;



                                      	
                                        symTable.put((i!=null?i.getText():null),new Integer(staticData));
                                        typeTable.put((i!=null?i.getText():null),new Integer(t));
                                        retval.code = (e!=null?e.code:null)+"\tpush "+(staticData++)+"\n"+"\tsw\n";
                                        
                                        retval.typecheck = new ExprAssignmentChecker(t , (e!=null?e.typecheck:null));
                                        
                                        

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:69:14: LPAR ( type j= ID ( COMMA type j= ID )* )? RPAR ASS e= expr
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_command219); 

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:69:19: ( type j= ID ( COMMA type j= ID )* )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0==BOOL||LA4_0==INT||LA4_0==LISTOF) ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:70:13: type j= ID ( COMMA type j= ID )*
                                    {
                                    pushFollow(FOLLOW_type_in_command236);
                                    type();

                                    state._fsp--;


                                    j=(Token)match(input,ID,FOLLOW_ID_in_command253); 

                                    localSymTable.put((j!=null?j.getText():null),new Integer(parameterCounter++));

                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:73:13: ( COMMA type j= ID )*
                                    loop3:
                                    do {
                                        int alt3=2;
                                        int LA3_0 = input.LA(1);

                                        if ( (LA3_0==COMMA) ) {
                                            alt3=1;
                                        }


                                        switch (alt3) {
                                    	case 1 :
                                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:73:14: COMMA type j= ID
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_command283); 

                                    	    pushFollow(FOLLOW_type_in_command285);
                                    	    type();

                                    	    state._fsp--;


                                    	    j=(Token)match(input,ID,FOLLOW_ID_in_command289); 

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


                            match(input,RPAR,FOLLOW_RPAR_in_command326); 

                            match(input,ASS,FOLLOW_ASS_in_command328); 

                            pushFollow(FOLLOW_expr_in_command332);
                            e=expr();

                            state._fsp--;



                                        String removePar = "";
                                        for(int c=0; c<parameterCounter; c++)
                                        	removePar+="\tpop\n";
                                         functionCode+=(i!=null?i.getText():null)+":\n"+
                                                        "\tlsp\n"+
                                                        "\tsfp\n"+
                                                        "\tlra\n"+
                                                        (e!=null?e.code:null)+
                                                        "\tsrv\n"+
                                                        "\tsra\n"+
                                                        removePar+  
                                                        "\tsfp\n"+
                                                        "\tlrv\n"+
                                                        "\tjra\n";
                                   	retval.code ="";
                                        parameterCounter=0;
                                        localSymTable=new HashMap();             
                                     	

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:96:12: PRINT e= expr
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_command374); 

                    pushFollow(FOLLOW_expr_in_command378);
                    e=expr();

                    state._fsp--;



                            	
                            	retval.code = (e!=null?e.code:null)+"\tprint\n";
                            	
                            	retval.typecheck = new PrintChecker((e!=null?e.typecheck:null));
                            	
                            	

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
    // $ANTLR end "command"


    public static class expr_return extends ParserRuleReturnScope {
        public String code;
        public Checker typecheck;
    };


    // $ANTLR start "expr"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:107:1: expr returns [String code, Checker typecheck] : t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* ;
    public final FunctionalLanguageParser.expr_return expr() throws RecognitionException {
        FunctionalLanguageParser.expr_return retval = new FunctionalLanguageParser.expr_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.term_return t =null;

        FunctionalLanguageParser.term_return t2 =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:108:2: (t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:108:4: t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
            {
            pushFollow(FOLLOW_term_in_expr437);
            t=term();

            state._fsp--;



            	
            	retval.code = (t!=null?t.code:null);
            	retval.typecheck = new TermChecker((t!=null?t.typecheck:null));
            	
            	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:116:12: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
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
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:116:14: PLUS t2= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_expr458); 

            	    pushFollow(FOLLOW_term_in_expr462);
            	    t2=term();

            	    state._fsp--;



            	              	
            	              	retval.code+=(t2!=null?t2.code:null)+"\tadd\n";
            	              	retval.typecheck = new PlusChecker(retval.typecheck, (t2!=null?t2.typecheck:null));
            	              	
            	              	

            	    }
            	    break;
            	case 2 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:125:14: MINUS t2= term
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_expr515); 

            	    pushFollow(FOLLOW_term_in_expr519);
            	    t2=term();

            	    state._fsp--;



            	              	
            	              	retval.code =(t2!=null?t2.code:null)+retval.code+"\tsub\n";
            	              	retval.typecheck = new MinusChecker(retval.typecheck, (t2!=null?t2.typecheck:null));
            	              	
            	              	

            	    }
            	    break;
            	case 3 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:132:14: OR t2= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_expr548); 

            	    pushFollow(FOLLOW_term_in_expr552);
            	    t2=term();

            	    state._fsp--;



            	                retval.code = retval.code+
            	                	     "\tpush "+TRUEVALUE+"\n"+
            	                	     "\tbeq label"+labelCounter+"\n"+
            	                	     (t!=null?t.code:null)+
            	                	     "\tpush "+TRUEVALUE+"\n"+
            	                	     "\tbeq label"+(labelCounter++)+"\n"+
            	                	     "\tpush "+FALSEVALUE+"\n"+
            	                	     "\tb label"+(labelCounter++)+"\n"+
            	                	     "label"+(labelCounter-2)+":\n"+
            	                	     "\tpush "+TRUEVALUE+"\n"+
            	                	     "label"+(labelCounter-1)+":\n";
            	                	     
            	            	retval.typecheck = new OrChecker(retval.typecheck, (t2!=null?t2.typecheck:null));    	    
            	                	    
            	           	

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "expr"


    public static class term_return extends ParserRuleReturnScope {
        public String code;
        public Checker typecheck;
    };


    // $ANTLR start "term"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:152:1: term returns [String code, Checker typecheck] : f= factor ( AND f2= factor )* ;
    public final FunctionalLanguageParser.term_return term() throws RecognitionException {
        FunctionalLanguageParser.term_return retval = new FunctionalLanguageParser.term_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.factor_return f =null;

        FunctionalLanguageParser.factor_return f2 =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:153:10: (f= factor ( AND f2= factor )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:153:12: f= factor ( AND f2= factor )*
            {
            pushFollow(FOLLOW_factor_in_term642);
            f=factor();

            state._fsp--;



                    	retval.code =(f!=null?f.code:null);
                    	retval.typecheck = new FactorChecker((f!=null?f.typecheck:null));
                    	
                    	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:159:12: ( AND f2= factor )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AND) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:159:13: AND f2= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term669); 

            	    pushFollow(FOLLOW_factor_in_term673);
            	    f2=factor();

            	    state._fsp--;



            	               	retval.code = retval.code+
            	                	        "\tpush "+FALSEVALUE+"\n"+
            	                	        "\tbeq label"+labelCounter+"\n"+
            	                	        (f2!=null?f2.code:null)+
            	                	        "\tpush "+FALSEVALUE+"\n"+
            	                	        "\tbeq label"+(labelCounter++)+"\n"+
            	                	        "\tpush "+TRUEVALUE+"\n"+
            	                	        "\tb label"+(labelCounter++)+"\n"+
            	                	        "label"+(labelCounter-2)+":\n"+
            	                	        "\tpush "+FALSEVALUE+"\n"+
            	                	        "label"+(labelCounter-1)+":\n";
            	                //TODO wrong implementation	        
            	           	retval.typecheck = new AndChecker(retval.typecheck, (f2!=null?f2.typecheck:null));	
            	                	        
            	           	

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        public String code;
        public Checker typecheck;
    };


    // $ANTLR start "factor"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:179:1: factor returns [String code, Checker typecheck] : (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR |i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr );
    public final FunctionalLanguageParser.factor_return factor() throws RecognitionException {
        FunctionalLanguageParser.factor_return retval = new FunctionalLanguageParser.factor_return();
        retval.start = input.LT(1);


        Token n=null;
        Token i=null;
        FunctionalLanguageParser.expr_return e =null;

        FunctionalLanguageParser.expr_return f =null;

        FunctionalLanguageParser.expr_return e2 =null;

        FunctionalLanguageParser.expr_return e1 =null;

        FunctionalLanguageParser.expr_return e3 =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:180:3: (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR |i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr )
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:180:5: n= NUMBER
                    {
                    n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor720); 

                    retval.code = "\tpush "+(n!=null?n.getText():null)+"\n"; retval.typecheck = new NumberChecker(); 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:181:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_factor728); 

                    retval.code = "\tpush "+TRUEVALUE+"\n"; retval.typecheck = new BoolChecker(); 

                    }
                    break;
                case 3 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:182:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_factor736); 

                    retval.code = "\tpush "+FALSEVALUE+"\n"; retval.typecheck = new BoolChecker(); 

                    }
                    break;
                case 4 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:183:5: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_factor744); 

                    retval.code = "\tpush "+EMPTYVALUE+"\n"; retval.typecheck = new ListChecker(); 

                    }
                    break;
                case 5 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:184:5: NOT e= expr
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor752); 

                    pushFollow(FOLLOW_expr_in_factor756);
                    e=expr();

                    state._fsp--;



                     	retval.code = (e!=null?e.code:null)+
                                	   "\tpush "+TRUEVALUE+"\n"+
                                	   "\tbeq label"+(labelCounter++)+"\n"+
                                	   "\tpush "+TRUEVALUE+"\n"+
                                	   "\tb label"+(labelCounter++)+"\n"+
                                	   "label"+(labelCounter-2)+":\n"+
                                	   "\tpush "+FALSEVALUE+"\n"+
                                	   "label"+(labelCounter-1)+":\n";
                                	   
                            	retval.typecheck = new NotChecker((e!=null?e.typecheck:null));
                            	
                             	

                    }
                    break;
                case 6 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:198:12: LSPAR e= expr COMMA f= expr RSPAR
                    {
                    match(input,LSPAR,FOLLOW_LSPAR_in_factor773); 

                    pushFollow(FOLLOW_expr_in_factor777);
                    e=expr();

                    state._fsp--;


                    match(input,COMMA,FOLLOW_COMMA_in_factor779); 

                    pushFollow(FOLLOW_expr_in_factor783);
                    f=expr();

                    state._fsp--;


                    match(input,RSPAR,FOLLOW_RSPAR_in_factor785); 


                              	retval.code = (f!=null?f.code:null)+
                                       (e!=null?e.code:null)+
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
                    break;
                case 7 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:217:12: i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR )
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_factor813); 

                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:218:12: (| LPAR (e= expr ( COMMA f= expr )* )? RPAR )
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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:219:12: 
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
                                   	
                                   	Integer typeValue = (Integer)typeTable.get((i!=null?i.getText():null));
                                        if (typeValue == null) {
                                     		retval.typecheck = new ErrorChecker();
                                        } else {
                            		retval.typecheck = new IdChecker(typeValue.intValue());
                                   	}
                                   	
                                        

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:240:14: LPAR (e= expr ( COMMA f= expr )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_factor856); 

                            retval.code = "";

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:241:14: (e= expr ( COMMA f= expr )* )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==EMPTY||LA10_0==FALSE||(LA10_0 >= ID && LA10_0 <= IF)||(LA10_0 >= LPAR && LA10_0 <= LSPAR)||(LA10_0 >= NOT && LA10_0 <= NUMBER)||LA10_0==TRUE) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:241:15: e= expr ( COMMA f= expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_factor876);
                                    e=expr();

                                    state._fsp--;


                                    retval.code = (e!=null?e.code:null);

                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:242:11: ( COMMA f= expr )*
                                    loop9:
                                    do {
                                        int alt9=2;
                                        int LA9_0 = input.LA(1);

                                        if ( (LA9_0==COMMA) ) {
                                            alt9=1;
                                        }


                                        switch (alt9) {
                                    	case 1 :
                                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:242:12: COMMA f= expr
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_factor891); 

                                    	    pushFollow(FOLLOW_expr_in_factor895);
                                    	    f=expr();

                                    	    state._fsp--;


                                    	    retval.code = (f!=null?f.code:null)+retval.code;

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop9;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_factor919); 

                            retval.code = "\tlfp\n"+retval.code+"\tjal "+(i!=null?i.getText():null)+"\n";

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:245:12: LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_factor963); 

                    pushFollow(FOLLOW_expr_in_factor967);
                    e=expr();

                    state._fsp--;


                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:246:12: ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:246:14: RPAR
                            {
                            match(input,RPAR,FOLLOW_RPAR_in_factor983); 

                            retval.code = (e!=null?e.code:null);

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:247:14: EQUAL e2= expr RPAR
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_factor1000); 

                            pushFollow(FOLLOW_expr_in_factor1004);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1006); 


                                        retval.code = (e2!=null?e2.code:null)+(e!=null?e.code:null)+
                                               "\tbeq label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                      	   
                                    	retval.typecheck = new EqualChecker((e!=null?e.typecheck:null), (e2!=null?e2.typecheck:null));
                                    	
                                     	

                            }
                            break;
                        case 3 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:260:14: LESS e2= expr RPAR
                            {
                            match(input,LESS,FOLLOW_LESS_in_factor1036); 

                            pushFollow(FOLLOW_expr_in_factor1040);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1042); 


                                        retval.code = (e2!=null?e2.code:null)+(e!=null?e.code:null)+
                                               "\tbless label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                      
                                   	retval.typecheck = new LessChecker((e!=null?e.typecheck:null), (e2!=null?e2.typecheck:null));
                                   	
                                    	

                            }
                            break;
                        case 4 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:273:14: GREATER e2= expr RPAR
                            {
                            match(input,GREATER,FOLLOW_GREATER_in_factor1075); 

                            pushFollow(FOLLOW_expr_in_factor1079);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1081); 


                                        retval.code = (e!=null?e.code:null)+(e2!=null?e2.code:null)+
                                               "\tbless label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                      	   
                                    	retval.typecheck = new GreaterChecker((e!=null?e.typecheck:null), (e2!=null?e2.typecheck:null));
                                      	   
                                   	

                            }
                            break;
                        case 5 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:286:12: DOT ( FIRST | REST ) RPAR
                            {
                            match(input,DOT,FOLLOW_DOT_in_factor1113); 

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:287:13: ( FIRST | REST )
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
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:287:15: FIRST
                                    {
                                    match(input,FIRST,FOLLOW_FIRST_in_factor1130); 

                                    retval.code = (e!=null?e.code:null)+"\tlw\n";

                                    }
                                    break;
                                case 2 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:288:15: REST
                                    {
                                    match(input,REST,FOLLOW_REST_in_factor1149); 


                                                	retval.code = (e!=null?e.code:null)+
                                                                 "\tpush 1"+
                                                                 "\tadd\n"+
                                                                 "\tlw\n";
                                             	

                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_factor1179); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:297:6: IF e1= expr THEN e2= expr ELSE e3= expr
                    {
                    match(input,IF,FOLLOW_IF_in_factor1211); 

                    pushFollow(FOLLOW_expr_in_factor1215);
                    e1=expr();

                    state._fsp--;


                    match(input,THEN,FOLLOW_THEN_in_factor1217); 

                    pushFollow(FOLLOW_expr_in_factor1221);
                    e2=expr();

                    state._fsp--;


                    match(input,ELSE,FOLLOW_ELSE_in_factor1223); 

                    pushFollow(FOLLOW_expr_in_factor1227);
                    e3=expr();

                    state._fsp--;



                             	retval.code = (e1!=null?e1.code:null)+
                                       "\tpush "+TRUEVALUE+"\n"+ 
                                       "\tbeq label"+(labelCounter++)+"\n"+
                              	   (e3!=null?e3.code:null)+
                              	   "\tb label"+(labelCounter++)+"\n"+
                              	   "label"+(labelCounter-2)+":\n"+
                              	   (e2!=null?e2.code:null)+
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


 

    public static final BitSet FOLLOW_command_in_prog40 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEMIC_in_prog42 = new BitSet(new long[]{0x0000000020000202L});
    public static final BitSet FOLLOW_command_in_prog71 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEMIC_in_prog73 = new BitSet(new long[]{0x0000000020000202L});
    public static final BitSet FOLLOW_INT_in_type102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_type109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LISTOF_in_type117 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LSPAR_in_type119 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_type121 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RSPAR_in_type123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_command150 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_command154 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command158 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ASS_in_command173 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_command219 = new BitSet(new long[]{0x0000000080280040L});
    public static final BitSet FOLLOW_type_in_command236 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command253 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_COMMA_in_command283 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_command285 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command289 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_RPAR_in_command326 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASS_in_command328 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_command374 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr437 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_PLUS_in_expr458 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr462 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_MINUS_in_expr515 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr519 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_OR_in_expr548 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr552 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_factor_in_term642 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_term669 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_factor_in_term673 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NUMBER_in_factor720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factor728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factor736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_factor744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor752 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSPAR_in_factor773 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor777 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_factor779 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor783 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RSPAR_in_factor785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor813 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LPAR_in_factor856 = new BitSet(new long[]{0x0000000886C65000L});
    public static final BitSet FOLLOW_expr_in_factor876 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_COMMA_in_factor891 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor895 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_RPAR_in_factor919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_factor963 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor967 = new BitSet(new long[]{0x0000000080112400L});
    public static final BitSet FOLLOW_RPAR_in_factor983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_factor1000 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1004 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_factor1036 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1040 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_factor1075 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1079 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_factor1113 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_FIRST_in_factor1130 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_REST_in_factor1149 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_factor1211 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1215 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_THEN_in_factor1217 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELSE_in_factor1223 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1227 = new BitSet(new long[]{0x0000000000000002L});

}
// $ANTLR 3.4 /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g 2013-01-22 23:10:11


import java.util.HashMap;
import java.util.LinkedList;
import com.al333z.typechecking.*;
import com.al333z.type.*;



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
    private HashMap localTypeTable = new HashMap();

    private HashMap functionParametersTypeTable = new HashMap();
    private HashMap functionReturnValues = new HashMap();

    private LinkedList<Checker> funcParametersTypeList = new LinkedList<Checker>();
    private LinkedList<Type> parametersTypeList = new LinkedList<Type>();

    private final static int TRUEVALUE = 1;
    private final static int FALSEVALUE = 0;
    private final static int EMPTYVALUE = -1;

    private String functionCode = new String();



    public static class prog_return extends ParserRuleReturnScope {
        public String code;
        public Checker typecheck;
    };


    // $ANTLR start "prog"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:38:1: prog returns [String code, Checker typecheck] : c= command SEMIC (d= command SEMIC )* ;
    public final FunctionalLanguageParser.prog_return prog() throws RecognitionException {
        FunctionalLanguageParser.prog_return retval = new FunctionalLanguageParser.prog_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.command_return c =null;

        FunctionalLanguageParser.command_return d =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:39:10: (c= command SEMIC (d= command SEMIC )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:39:12: c= command SEMIC (d= command SEMIC )*
            {
            pushFollow(FOLLOW_command_in_prog39);
            c=command();

            state._fsp--;


            match(input,SEMIC,FOLLOW_SEMIC_in_prog41); 


                    	
                    	retval.code = (c!=null?c.code:null)+"\n";
            	retval.typecheck = new CommandChecker((c!=null?c.typecheck:null));
            	
                    	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:47:3: (d= command SEMIC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEF||LA1_0==PRINT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:47:4: d= command SEMIC
            	    {
            	    pushFollow(FOLLOW_command_in_prog70);
            	    d=command();

            	    state._fsp--;


            	    match(input,SEMIC,FOLLOW_SEMIC_in_prog72); 


            	    	 
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
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:56:1: type returns [Type typevalue] : (p= primitiveType |c= compoundType );
    public final Type type() throws RecognitionException {
        Type typevalue = null;


        Type p =null;

        Type c =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:57:2: (p= primitiveType |c= compoundType )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==BOOL||LA2_0==INT) ) {
                alt2=1;
            }
            else if ( (LA2_0==LISTOF) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:57:4: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type103);
                    p=primitiveType();

                    state._fsp--;


                     typevalue = p; 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:58:4: c= compoundType
                    {
                    pushFollow(FOLLOW_compoundType_in_type112);
                    c=compoundType();

                    state._fsp--;


                    typevalue = c; 

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



    // $ANTLR start "primitiveType"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:61:1: primitiveType returns [Type typevalue] : ( INT | BOOL );
    public final Type primitiveType() throws RecognitionException {
        Type typevalue = null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:62:2: ( INT | BOOL )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==BOOL) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:62:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType128); 

                    typevalue = new IntType(); 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:63:4: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType136); 

                    typevalue = new BoolType(); 

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
    // $ANTLR end "primitiveType"



    // $ANTLR start "compoundType"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:66:1: compoundType returns [Type typevalue] : ( LISTOF LSPAR t= primitiveType RSPAR ) ;
    public final Type compoundType() throws RecognitionException {
        Type typevalue = null;


        Type t =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:67:2: ( ( LISTOF LSPAR t= primitiveType RSPAR ) )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:67:4: ( LISTOF LSPAR t= primitiveType RSPAR )
            {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:67:4: ( LISTOF LSPAR t= primitiveType RSPAR )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:67:5: LISTOF LSPAR t= primitiveType RSPAR
            {
            match(input,LISTOF,FOLLOW_LISTOF_in_compoundType155); 

            match(input,LSPAR,FOLLOW_LSPAR_in_compoundType157); 

            pushFollow(FOLLOW_primitiveType_in_compoundType161);
            t=primitiveType();

            state._fsp--;


            match(input,RSPAR,FOLLOW_RSPAR_in_compoundType163); 

            }


            typevalue = new ListType(t); 

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
    // $ANTLR end "compoundType"


    public static class command_return extends ParserRuleReturnScope {
        public String code;
        public Checker typecheck;
    };


    // $ANTLR start "command"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:70:1: command returns [String code, Checker typecheck] : ( DEF t= type i= ID ( ASS e= expr | LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr ) | PRINT e= expr );
    public final FunctionalLanguageParser.command_return command() throws RecognitionException {
        FunctionalLanguageParser.command_return retval = new FunctionalLanguageParser.command_return();
        retval.start = input.LT(1);


        Token i=null;
        Token j=null;
        Token k=null;
        Type t =null;

        FunctionalLanguageParser.expr_return e =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:71:2: ( DEF t= type i= ID ( ASS e= expr | LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr ) | PRINT e= expr )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DEF) ) {
                alt7=1;
            }
            else if ( (LA7_0==PRINT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:71:4: DEF t= type i= ID ( ASS e= expr | LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr )
                    {
                    match(input,DEF,FOLLOW_DEF_in_command184); 

                    pushFollow(FOLLOW_type_in_command188);
                    t=type();

                    state._fsp--;


                    i=(Token)match(input,ID,FOLLOW_ID_in_command192); 

                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:72:12: ( ASS e= expr | LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ASS) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==LPAR) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;

                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:72:14: ASS e= expr
                            {
                            match(input,ASS,FOLLOW_ASS_in_command207); 

                            pushFollow(FOLLOW_expr_in_command211);
                            e=expr();

                            state._fsp--;



                                      	
                                        symTable.put((i!=null?i.getText():null),new Integer(staticData));
                                        typeTable.put((i!=null?i.getText():null), t);
                                        retval.code = (e!=null?e.code:null)+"\tpush "+(staticData++)+"\n"+"\tsw\n";
                                        
                                        retval.typecheck = new ExprAssignmentChecker(t , (e!=null?e.typecheck:null));
                                        
                                        

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:83:14: LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_command253); 

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:83:19: (t= type j= ID ( COMMA t= type k= ID )* )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==BOOL||LA5_0==INT||LA5_0==LISTOF) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:84:13: t= type j= ID ( COMMA t= type k= ID )*
                                    {

                                               	
                                               	// save func return values
                                               	functionReturnValues.put((i!=null?i.getText():null), t);
                                               	
                                               	

                                    pushFollow(FOLLOW_type_in_command299);
                                    t=type();

                                    state._fsp--;


                                    j=(Token)match(input,ID,FOLLOW_ID_in_command315); 


                                                localSymTable.put((j!=null?j.getText():null),new Integer(parameterCounter++));
                                      
                                                localTypeTable.put((j!=null?j.getText():null),t);
                                                
                                                //  save first param type
                                           	parametersTypeList.add(t);
                                                
                                                

                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:102:13: ( COMMA t= type k= ID )*
                                    loop4:
                                    do {
                                        int alt4=2;
                                        int LA4_0 = input.LA(1);

                                        if ( (LA4_0==COMMA) ) {
                                            alt4=1;
                                        }


                                        switch (alt4) {
                                    	case 1 :
                                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:102:14: COMMA t= type k= ID
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_command345); 

                                    	    pushFollow(FOLLOW_type_in_command349);
                                    	    t=type();

                                    	    state._fsp--;


                                    	    k=(Token)match(input,ID,FOLLOW_ID_in_command353); 


                                    	                localSymTable.put((k!=null?k.getText():null),new Integer(parameterCounter++));
                                    	           
                                    	                localTypeTable.put((k!=null?k.getText():null), t);
                                    	                
                                    	           	parametersTypeList.add(t);
                                    	                
                                    	                

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop4;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_command388); 


                                        	// save parameters type list
                                        	functionParametersTypeTable.put((i!=null?i.getText():null), parametersTypeList);
                                        	
                                        	System.out.println("saved functionParametersTypeTable id: "+(i!=null?i.getText():null));
                                        	System.out.println("saved functionParametersTypeTable size: "+parametersTypeList.size());
                                        	System.out.println("saved functionParametersTypeTable: "+parametersTypeList.toString());
                                        	
                                        	parametersTypeList = new LinkedList<Type>();
                                        

                            match(input,ASS,FOLLOW_ASS_in_command417); 

                            pushFollow(FOLLOW_expr_in_command421);
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
                                        
                                        localTypeTable = new HashMap();
                                        
                                        retval.typecheck = new ExprChecker((e!=null?e.typecheck:null));
                                                   
                                     	

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:148:12: PRINT e= expr
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_command463); 

                    pushFollow(FOLLOW_expr_in_command467);
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
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:159:1: expr returns [String code, Checker typecheck] : t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* ;
    public final FunctionalLanguageParser.expr_return expr() throws RecognitionException {
        FunctionalLanguageParser.expr_return retval = new FunctionalLanguageParser.expr_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.term_return t =null;

        FunctionalLanguageParser.term_return t2 =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:160:2: (t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:160:4: t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
            {
            pushFollow(FOLLOW_term_in_expr526);
            t=term();

            state._fsp--;



            	
            	retval.code = (t!=null?t.code:null);
            	retval.typecheck = new TermChecker((t!=null?t.typecheck:null));
            	
            	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:168:12: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt8=1;
                    }
                    break;
                case MINUS:
                    {
                    alt8=2;
                    }
                    break;
                case OR:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:168:14: PLUS t2= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_expr547); 

            	    pushFollow(FOLLOW_term_in_expr551);
            	    t2=term();

            	    state._fsp--;



            	              	
            	              	retval.code+=(t2!=null?t2.code:null)+"\tadd\n";
            	              	retval.typecheck = new PlusChecker(retval.typecheck, (t2!=null?t2.typecheck:null));
            	              	
            	              	

            	    }
            	    break;
            	case 2 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:177:14: MINUS t2= term
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_expr604); 

            	    pushFollow(FOLLOW_term_in_expr608);
            	    t2=term();

            	    state._fsp--;



            	              	
            	              	retval.code =(t2!=null?t2.code:null)+retval.code+"\tsub\n";
            	              	retval.typecheck = new MinusChecker(retval.typecheck, (t2!=null?t2.typecheck:null));
            	              	
            	              	

            	    }
            	    break;
            	case 3 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:184:14: OR t2= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_expr637); 

            	    pushFollow(FOLLOW_term_in_expr641);
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
    // $ANTLR end "expr"


    public static class term_return extends ParserRuleReturnScope {
        public String code;
        public Checker typecheck;
    };


    // $ANTLR start "term"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:204:1: term returns [String code, Checker typecheck] : f= factor ( AND f2= factor )* ;
    public final FunctionalLanguageParser.term_return term() throws RecognitionException {
        FunctionalLanguageParser.term_return retval = new FunctionalLanguageParser.term_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.factor_return f =null;

        FunctionalLanguageParser.factor_return f2 =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:205:10: (f= factor ( AND f2= factor )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:205:12: f= factor ( AND f2= factor )*
            {
            pushFollow(FOLLOW_factor_in_term731);
            f=factor();

            state._fsp--;



                    	retval.code =(f!=null?f.code:null);
                    	retval.typecheck = new FactorChecker((f!=null?f.typecheck:null));
                    	
                    	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:211:12: ( AND f2= factor )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:211:13: AND f2= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term758); 

            	    pushFollow(FOLLOW_factor_in_term762);
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
            	    	        
            	           	retval.typecheck = new AndChecker(retval.typecheck, (f2!=null?f2.typecheck:null));	
            	                	        
            	           	

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:231:1: factor returns [String code, Checker typecheck] : (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR |i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr );
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
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:232:3: (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR |i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr )
            int alt15=9;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt15=1;
                }
                break;
            case TRUE:
                {
                alt15=2;
                }
                break;
            case FALSE:
                {
                alt15=3;
                }
                break;
            case EMPTY:
                {
                alt15=4;
                }
                break;
            case NOT:
                {
                alt15=5;
                }
                break;
            case LSPAR:
                {
                alt15=6;
                }
                break;
            case ID:
                {
                alt15=7;
                }
                break;
            case LPAR:
                {
                alt15=8;
                }
                break;
            case IF:
                {
                alt15=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:232:5: n= NUMBER
                    {
                    n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor809); 

                    retval.code = "\tpush "+(n!=null?n.getText():null)+"\n"; retval.typecheck = new NumberChecker(); 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:233:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_factor817); 

                    retval.code = "\tpush "+TRUEVALUE+"\n"; retval.typecheck = new BoolChecker(); 

                    }
                    break;
                case 3 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:234:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_factor825); 

                    retval.code = "\tpush "+FALSEVALUE+"\n"; retval.typecheck = new BoolChecker(); 

                    }
                    break;
                case 4 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:235:5: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_factor833); 

                    retval.code = "\tpush "+EMPTYVALUE+"\n"; retval.typecheck = new ListChecker(null, null);  System.out.println("Creato EMPTY"); 

                    }
                    break;
                case 5 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:236:5: NOT e= expr
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor841); 

                    pushFollow(FOLLOW_expr_in_factor845);
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:250:12: LSPAR e= expr COMMA f= expr RSPAR
                    {
                    match(input,LSPAR,FOLLOW_LSPAR_in_factor862); 

                    pushFollow(FOLLOW_expr_in_factor866);
                    e=expr();

                    state._fsp--;


                    match(input,COMMA,FOLLOW_COMMA_in_factor868); 

                    pushFollow(FOLLOW_expr_in_factor872);
                    f=expr();

                    state._fsp--;


                    match(input,RSPAR,FOLLOW_RSPAR_in_factor874); 


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
                                       
                                       retval.typecheck = new ListChecker((e!=null?e.typecheck:null), (f!=null?f.typecheck:null));
                                       
                          	

                    }
                    break;
                case 7 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:269:12: i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR )
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_factor902); 

                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:270:12: (| LPAR (e= expr ( COMMA f= expr )* )? RPAR )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==AND||LA12_0==COMMA||(LA12_0 >= DOT && LA12_0 <= ELSE)||LA12_0==EQUAL||LA12_0==GREATER||LA12_0==LESS||LA12_0==MINUS||(LA12_0 >= OR && LA12_0 <= PLUS)||(LA12_0 >= RPAR && LA12_0 <= THEN)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==LPAR) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:271:12: 
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
                                   	
                                   	Type localTypeValue = (Type)localTypeTable.get((i!=null?i.getText():null));
                                        if (localTypeValue == null) {
                                        	System.out.println("id :"+(i!=null?i.getText():null));
                                        	Type typeValue = (Type)typeTable.get((i!=null?i.getText():null));
                            		if(typeValue == null){
                            			retval.typecheck = new ErrorChecker();
                            		}else{
                            			retval.typecheck = new IdChecker(typeValue);
                            		}
                                        } else {
                            		retval.typecheck = new IdChecker(localTypeValue);
                                   	}
                                   	
                                        

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:298:14: LPAR (e= expr ( COMMA f= expr )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_factor945); 


                                      	retval.code = "";
                                      	
                                      	
                                      	   	
                                      	

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:305:14: (e= expr ( COMMA f= expr )* )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==EMPTY||LA11_0==FALSE||(LA11_0 >= ID && LA11_0 <= IF)||(LA11_0 >= LPAR && LA11_0 <= LSPAR)||(LA11_0 >= NOT && LA11_0 <= NUMBER)||LA11_0==TRUE) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:305:15: e= expr ( COMMA f= expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_factor977);
                                    e=expr();

                                    state._fsp--;



                                              	  retval.code = (e!=null?e.code:null);
                                              	  
                                              	  funcParametersTypeList.add(new ExprChecker((e!=null?e.typecheck:null)));
                                              	  
                                              	  

                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:312:11: ( COMMA f= expr )*
                                    loop10:
                                    do {
                                        int alt10=2;
                                        int LA10_0 = input.LA(1);

                                        if ( (LA10_0==COMMA) ) {
                                            alt10=1;
                                        }


                                        switch (alt10) {
                                    	case 1 :
                                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:312:12: COMMA f= expr
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_factor1006); 

                                    	    pushFollow(FOLLOW_expr_in_factor1010);
                                    	    f=expr();

                                    	    state._fsp--;



                                    	           	  
                                    	           	  retval.code = (f!=null?f.code:null)+retval.code;
                                    	           	  
                                    	           	  funcParametersTypeList.add(new ExprChecker((f!=null?f.typecheck:null)));
                                    	           	  
                                    	           	  

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop10;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_factor1056); 


                                          
                                          retval.code = "\tlfp\n"+retval.code+"\tjal "+(i!=null?i.getText():null)+"\n";
                                          
                                          LinkedList<Type> declaredParametersTypeList = (LinkedList<Type>) functionParametersTypeTable.get((i!=null?i.getText():null));
                                          System.out.println("retrieved functionParametersTypeTable id: "+(i!=null?i.getText():null));
                                          System.out.println("retrieved functionParametersTypeTable size: "+declaredParametersTypeList.size());
                                          System.out.println("retrieved functionParametersTypeTable: "+declaredParametersTypeList.toString());
                                          
                                          Type returnType =((Type)functionReturnValues.get((i!=null?i.getText():null)));
                                          retval.typecheck = new FuncChecker( returnType, funcParametersTypeList, declaredParametersTypeList);
                                          
                                          // empty
                                          funcParametersTypeList = new LinkedList<Checker>();
                                          
                                          

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:339:12: LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_factor1115); 

                    pushFollow(FOLLOW_expr_in_factor1119);
                    e=expr();

                    state._fsp--;


                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:340:12: ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
                    int alt14=5;
                    switch ( input.LA(1) ) {
                    case RPAR:
                        {
                        alt14=1;
                        }
                        break;
                    case EQUAL:
                        {
                        alt14=2;
                        }
                        break;
                    case LESS:
                        {
                        alt14=3;
                        }
                        break;
                    case GREATER:
                        {
                        alt14=4;
                        }
                        break;
                    case DOT:
                        {
                        alt14=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;

                    }

                    switch (alt14) {
                        case 1 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:340:14: RPAR
                            {
                            match(input,RPAR,FOLLOW_RPAR_in_factor1135); 

                            retval.code = (e!=null?e.code:null);

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:341:14: EQUAL e2= expr RPAR
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_factor1152); 

                            pushFollow(FOLLOW_expr_in_factor1156);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1158); 


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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:354:14: LESS e2= expr RPAR
                            {
                            match(input,LESS,FOLLOW_LESS_in_factor1188); 

                            pushFollow(FOLLOW_expr_in_factor1192);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1194); 


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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:367:14: GREATER e2= expr RPAR
                            {
                            match(input,GREATER,FOLLOW_GREATER_in_factor1227); 

                            pushFollow(FOLLOW_expr_in_factor1231);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1233); 


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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:380:12: DOT ( FIRST | REST ) RPAR
                            {
                            match(input,DOT,FOLLOW_DOT_in_factor1265); 

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:381:13: ( FIRST | REST )
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==FIRST) ) {
                                alt13=1;
                            }
                            else if ( (LA13_0==REST) ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 0, input);

                                throw nvae;

                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:381:15: FIRST
                                    {
                                    match(input,FIRST,FOLLOW_FIRST_in_factor1282); 


                                                retval.code = (e!=null?e.code:null)+"\tlw\n";
                                                //TODO
                                                retval.typecheck = new ExprChecker((e!=null?e.typecheck:null));
                                                

                                    }
                                    break;
                                case 2 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:387:15: REST
                                    {
                                    match(input,REST,FOLLOW_REST_in_factor1314); 


                                                	retval.code = (e!=null?e.code:null)+
                                                                 "\tpush 1"+
                                                                 "\tadd\n"+
                                                                 "\tlw\n";
                                                         	//TODO
                                                             
                                             	

                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_factor1344); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:398:6: IF e1= expr THEN e2= expr ELSE e3= expr
                    {
                    match(input,IF,FOLLOW_IF_in_factor1376); 

                    pushFollow(FOLLOW_expr_in_factor1380);
                    e1=expr();

                    state._fsp--;


                    match(input,THEN,FOLLOW_THEN_in_factor1382); 

                    pushFollow(FOLLOW_expr_in_factor1386);
                    e2=expr();

                    state._fsp--;


                    match(input,ELSE,FOLLOW_ELSE_in_factor1388); 

                    pushFollow(FOLLOW_expr_in_factor1392);
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
                            
                            	retval.typecheck = new IfChecker((e1!=null?e1.typecheck:null), (e2!=null?e2.typecheck:null), (e3!=null?e3.typecheck:null));  	   
                              	   
                          	

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
    public static final BitSet FOLLOW_command_in_prog70 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEMIC_in_prog72 = new BitSet(new long[]{0x0000000020000202L});
    public static final BitSet FOLLOW_primitiveType_in_type103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_type112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LISTOF_in_compoundType155 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LSPAR_in_compoundType157 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_primitiveType_in_compoundType161 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RSPAR_in_compoundType163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_command184 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_command188 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command192 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ASS_in_command207 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_command253 = new BitSet(new long[]{0x0000000080280040L});
    public static final BitSet FOLLOW_type_in_command299 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command315 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_COMMA_in_command345 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_command349 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command353 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_RPAR_in_command388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASS_in_command417 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_command463 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr526 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_PLUS_in_expr547 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr551 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_MINUS_in_expr604 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr608 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_OR_in_expr637 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr641 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_factor_in_term731 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_term758 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_factor_in_term762 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NUMBER_in_factor809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factor817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factor825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_factor833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor841 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSPAR_in_factor862 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor866 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_factor868 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor872 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RSPAR_in_factor874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor902 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LPAR_in_factor945 = new BitSet(new long[]{0x0000000886C65000L});
    public static final BitSet FOLLOW_expr_in_factor977 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_COMMA_in_factor1006 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1010 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_RPAR_in_factor1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_factor1115 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1119 = new BitSet(new long[]{0x0000000080112400L});
    public static final BitSet FOLLOW_RPAR_in_factor1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_factor1152 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1156 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_factor1188 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1192 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_factor1227 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1231 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_factor1265 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_FIRST_in_factor1282 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_REST_in_factor1314 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_factor1376 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1380 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_THEN_in_factor1382 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1386 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELSE_in_factor1388 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1392 = new BitSet(new long[]{0x0000000000000002L});

}
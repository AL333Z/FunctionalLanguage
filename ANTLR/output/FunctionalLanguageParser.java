// $ANTLR 3.4 /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g 2013-01-27 16:06:11


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



    public static class prog_return extends ParserRuleReturnScope {
        public String code;
        public Node node;
    };


    // $ANTLR start "prog"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:46:1: prog returns [String code, Node node] : c= command SEMIC (d= command SEMIC )* ;
    public final FunctionalLanguageParser.prog_return prog() throws RecognitionException {
        FunctionalLanguageParser.prog_return retval = new FunctionalLanguageParser.prog_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.command_return c =null;

        FunctionalLanguageParser.command_return d =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:47:10: (c= command SEMIC (d= command SEMIC )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:47:12: c= command SEMIC (d= command SEMIC )*
            {
            pushFollow(FOLLOW_command_in_prog39);
            c=command();

            state._fsp--;


            match(input,SEMIC,FOLLOW_SEMIC_in_prog41); 


                    	retval.code = (c!=null?c.code:null)+"\n";
            	retval.node = new CommandNode((c!=null?c.node:null));
                    	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:53:2: (d= command SEMIC )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DEF||LA1_0==PRINT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:53:3: d= command SEMIC
            	    {
            	    pushFollow(FOLLOW_command_in_prog69);
            	    d=command();

            	    state._fsp--;


            	    match(input,SEMIC,FOLLOW_SEMIC_in_prog71); 


            	    	retval.code += (d!=null?d.code:null)+"\n"; 
            	    	retval.node = new ProgramNode(retval.node, (d!=null?d.node:null)); 
            	    	 

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
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:60:1: type returns [Type typevalue] : (p= primitiveType |c= compoundType );
    public final Type type() throws RecognitionException {
        Type typevalue = null;


        Type p =null;

        Type c =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:61:2: (p= primitiveType |c= compoundType )
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:61:4: p= primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type102);
                    p=primitiveType();

                    state._fsp--;


                     typevalue = p; 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:62:4: c= compoundType
                    {
                    pushFollow(FOLLOW_compoundType_in_type111);
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
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:65:1: primitiveType returns [Type typevalue] : ( INT | BOOL );
    public final Type primitiveType() throws RecognitionException {
        Type typevalue = null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:67:2: ( INT | BOOL )
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:67:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType129); 

                    typevalue = new IntType(); 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:68:4: BOOL
                    {
                    match(input,BOOL,FOLLOW_BOOL_in_primitiveType137); 

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
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:71:1: compoundType returns [Type typevalue] : ( LISTOF LSPAR t= primitiveType RSPAR ) ;
    public final Type compoundType() throws RecognitionException {
        Type typevalue = null;


        Type t =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:73:2: ( ( LISTOF LSPAR t= primitiveType RSPAR ) )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:73:4: ( LISTOF LSPAR t= primitiveType RSPAR )
            {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:73:4: ( LISTOF LSPAR t= primitiveType RSPAR )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:73:5: LISTOF LSPAR t= primitiveType RSPAR
            {
            match(input,LISTOF,FOLLOW_LISTOF_in_compoundType158); 

            match(input,LSPAR,FOLLOW_LSPAR_in_compoundType160); 

            pushFollow(FOLLOW_primitiveType_in_compoundType164);
            t=primitiveType();

            state._fsp--;


            match(input,RSPAR,FOLLOW_RSPAR_in_compoundType166); 

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
        public Node node;
    };


    // $ANTLR start "command"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:76:1: command returns [String code, Node node] : ( DEF t= type i= ID ( ASS e= expr | LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr ) | PRINT e= expr );
    public final FunctionalLanguageParser.command_return command() throws RecognitionException {
        FunctionalLanguageParser.command_return retval = new FunctionalLanguageParser.command_return();
        retval.start = input.LT(1);


        Token i=null;
        Token j=null;
        Token k=null;
        Type t =null;

        FunctionalLanguageParser.expr_return e =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:77:2: ( DEF t= type i= ID ( ASS e= expr | LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr ) | PRINT e= expr )
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:77:4: DEF t= type i= ID ( ASS e= expr | LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr )
                    {
                    match(input,DEF,FOLLOW_DEF_in_command187); 

                    pushFollow(FOLLOW_type_in_command191);
                    t=type();

                    state._fsp--;


                    i=(Token)match(input,ID,FOLLOW_ID_in_command195); 

                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:78:12: ( ASS e= expr | LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr )
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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:78:14: ASS e= expr
                            {
                            match(input,ASS,FOLLOW_ASS_in_command210); 

                            pushFollow(FOLLOW_expr_in_command214);
                            e=expr();

                            state._fsp--;



                                      	// Save value and type of the Expr
                                        symTable.put((i!=null?i.getText():null),new Integer(staticData));
                                        typeTable.put((i!=null?i.getText():null), t);
                                        
                                        retval.code = (e!=null?e.code:null)+"\tpush "+(staticData++)+"\n"+"\tsw\n";
                                        
                                      	// Assigment operation check
                                        retval.node = new ExprAssignmentNode(t , (e!=null?e.node:null));
                                        

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:90:14: LPAR (t= type j= ID ( COMMA t= type k= ID )* )? RPAR ASS e= expr
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_command256); 

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:90:19: (t= type j= ID ( COMMA t= type k= ID )* )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==BOOL||LA5_0==INT||LA5_0==LISTOF) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:91:13: t= type j= ID ( COMMA t= type k= ID )*
                                    {

                                               	// Function definition
                                               	
                                               	// Save func return values
                                               	functionReturnValues.put((i!=null?i.getText():null), t);
                                               	

                                    pushFollow(FOLLOW_type_in_command302);
                                    t=type();

                                    state._fsp--;


                                    j=(Token)match(input,ID,FOLLOW_ID_in_command318); 


                                                
                                                // Save local Sym pos
                                                localSymTable.put((j!=null?j.getText():null),new Integer(parameterCounter++));
                                                
                                                // Save local arg Type
                                                localTypeTable.put((j!=null?j.getText():null),t);
                                                
                                                //  Save first param type
                                           	parametersTypeList.add(t);           
                                           	
                                                

                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:112:13: ( COMMA t= type k= ID )*
                                    loop4:
                                    do {
                                        int alt4=2;
                                        int LA4_0 = input.LA(1);

                                        if ( (LA4_0==COMMA) ) {
                                            alt4=1;
                                        }


                                        switch (alt4) {
                                    	case 1 :
                                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:112:14: COMMA t= type k= ID
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_command348); 

                                    	    pushFollow(FOLLOW_type_in_command352);
                                    	    t=type();

                                    	    state._fsp--;


                                    	    k=(Token)match(input,ID,FOLLOW_ID_in_command356); 


                                    	                
                                    	                // Iterate for each arguments..
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


                            match(input,RPAR,FOLLOW_RPAR_in_command391); 


                                        	// Save parameters type list
                                        	functionParametersTypeTable.put((i!=null?i.getText():null), parametersTypeList);           
                                        	
                                        	// Clean var.. 	
                                        	parametersTypeList = new LinkedList<Type>();
                                        

                            match(input,ASS,FOLLOW_ASS_in_command420); 

                            pushFollow(FOLLOW_expr_in_command424);
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
                                        
                                        // Clean vars..
                                        localSymTable=new HashMap();
                                        localTypeTable = new HashMap();
                                        
                                        // Check Expr body
                                        retval.node = new ExprNode((e!=null?e.node:null));
                                        
                                     	

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:157:12: PRINT e= expr
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_command466); 

                    pushFollow(FOLLOW_expr_in_command470);
                    e=expr();

                    state._fsp--;



                            	retval.code = (e!=null?e.code:null)+"\tprint\n";
                            	retval.node = new PrintNode((e!=null?e.node:null));
                            	

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
        public Node node;
    };


    // $ANTLR start "expr"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:164:1: expr returns [String code, Node node] : t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* ;
    public final FunctionalLanguageParser.expr_return expr() throws RecognitionException {
        FunctionalLanguageParser.expr_return retval = new FunctionalLanguageParser.expr_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.term_return t =null;

        FunctionalLanguageParser.term_return t2 =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:165:2: (t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:165:4: t= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
            {
            pushFollow(FOLLOW_term_in_expr519);
            t=term();

            state._fsp--;



            	retval.code = (t!=null?t.code:null);
            	retval.node = new TermNode((t!=null?t.node:null));
            	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:171:12: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
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
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:171:14: PLUS t2= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_expr540); 

            	    pushFollow(FOLLOW_term_in_expr544);
            	    t2=term();

            	    state._fsp--;



            	              	retval.code+=(t2!=null?t2.code:null)+"\tadd\n";
            	              	retval.node = new PlusNode(retval.node, (t2!=null?t2.node:null));
            	              	

            	    }
            	    break;
            	case 2 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:177:14: MINUS t2= term
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_expr585); 

            	    pushFollow(FOLLOW_term_in_expr589);
            	    t2=term();

            	    state._fsp--;



            	              	retval.code =(t2!=null?t2.code:null)+retval.code+"\tsub\n";
            	              	retval.node = new MinusNode(retval.node, (t2!=null?t2.node:null));
            	              	

            	    }
            	    break;
            	case 3 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:182:14: OR t2= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_expr618); 

            	    pushFollow(FOLLOW_term_in_expr622);
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
            	                	     
            	            	retval.node = new OrNode(retval.node, (t2!=null?t2.node:null));    	    	    
            	           	

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
        public Node node;
    };


    // $ANTLR start "term"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:201:1: term returns [String code, Node node] : f= factor ( AND f2= factor )* ;
    public final FunctionalLanguageParser.term_return term() throws RecognitionException {
        FunctionalLanguageParser.term_return retval = new FunctionalLanguageParser.term_return();
        retval.start = input.LT(1);


        FunctionalLanguageParser.factor_return f =null;

        FunctionalLanguageParser.factor_return f2 =null;


        try {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:202:10: (f= factor ( AND f2= factor )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:202:12: f= factor ( AND f2= factor )*
            {
            pushFollow(FOLLOW_factor_in_term712);
            f=factor();

            state._fsp--;



                    	retval.code =(f!=null?f.code:null);
                    	retval.node = new FactorNode((f!=null?f.node:null));
                    	

            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:207:12: ( AND f2= factor )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==AND) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:207:13: AND f2= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term739); 

            	    pushFollow(FOLLOW_factor_in_term743);
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
            	    	        
            	           	retval.node = new AndNode(retval.node, (f2!=null?f2.node:null));		        
            	           	

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
        public Node node;
    };


    // $ANTLR start "factor"
    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:226:1: factor returns [String code, Node node] : (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR |i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr );
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
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:228:3: (n= NUMBER | TRUE | FALSE | EMPTY | NOT e= expr | LSPAR e= expr COMMA f= expr RSPAR |i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR ) | LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR ) | IF e1= expr THEN e2= expr ELSE e3= expr )
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
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:228:5: n= NUMBER
                    {
                    n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor792); 

                    retval.code = "\tpush "+(n!=null?n.getText():null)+"\n"; retval.node = new NumberNode(); 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:229:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_factor800); 

                    retval.code = "\tpush "+TRUEVALUE+"\n"; retval.node = new BoolNode(); 

                    }
                    break;
                case 3 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:230:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_factor808); 

                    retval.code = "\tpush "+FALSEVALUE+"\n"; retval.node = new BoolNode(); 

                    }
                    break;
                case 4 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:231:5: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_factor816); 

                    retval.code = "\tpush "+EMPTYVALUE+"\n"; retval.node = new ListNode(null, null);  

                    }
                    break;
                case 5 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:234:5: NOT e= expr
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor830); 

                    pushFollow(FOLLOW_expr_in_factor834);
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
                                	   
                            	retval.node = new NotNode((e!=null?e.node:null));
                             	

                    }
                    break;
                case 6 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:247:12: LSPAR e= expr COMMA f= expr RSPAR
                    {
                    match(input,LSPAR,FOLLOW_LSPAR_in_factor851); 

                    pushFollow(FOLLOW_expr_in_factor855);
                    e=expr();

                    state._fsp--;


                    match(input,COMMA,FOLLOW_COMMA_in_factor857); 

                    pushFollow(FOLLOW_expr_in_factor861);
                    f=expr();

                    state._fsp--;


                    match(input,RSPAR,FOLLOW_RSPAR_in_factor863); 


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
                                       
                                       retval.node = new ListNode((e!=null?e.node:null), (f!=null?f.node:null));
                          	

                    }
                    break;
                case 7 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:265:12: i= ID (| LPAR (e= expr ( COMMA f= expr )* )? RPAR )
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_factor891); 

                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:266:12: (| LPAR (e= expr ( COMMA f= expr )* )? RPAR )
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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:267:12: 
                            {

                                      	
                                      	// Retrieve id value from localSymTable, or from symTable
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
                                   	
                                   	// Retrieve id value from localTypeTable, or from typeTable
                                   	Type localTypeValue = (Type)localTypeTable.get((i!=null?i.getText():null));
                                        if (localTypeValue == null) {
                                        	Type typeValue = (Type)typeTable.get((i!=null?i.getText():null));
                            		if(typeValue == null){
                            			retval.node = new ErrorNode();
                            		}else{
                            			retval.node = new IdNode(typeValue);
                            		}
                                        } else {
                            		retval.node = new IdNode(localTypeValue);
                                   	}
                                   	
                                        

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:296:14: LPAR (e= expr ( COMMA f= expr )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_factor934); 


                                      	retval.code = "";
                                      	
                                      	// Func call
                                      	LinkedList<Node> funcParametersTypeList = new LinkedList<Node>();   	
                                      	

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:303:14: (e= expr ( COMMA f= expr )* )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==EMPTY||LA11_0==FALSE||(LA11_0 >= ID && LA11_0 <= IF)||(LA11_0 >= LPAR && LA11_0 <= LSPAR)||(LA11_0 >= NOT && LA11_0 <= NUMBER)||LA11_0==TRUE) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:303:15: e= expr ( COMMA f= expr )*
                                    {
                                    pushFollow(FOLLOW_expr_in_factor966);
                                    e=expr();

                                    state._fsp--;



                                              	  retval.code = (e!=null?e.code:null);
                                              	  
                                              	  // Save arguments expr
                                              	  funcParametersTypeList.add(new ExprNode((e!=null?e.node:null)));
                                              	  

                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:310:11: ( COMMA f= expr )*
                                    loop10:
                                    do {
                                        int alt10=2;
                                        int LA10_0 = input.LA(1);

                                        if ( (LA10_0==COMMA) ) {
                                            alt10=1;
                                        }


                                        switch (alt10) {
                                    	case 1 :
                                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:310:12: COMMA f= expr
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_factor995); 

                                    	    pushFollow(FOLLOW_expr_in_factor999);
                                    	    f=expr();

                                    	    state._fsp--;



                                    	           	  retval.code = (f!=null?f.code:null)+retval.code;
                                    	           	  funcParametersTypeList.add(new ExprNode((f!=null?f.node:null)));
                                    	           	  

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop10;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_factor1045); 


                                          
                                          retval.code = "\tlfp\n"+retval.code+"\tjal "+(i!=null?i.getText():null)+"\n";
                                          
                                          // Retrieve declared arguments in func declaration, from functionParametersTypeTable
                                          LinkedList<Type> declaredParametersTypeList = (LinkedList<Type>) functionParametersTypeTable.get((i!=null?i.getText():null));
                                          // Retrieve declared func return Type
                                          Type returnType =((Type)functionReturnValues.get((i!=null?i.getText():null)));
                                          
                                          // Using a list of list of arguments, to support nested func call
                                          funcParametersTypeListOfList.add(funcParametersTypeList);
                                          
                                          // Perform func invocation typecheck
                                          retval.node = new FuncNode( returnType, funcParametersTypeList, declaredParametersTypeList);
                                          
                                          // Clean..
                                          funcParametersTypeListOfList.removeLastOccurrence(funcParametersTypeList);
                                          

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:336:12: LPAR e= expr ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_factor1104); 

                    pushFollow(FOLLOW_expr_in_factor1108);
                    e=expr();

                    state._fsp--;


                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:337:12: ( RPAR | EQUAL e2= expr RPAR | LESS e2= expr RPAR | GREATER e2= expr RPAR | DOT ( FIRST | REST ) RPAR )
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
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:337:14: RPAR
                            {
                            match(input,RPAR,FOLLOW_RPAR_in_factor1124); 


                                      	retval.code = (e!=null?e.code:null);
                                      	retval.node = (e!=null?e.node:null);
                                      	

                            }
                            break;
                        case 2 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:342:14: EQUAL e2= expr RPAR
                            {
                            match(input,EQUAL,FOLLOW_EQUAL_in_factor1153); 

                            pushFollow(FOLLOW_expr_in_factor1157);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1159); 


                                        retval.code = (e2!=null?e2.code:null)+(e!=null?e.code:null)+
                                               "\tbeq label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                      	   
                                    	retval.node = new EqualNode((e!=null?e.node:null), (e2!=null?e2.node:null));
                                    	
                                     	

                            }
                            break;
                        case 3 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:355:14: LESS e2= expr RPAR
                            {
                            match(input,LESS,FOLLOW_LESS_in_factor1189); 

                            pushFollow(FOLLOW_expr_in_factor1193);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1195); 


                                        retval.code = (e2!=null?e2.code:null)+(e!=null?e.code:null)+
                                               "\tbless label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                      
                                   	retval.node = new LessNode((e!=null?e.node:null), (e2!=null?e2.node:null));
                                    	

                            }
                            break;
                        case 4 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:367:14: GREATER e2= expr RPAR
                            {
                            match(input,GREATER,FOLLOW_GREATER_in_factor1228); 

                            pushFollow(FOLLOW_expr_in_factor1232);
                            e2=expr();

                            state._fsp--;


                            match(input,RPAR,FOLLOW_RPAR_in_factor1234); 


                                        retval.code = (e!=null?e.code:null)+(e2!=null?e2.code:null)+
                                               "\tbless label"+(labelCounter++)+"\n"+
                                      	   "\tpush "+FALSEVALUE+"\n"+
                                      	   "\tb label"+(labelCounter++)+"\n"+
                                      	   "label"+(labelCounter-2)+":\n"+
                                      	   "\tpush "+TRUEVALUE+"\n"+
                                      	   "label"+(labelCounter-1)+":\n";
                                      	   
                                    	retval.node = new GreaterNode((e!=null?e.node:null), (e2!=null?e2.node:null));
                                   	

                            }
                            break;
                        case 5 :
                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:379:12: DOT ( FIRST | REST ) RPAR
                            {
                            match(input,DOT,FOLLOW_DOT_in_factor1266); 

                            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:380:13: ( FIRST | REST )
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
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:380:15: FIRST
                                    {
                                    match(input,FIRST,FOLLOW_FIRST_in_factor1291); 


                                                
                                                retval.code = (e!=null?e.code:null)+"\tlw\n";
                                                
                                                ExprNode checker = new ExprNode((e!=null?e.node:null));
                                                if(!checker.isListType()){
                                                	retval.node = new ErrorNode();
                                                }else{
                                                	retval.node = new FirstNode((e!=null?e.node:null));
                                                }
                                                

                                    }
                                    break;
                                case 2 :
                                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:392:15: REST
                                    {
                                    match(input,REST,FOLLOW_REST_in_factor1323); 


                                                retval.code = (e!=null?e.code:null)+
                                                                 "\tpush 1"+
                                                                 "\tadd\n"+
                                                                 "\tlw\n";    
                                                                 
                                           	ExprNode checker = new ExprNode((e!=null?e.node:null));
                                              	 if(!checker.isListType()){
                                                	retval.node = new ErrorNode();
                                                }else{
                                                	retval.node =checker;
                                                }  
                                             	

                                    }
                                    break;

                            }


                            match(input,RPAR,FOLLOW_RPAR_in_factor1353); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:408:6: IF e1= expr THEN e2= expr ELSE e3= expr
                    {
                    match(input,IF,FOLLOW_IF_in_factor1385); 

                    pushFollow(FOLLOW_expr_in_factor1389);
                    e1=expr();

                    state._fsp--;


                    match(input,THEN,FOLLOW_THEN_in_factor1391); 

                    pushFollow(FOLLOW_expr_in_factor1395);
                    e2=expr();

                    state._fsp--;


                    match(input,ELSE,FOLLOW_ELSE_in_factor1397); 

                    pushFollow(FOLLOW_expr_in_factor1401);
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
                            
                            	retval.node = new IfNode((e1!=null?e1.node:null), (e2!=null?e2.node:null), (e3!=null?e3.node:null));
                          	

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
    public static final BitSet FOLLOW_command_in_prog69 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_SEMIC_in_prog71 = new BitSet(new long[]{0x0000000020000202L});
    public static final BitSet FOLLOW_primitiveType_in_type102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundType_in_type111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_primitiveType137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LISTOF_in_compoundType158 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LSPAR_in_compoundType160 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_primitiveType_in_compoundType164 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RSPAR_in_compoundType166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEF_in_command187 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_command191 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command195 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ASS_in_command210 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_command256 = new BitSet(new long[]{0x0000000080280040L});
    public static final BitSet FOLLOW_type_in_command302 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command318 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_COMMA_in_command348 = new BitSet(new long[]{0x0000000000280040L});
    public static final BitSet FOLLOW_type_in_command352 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_command356 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_RPAR_in_command391 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASS_in_command420 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_command466 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_command470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expr519 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_PLUS_in_expr540 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr544 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_MINUS_in_expr585 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr589 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_OR_in_expr618 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_term_in_expr622 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_factor_in_term712 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_term739 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_factor_in_term743 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NUMBER_in_factor792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factor800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factor808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_factor816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor830 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSPAR_in_factor851 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor855 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_factor857 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor861 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RSPAR_in_factor863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor891 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LPAR_in_factor934 = new BitSet(new long[]{0x0000000886C65000L});
    public static final BitSet FOLLOW_expr_in_factor966 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_COMMA_in_factor995 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor999 = new BitSet(new long[]{0x0000000080000080L});
    public static final BitSet FOLLOW_RPAR_in_factor1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_factor1104 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1108 = new BitSet(new long[]{0x0000000080112400L});
    public static final BitSet FOLLOW_RPAR_in_factor1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_factor1153 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1157 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_factor1189 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1193 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_in_factor1228 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1232 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_factor1266 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_FIRST_in_factor1291 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_REST_in_factor1323 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RPAR_in_factor1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_factor1385 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1389 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_THEN_in_factor1391 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1395 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ELSE_in_factor1397 = new BitSet(new long[]{0x0000000806C65000L});
    public static final BitSet FOLLOW_expr_in_factor1401 = new BitSet(new long[]{0x0000000000000002L});

}
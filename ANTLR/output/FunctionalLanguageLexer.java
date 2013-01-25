// $ANTLR 3.4 /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g 2013-01-24 19:21:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FunctionalLanguageLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FunctionalLanguageLexer() {} 
    public FunctionalLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FunctionalLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:445:10: ( '+' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:445:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:446:10: ( '-' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:446:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:447:10: ( '(' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:447:12: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:448:7: ( ')' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:448:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "LSPAR"
    public final void mLSPAR() throws RecognitionException {
        try {
            int _type = LSPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:449:10: ( '[' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:449:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSPAR"

    // $ANTLR start "RSPAR"
    public final void mRSPAR() throws RecognitionException {
        try {
            int _type = RSPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:450:7: ( ']' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:450:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSPAR"

    // $ANTLR start "SEMIC"
    public final void mSEMIC() throws RecognitionException {
        try {
            int _type = SEMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:451:10: ( ';' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:451:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMIC"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:452:10: ( ',' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:452:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:453:6: ( '.' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:453:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:454:11: ( 'def' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:454:13: 'def'
            {
            match("def"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "ASS"
    public final void mASS() throws RecognitionException {
        try {
            int _type = ASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:455:10: ( '=' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:455:12: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASS"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:456:7: ( '==' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:456:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:457:7: ( '<' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:457:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:458:9: ( '>' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:458:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:459:5: ( '||' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:459:7: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:460:6: ( '&&' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:460:8: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:461:6: ( '!' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:461:8: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:462:9: ( 'print' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:462:11: 'print'
            {
            match("print"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:463:5: ( 'if' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:463:7: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:464:7: ( 'then' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:464:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:465:7: ( 'else' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:465:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:466:7: ( 'true' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:466:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:467:8: ( 'false' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:467:10: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "EMPTY"
    public final void mEMPTY() throws RecognitionException {
        try {
            int _type = EMPTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:468:8: ( 'empty' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:468:10: 'empty'
            {
            match("empty"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EMPTY"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:469:8: ( 'first' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:469:10: 'first'
            {
            match("first"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "REST"
    public final void mREST() throws RecognitionException {
        try {
            int _type = REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:470:7: ( 'rest' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:470:9: 'rest'
            {
            match("rest"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REST"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:471:7: ( 'INT' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:471:9: 'INT'
            {
            match("INT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "BOOL"
    public final void mBOOL() throws RecognitionException {
        try {
            int _type = BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:472:7: ( 'BOOL' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:472:10: 'BOOL'
            {
            match("BOOL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL"

    // $ANTLR start "LISTOF"
    public final void mLISTOF() throws RecognitionException {
        try {
            int _type = LISTOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:473:9: ( 'LIST-OF' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:473:11: 'LIST-OF'
            {
            match("LIST-OF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LISTOF"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:474:10: ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:474:12: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:474:18: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:474:18: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:474:19: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:474:29: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:475:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:475:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:475:28: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WHITESP"
    public final void mWHITESP() throws RecognitionException {
        try {
            int _type = WHITESP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:476:10: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:476:12: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:476:12: ( '\\t' | ' ' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:477:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:477:12: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:477:17: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:477:44: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match("*/"); 



             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:8: ( PLUS | MINUS | LPAR | RPAR | LSPAR | RSPAR | SEMIC | COMMA | DOT | DEF | ASS | EQUAL | LESS | GREATER | OR | AND | NOT | PRINT | IF | THEN | ELSE | TRUE | FALSE | EMPTY | FIRST | REST | INT | BOOL | LISTOF | NUMBER | ID | WHITESP | COMMENT )
        int alt6=33;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:10: PLUS
                {
                mPLUS(); 


                }
                break;
            case 2 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:15: MINUS
                {
                mMINUS(); 


                }
                break;
            case 3 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:21: LPAR
                {
                mLPAR(); 


                }
                break;
            case 4 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:26: RPAR
                {
                mRPAR(); 


                }
                break;
            case 5 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:31: LSPAR
                {
                mLSPAR(); 


                }
                break;
            case 6 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:37: RSPAR
                {
                mRSPAR(); 


                }
                break;
            case 7 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:43: SEMIC
                {
                mSEMIC(); 


                }
                break;
            case 8 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:49: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 9 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:55: DOT
                {
                mDOT(); 


                }
                break;
            case 10 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:59: DEF
                {
                mDEF(); 


                }
                break;
            case 11 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:63: ASS
                {
                mASS(); 


                }
                break;
            case 12 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:67: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 13 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:73: LESS
                {
                mLESS(); 


                }
                break;
            case 14 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:78: GREATER
                {
                mGREATER(); 


                }
                break;
            case 15 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:86: OR
                {
                mOR(); 


                }
                break;
            case 16 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:89: AND
                {
                mAND(); 


                }
                break;
            case 17 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:93: NOT
                {
                mNOT(); 


                }
                break;
            case 18 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:97: PRINT
                {
                mPRINT(); 


                }
                break;
            case 19 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:103: IF
                {
                mIF(); 


                }
                break;
            case 20 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:106: THEN
                {
                mTHEN(); 


                }
                break;
            case 21 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:111: ELSE
                {
                mELSE(); 


                }
                break;
            case 22 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:116: TRUE
                {
                mTRUE(); 


                }
                break;
            case 23 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:121: FALSE
                {
                mFALSE(); 


                }
                break;
            case 24 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:127: EMPTY
                {
                mEMPTY(); 


                }
                break;
            case 25 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:133: FIRST
                {
                mFIRST(); 


                }
                break;
            case 26 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:139: REST
                {
                mREST(); 


                }
                break;
            case 27 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:144: INT
                {
                mINT(); 


                }
                break;
            case 28 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:148: BOOL
                {
                mBOOL(); 


                }
                break;
            case 29 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:153: LISTOF
                {
                mLISTOF(); 


                }
                break;
            case 30 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:160: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 31 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:167: ID
                {
                mID(); 


                }
                break;
            case 32 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:170: WHITESP
                {
                mWHITESP(); 


                }
                break;
            case 33 :
                // /Users/ale/Dropbox/Dev/LPMCProject/ANTLR/FunctionalLanguage.g:1:178: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\12\uffff\1\33\1\40\5\uffff\11\33\4\uffff\1\33\2\uffff\1\33\1\57"+
        "\12\33\1\72\1\33\1\uffff\7\33\1\103\2\33\1\uffff\1\33\1\107\1\110"+
        "\1\111\3\33\1\115\1\uffff\1\116\1\33\1\120\3\uffff\1\121\1\122\1"+
        "\123\7\uffff";
    static final String DFA6_eofS =
        "\124\uffff";
    static final String DFA6_minS =
        "\1\11\11\uffff\1\145\1\75\5\uffff\1\162\1\146\1\150\1\154\1\141"+
        "\1\145\1\116\1\117\1\111\4\uffff\1\146\2\uffff\1\151\1\60\1\145"+
        "\1\165\1\163\1\160\1\154\1\162\1\163\1\124\1\117\1\123\1\60\1\156"+
        "\1\uffff\1\156\2\145\1\164\2\163\1\164\1\60\1\114\1\124\1\uffff"+
        "\1\164\3\60\1\171\1\145\1\164\1\60\1\uffff\1\60\1\55\1\60\3\uffff"+
        "\3\60\7\uffff";
    static final String DFA6_maxS =
        "\1\174\11\uffff\1\145\1\75\5\uffff\1\162\1\146\1\162\1\155\1\151"+
        "\1\145\1\116\1\117\1\111\4\uffff\1\146\2\uffff\1\151\1\172\1\145"+
        "\1\165\1\163\1\160\1\154\1\162\1\163\1\124\1\117\1\123\1\172\1\156"+
        "\1\uffff\1\156\2\145\1\164\2\163\1\164\1\172\1\114\1\124\1\uffff"+
        "\1\164\3\172\1\171\1\145\1\164\1\172\1\uffff\1\172\1\55\1\172\3"+
        "\uffff\3\172\7\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\15\1\16"+
        "\1\17\1\20\1\21\11\uffff\1\36\1\37\1\40\1\41\1\uffff\1\14\1\13\16"+
        "\uffff\1\23\12\uffff\1\12\10\uffff\1\33\3\uffff\1\24\1\26\1\25\3"+
        "\uffff\1\32\1\34\1\35\1\22\1\30\1\27\1\31";
    static final String DFA6_specialS =
        "\124\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\34\2\uffff\1\34\22\uffff\1\34\1\20\4\uffff\1\17\1\uffff\1"+
            "\3\1\4\1\uffff\1\1\1\10\1\2\1\11\1\35\12\32\1\uffff\1\7\1\14"+
            "\1\13\1\15\2\uffff\1\33\1\30\6\33\1\27\2\33\1\31\16\33\1\5\1"+
            "\uffff\1\6\3\uffff\3\33\1\12\1\24\1\25\2\33\1\22\6\33\1\21\1"+
            "\33\1\26\1\33\1\23\6\33\1\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43\11\uffff\1\44",
            "\1\45\1\46",
            "\1\47\7\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "",
            "",
            "",
            "\1\55",
            "",
            "",
            "\1\56",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\1\117",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "\12\33\7\uffff\32\33\6\uffff\32\33",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | LPAR | RPAR | LSPAR | RSPAR | SEMIC | COMMA | DOT | DEF | ASS | EQUAL | LESS | GREATER | OR | AND | NOT | PRINT | IF | THEN | ELSE | TRUE | FALSE | EMPTY | FIRST | REST | INT | BOOL | LISTOF | NUMBER | ID | WHITESP | COMMENT );";
        }
    }
 

}
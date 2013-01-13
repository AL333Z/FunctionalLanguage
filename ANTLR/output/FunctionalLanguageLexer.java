// $ANTLR 3.2 Sep 23, 2009 12:02:23 S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g 2012-12-14 16:53:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FunctionalLanguageLexer extends Lexer {
    public static final int DEF=5;
    public static final int REST=28;
    public static final int ELSE=31;
    public static final int NUMBER=16;
    public static final int LSPAR=21;
    public static final int NOT=20;
    public static final int MINUS=13;
    public static final int ID=6;
    public static final int AND=15;
    public static final int EOF=-1;
    public static final int WHITESP=32;
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
    public static final int PLUS=12;
    public static final int RPAR=10;
    public static final int ASS=7;
    public static final int SEMIC=4;
    public static final int DOT=26;
    public static final int COMMENT=33;
    public static final int FALSE=18;
    public static final int FIRST=27;

    // delegates
    // delegators

    public FunctionalLanguageLexer() {;} 
    public FunctionalLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FunctionalLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:195:9: ( '+' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:195:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:196:9: ( '-' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:196:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:197:9: ( '(' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:197:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:198:6: ( ')' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:198:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "LSPAR"
    public final void mLSPAR() throws RecognitionException {
        try {
            int _type = LSPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:199:9: ( '[' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:199:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LSPAR"

    // $ANTLR start "RSPAR"
    public final void mRSPAR() throws RecognitionException {
        try {
            int _type = RSPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:200:7: ( ']' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:200:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RSPAR"

    // $ANTLR start "SEMIC"
    public final void mSEMIC() throws RecognitionException {
        try {
            int _type = SEMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:201:9: ( ';' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:201:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMIC"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:202:9: ( ',' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:202:11: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:203:5: ( '.' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:203:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:204:9: ( 'def' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:204:11: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "ASS"
    public final void mASS() throws RecognitionException {
        try {
            int _type = ASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:205:9: ( '=' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:205:11: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASS"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:206:7: ( '==' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:206:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:207:6: ( '<' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:207:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:208:9: ( '>' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:208:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:209:4: ( '||' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:209:6: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:210:5: ( '&&' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:210:7: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:211:5: ( '!' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:211:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:212:9: ( 'print' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:212:11: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:213:4: ( 'if' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:213:6: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:214:6: ( 'then' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:214:8: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:215:6: ( 'else' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:215:8: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:216:6: ( 'true' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:216:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:217:7: ( 'false' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:217:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "EMPTY"
    public final void mEMPTY() throws RecognitionException {
        try {
            int _type = EMPTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:218:7: ( 'empty' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:218:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMPTY"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:219:7: ( 'first' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:219:9: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "REST"
    public final void mREST() throws RecognitionException {
        try {
            int _type = REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:220:6: ( 'rest' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:220:8: 'rest'
            {
            match("rest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REST"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:9: ( '0' | ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='0') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:11: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:17: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:17: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:18: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:18: ( '1' .. '9' )
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:19: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:28: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:221:29: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:222:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:222:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:223:11: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WHITESP"
    public final void mWHITESP() throws RecognitionException {
        try {
            int _type = WHITESP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:224:9: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:224:11: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:224:11: ( '\\t' | ' ' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "WHITESP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:225:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:225:11: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:225:16: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:225:43: .
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
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:8: ( PLUS | MINUS | LPAR | RPAR | LSPAR | RSPAR | SEMIC | COMMA | DOT | DEF | ASS | EQUAL | LESS | GREATER | OR | AND | NOT | PRINT | IF | THEN | ELSE | TRUE | FALSE | EMPTY | FIRST | REST | NUMBER | ID | WHITESP | COMMENT )
        int alt6=30;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:21: LPAR
                {
                mLPAR(); 

                }
                break;
            case 4 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:26: RPAR
                {
                mRPAR(); 

                }
                break;
            case 5 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:31: LSPAR
                {
                mLSPAR(); 

                }
                break;
            case 6 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:37: RSPAR
                {
                mRSPAR(); 

                }
                break;
            case 7 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:43: SEMIC
                {
                mSEMIC(); 

                }
                break;
            case 8 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:49: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 9 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:55: DOT
                {
                mDOT(); 

                }
                break;
            case 10 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:59: DEF
                {
                mDEF(); 

                }
                break;
            case 11 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:63: ASS
                {
                mASS(); 

                }
                break;
            case 12 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:67: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 13 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:73: LESS
                {
                mLESS(); 

                }
                break;
            case 14 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:78: GREATER
                {
                mGREATER(); 

                }
                break;
            case 15 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:86: OR
                {
                mOR(); 

                }
                break;
            case 16 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:89: AND
                {
                mAND(); 

                }
                break;
            case 17 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:93: NOT
                {
                mNOT(); 

                }
                break;
            case 18 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:97: PRINT
                {
                mPRINT(); 

                }
                break;
            case 19 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:103: IF
                {
                mIF(); 

                }
                break;
            case 20 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:106: THEN
                {
                mTHEN(); 

                }
                break;
            case 21 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:111: ELSE
                {
                mELSE(); 

                }
                break;
            case 22 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:116: TRUE
                {
                mTRUE(); 

                }
                break;
            case 23 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:121: FALSE
                {
                mFALSE(); 

                }
                break;
            case 24 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:127: EMPTY
                {
                mEMPTY(); 

                }
                break;
            case 25 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:133: FIRST
                {
                mFIRST(); 

                }
                break;
            case 26 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:139: REST
                {
                mREST(); 

                }
                break;
            case 27 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:144: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 28 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:151: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:154: WHITESP
                {
                mWHITESP(); 

                }
                break;
            case 30 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\FunctionalLanguage.g:1:162: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\12\uffff\1\30\1\35\5\uffff\6\30\4\uffff\1\30\2\uffff\1\30\1\51"+
        "\7\30\1\61\1\30\1\uffff\7\30\1\uffff\1\30\1\73\1\74\1\75\3\30\1"+
        "\101\1\102\3\uffff\1\103\1\104\1\105\5\uffff";
    static final String DFA6_eofS =
        "\106\uffff";
    static final String DFA6_minS =
        "\1\11\11\uffff\1\145\1\75\5\uffff\1\162\1\146\1\150\1\154\1\141"+
        "\1\145\4\uffff\1\146\2\uffff\1\151\1\60\1\145\1\165\1\163\1\160"+
        "\1\154\1\162\1\163\1\60\1\156\1\uffff\1\156\2\145\1\164\2\163\1"+
        "\164\1\uffff\1\164\3\60\1\171\1\145\1\164\2\60\3\uffff\3\60\5\uffff";
    static final String DFA6_maxS =
        "\1\174\11\uffff\1\145\1\75\5\uffff\1\162\1\146\1\162\1\155\1\151"+
        "\1\145\4\uffff\1\146\2\uffff\1\151\1\172\1\145\1\165\1\163\1\160"+
        "\1\154\1\162\1\163\1\172\1\156\1\uffff\1\156\2\145\1\164\2\163\1"+
        "\164\1\uffff\1\164\3\172\1\171\1\145\1\164\2\172\3\uffff\3\172\5"+
        "\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\15\1\16"+
        "\1\17\1\20\1\21\6\uffff\1\33\1\34\1\35\1\36\1\uffff\1\14\1\13\13"+
        "\uffff\1\23\7\uffff\1\12\11\uffff\1\24\1\26\1\25\3\uffff\1\32\1"+
        "\22\1\30\1\27\1\31";
    static final String DFA6_specialS =
        "\106\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\20\4\uffff\1\17\1\uffff"+
            "\1\3\1\4\1\uffff\1\1\1\10\1\2\1\11\1\32\12\27\1\uffff\1\7\1"+
            "\14\1\13\1\15\2\uffff\32\30\1\5\1\uffff\1\6\3\uffff\3\30\1\12"+
            "\1\24\1\25\2\30\1\22\6\30\1\21\1\30\1\26\1\30\1\23\6\30\1\uffff"+
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40\11\uffff\1\41",
            "\1\42\1\43",
            "\1\44\7\uffff\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "\1\47",
            "",
            "",
            "\1\50",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\76",
            "\1\77",
            "\1\100",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
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
            return "1:1: Tokens : ( PLUS | MINUS | LPAR | RPAR | LSPAR | RSPAR | SEMIC | COMMA | DOT | DEF | ASS | EQUAL | LESS | GREATER | OR | AND | NOT | PRINT | IF | THEN | ELSE | TRUE | FALSE | EMPTY | FIRST | REST | NUMBER | ID | WHITESP | COMMENT );";
        }
    }
 

}
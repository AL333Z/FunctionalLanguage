// $ANTLR 3.2 Sep 23, 2009 12:02:23 S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g 2012-12-14 16:30:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class StackVirtualMachineLexer extends Lexer {
    public static final int JAL=26;
    public static final int BRANCHEQ=24;
    public static final int HALT=29;
    public static final int STORESP=14;
    public static final int NUMBER=5;
    public static final int LOADSP=13;
    public static final int SUB=8;
    public static final int LOADW=9;
    public static final int STORERV=20;
    public static final int EOF=-1;
    public static final int WHITESP=30;
    public static final int PRINT=28;
    public static final int PUSH=4;
    public static final int LOADRA=17;
    public static final int STOREW=10;
    public static final int LOADFP=11;
    public static final int LOADRV=19;
    public static final int STORERA=18;
    public static final int STOREFP=12;
    public static final int LABEL=21;
    public static final int STOREHP=16;
    public static final int JRA=27;
    public static final int BRANCHLESS=25;
    public static final int POP=6;
    public static final int COL=22;
    public static final int BRANCH=23;
    public static final int LOADHP=15;
    public static final int ADD=7;

    // delegates
    // delegators

    public StackVirtualMachineLexer() {;} 
    public StackVirtualMachineLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public StackVirtualMachineLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g"; }

    // $ANTLR start "PUSH"
    public final void mPUSH() throws RecognitionException {
        try {
            int _type = PUSH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:73:7: ( 'push' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:73:9: 'push'
            {
            match("push"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PUSH"

    // $ANTLR start "POP"
    public final void mPOP() throws RecognitionException {
        try {
            int _type = POP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:74:5: ( 'pop' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:74:7: 'pop'
            {
            match("pop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POP"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:75:5: ( 'add' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:75:7: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "SUB"
    public final void mSUB() throws RecognitionException {
        try {
            int _type = SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:76:5: ( 'sub' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:76:7: 'sub'
            {
            match("sub"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUB"

    // $ANTLR start "LOADW"
    public final void mLOADW() throws RecognitionException {
        try {
            int _type = LOADW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:77:7: ( 'lw' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:77:9: 'lw'
            {
            match("lw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOADW"

    // $ANTLR start "STOREW"
    public final void mSTOREW() throws RecognitionException {
        try {
            int _type = STOREW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:78:8: ( 'sw' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:78:10: 'sw'
            {
            match("sw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STOREW"

    // $ANTLR start "LOADFP"
    public final void mLOADFP() throws RecognitionException {
        try {
            int _type = LOADFP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:79:9: ( 'lfp' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:79:11: 'lfp'
            {
            match("lfp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOADFP"

    // $ANTLR start "STOREFP"
    public final void mSTOREFP() throws RecognitionException {
        try {
            int _type = STOREFP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:80:9: ( 'sfp' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:80:11: 'sfp'
            {
            match("sfp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STOREFP"

    // $ANTLR start "LOADSP"
    public final void mLOADSP() throws RecognitionException {
        try {
            int _type = LOADSP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:81:9: ( 'lsp' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:81:11: 'lsp'
            {
            match("lsp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOADSP"

    // $ANTLR start "STORESP"
    public final void mSTORESP() throws RecognitionException {
        try {
            int _type = STORESP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:82:9: ( 'ssp' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:82:11: 'ssp'
            {
            match("ssp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STORESP"

    // $ANTLR start "LOADHP"
    public final void mLOADHP() throws RecognitionException {
        try {
            int _type = LOADHP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:83:9: ( 'lhp' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:83:11: 'lhp'
            {
            match("lhp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOADHP"

    // $ANTLR start "STOREHP"
    public final void mSTOREHP() throws RecognitionException {
        try {
            int _type = STOREHP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:84:9: ( 'shp' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:84:11: 'shp'
            {
            match("shp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STOREHP"

    // $ANTLR start "LOADRA"
    public final void mLOADRA() throws RecognitionException {
        try {
            int _type = LOADRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:85:9: ( 'lra' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:85:11: 'lra'
            {
            match("lra"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOADRA"

    // $ANTLR start "STORERA"
    public final void mSTORERA() throws RecognitionException {
        try {
            int _type = STORERA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:86:9: ( 'sra' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:86:11: 'sra'
            {
            match("sra"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STORERA"

    // $ANTLR start "LOADRV"
    public final void mLOADRV() throws RecognitionException {
        try {
            int _type = LOADRV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:87:9: ( 'lrv' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:87:11: 'lrv'
            {
            match("lrv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOADRV"

    // $ANTLR start "STORERV"
    public final void mSTORERV() throws RecognitionException {
        try {
            int _type = STORERV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:88:9: ( 'srv' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:88:11: 'srv'
            {
            match("srv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STORERV"

    // $ANTLR start "BRANCH"
    public final void mBRANCH() throws RecognitionException {
        try {
            int _type = BRANCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:89:8: ( 'b' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:89:10: 'b'
            {
            match('b'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRANCH"

    // $ANTLR start "BRANCHEQ"
    public final void mBRANCHEQ() throws RecognitionException {
        try {
            int _type = BRANCHEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:90:9: ( 'beq' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:90:11: 'beq'
            {
            match("beq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRANCHEQ"

    // $ANTLR start "BRANCHLESS"
    public final void mBRANCHLESS() throws RecognitionException {
        try {
            int _type = BRANCHLESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:92:2: ( 'bless' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:92:4: 'bless'
            {
            match("bless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BRANCHLESS"

    // $ANTLR start "JAL"
    public final void mJAL() throws RecognitionException {
        try {
            int _type = JAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:93:5: ( 'jal' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:93:7: 'jal'
            {
            match("jal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JAL"

    // $ANTLR start "JRA"
    public final void mJRA() throws RecognitionException {
        try {
            int _type = JRA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:94:5: ( 'jra' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:94:7: 'jra'
            {
            match("jra"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JRA"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:95:7: ( 'print' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:95:9: 'print'
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

    // $ANTLR start "HALT"
    public final void mHALT() throws RecognitionException {
        try {
            int _type = HALT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:96:6: ( 'halt' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:96:8: 'halt'
            {
            match("halt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HALT"

    // $ANTLR start "COL"
    public final void mCOL() throws RecognitionException {
        try {
            int _type = COL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:97:5: ( ':' )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:97:7: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COL"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:9: ( '0' | ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( (LA3_0=='-'||(LA3_0>='1' && LA3_0<='9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:11: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:17: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:17: ( '-' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='-') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:18: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:23: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:24: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:24: ( '1' .. '9' )
                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:25: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:34: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:98:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
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

    // $ANTLR start "LABEL"
    public final void mLABEL() throws RecognitionException {
        try {
            int _type = LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:99:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )* )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:99:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:100:11: ( '0' .. '9' | 'a' .. 'z' | 'A' .. 'Z' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LABEL"

    // $ANTLR start "WHITESP"
    public final void mWHITESP() throws RecognitionException {
        try {
            int _type = WHITESP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:101:9: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:101:11: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:101:11: ( '\\t' | ' ' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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

    public void mTokens() throws RecognitionException {
        // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:8: ( PUSH | POP | ADD | SUB | LOADW | STOREW | LOADFP | STOREFP | LOADSP | STORESP | LOADHP | STOREHP | LOADRA | STORERA | LOADRV | STORERV | BRANCH | BRANCHEQ | BRANCHLESS | JAL | JRA | PRINT | HALT | COL | NUMBER | LABEL | WHITESP )
        int alt6=27;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:10: PUSH
                {
                mPUSH(); 

                }
                break;
            case 2 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:15: POP
                {
                mPOP(); 

                }
                break;
            case 3 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:19: ADD
                {
                mADD(); 

                }
                break;
            case 4 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:23: SUB
                {
                mSUB(); 

                }
                break;
            case 5 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:27: LOADW
                {
                mLOADW(); 

                }
                break;
            case 6 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:33: STOREW
                {
                mSTOREW(); 

                }
                break;
            case 7 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:40: LOADFP
                {
                mLOADFP(); 

                }
                break;
            case 8 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:47: STOREFP
                {
                mSTOREFP(); 

                }
                break;
            case 9 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:55: LOADSP
                {
                mLOADSP(); 

                }
                break;
            case 10 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:62: STORESP
                {
                mSTORESP(); 

                }
                break;
            case 11 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:70: LOADHP
                {
                mLOADHP(); 

                }
                break;
            case 12 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:77: STOREHP
                {
                mSTOREHP(); 

                }
                break;
            case 13 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:85: LOADRA
                {
                mLOADRA(); 

                }
                break;
            case 14 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:92: STORERA
                {
                mSTORERA(); 

                }
                break;
            case 15 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:100: LOADRV
                {
                mLOADRV(); 

                }
                break;
            case 16 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:107: STORERV
                {
                mSTORERV(); 

                }
                break;
            case 17 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:115: BRANCH
                {
                mBRANCH(); 

                }
                break;
            case 18 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:122: BRANCHEQ
                {
                mBRANCHEQ(); 

                }
                break;
            case 19 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:131: BRANCHLESS
                {
                mBRANCHLESS(); 

                }
                break;
            case 20 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:142: JAL
                {
                mJAL(); 

                }
                break;
            case 21 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:146: JRA
                {
                mJRA(); 

                }
                break;
            case 22 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:150: PRINT
                {
                mPRINT(); 

                }
                break;
            case 23 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:156: HALT
                {
                mHALT(); 

                }
                break;
            case 24 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:161: COL
                {
                mCOL(); 

                }
                break;
            case 25 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:165: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 26 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:172: LABEL
                {
                mLABEL(); 

                }
                break;
            case 27 :
                // S:\\LPeMC\\Materiale Didattico\\ANTLR\\Esercitazione2012_12_14\\StackVirtualMachine.g:1:178: WHITESP
                {
                mWHITESP(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\4\12\1\35\2\12\4\uffff\5\12\1\46\4\12\1\54\6\12\1\uffff"+
        "\4\12\1\70\1\12\1\72\1\73\1\uffff\1\74\1\75\1\76\1\77\1\100\1\uffff"+
        "\1\101\1\102\1\103\1\104\1\105\1\106\1\12\1\110\1\111\1\12\1\113"+
        "\1\uffff\1\12\15\uffff\1\12\2\uffff\1\116\1\uffff\1\117\1\120\3"+
        "\uffff";
    static final String DFA6_eofS =
        "\121\uffff";
    static final String DFA6_minS =
        "\1\11\1\157\1\144\2\146\1\60\2\141\4\uffff\1\163\1\160\1\151\1"+
        "\144\1\142\1\60\3\160\1\141\1\60\3\160\1\141\1\161\1\145\1\uffff"+
        "\1\154\1\141\1\154\1\150\1\60\1\156\2\60\1\uffff\5\60\1\uffff\6"+
        "\60\1\163\2\60\1\164\1\60\1\uffff\1\164\15\uffff\1\163\2\uffff\1"+
        "\60\1\uffff\2\60\3\uffff";
    static final String DFA6_maxS =
        "\1\172\1\165\1\144\2\167\1\172\1\162\1\141\4\uffff\1\163\1\160"+
        "\1\151\1\144\1\142\1\172\3\160\1\166\1\172\3\160\1\166\1\161\1\145"+
        "\1\uffff\1\154\1\141\1\154\1\150\1\172\1\156\2\172\1\uffff\5\172"+
        "\1\uffff\6\172\1\163\2\172\1\164\1\172\1\uffff\1\164\15\uffff\1"+
        "\163\2\uffff\1\172\1\uffff\2\172\3\uffff";
    static final String DFA6_acceptS =
        "\10\uffff\1\30\1\31\1\32\1\33\21\uffff\1\21\10\uffff\1\6\5\uffff"+
        "\1\5\13\uffff\1\2\1\uffff\1\3\1\4\1\10\1\12\1\14\1\16\1\20\1\7\1"+
        "\11\1\13\1\15\1\17\1\22\1\uffff\1\24\1\25\1\uffff\1\1\2\uffff\1"+
        "\27\1\26\1\23";
    static final String DFA6_specialS =
        "\121\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\13\2\uffff\1\13\22\uffff\1\13\14\uffff\1\11\2\uffff\12\11"+
            "\1\10\6\uffff\32\12\6\uffff\1\2\1\5\5\12\1\7\1\12\1\6\1\12\1"+
            "\4\3\12\1\1\2\12\1\3\7\12",
            "\1\15\2\uffff\1\16\2\uffff\1\14",
            "\1\17",
            "\1\22\1\uffff\1\24\11\uffff\1\25\1\23\1\uffff\1\20\1\uffff"+
            "\1\21",
            "\1\27\1\uffff\1\31\11\uffff\1\32\1\30\3\uffff\1\26",
            "\12\12\7\uffff\32\12\6\uffff\4\12\1\33\6\12\1\34\16\12",
            "\1\36\20\uffff\1\37",
            "\1\40",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\24\uffff\1\53",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\24\uffff\1\61",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\71",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\107",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\112",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
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
            return "1:1: Tokens : ( PUSH | POP | ADD | SUB | LOADW | STOREW | LOADFP | STOREFP | LOADSP | STORESP | LOADHP | STOREHP | LOADRA | STORERA | LOADRV | STORERV | BRANCH | BRANCHEQ | BRANCHLESS | JAL | JRA | PRINT | HALT | COL | NUMBER | LABEL | WHITESP );";
        }
    }
 

}
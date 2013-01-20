
import org.antlr.runtime.*;

import com.al333z.typechecking.Checker;
import com.al333z.typechecking.CommandChecker;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;


class Test {

    public static void main(String[] args) throws Exception {
      
        FunctionalLanguageLexer lex = new FunctionalLanguageLexer(new ANTLRFileStream("bin/"+args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        FunctionalLanguageParser parser = new FunctionalLanguageParser(tokens);
        
        FunctionalLanguageParser.prog_return ret = parser.prog();
        String code = ret.code;
        //System.out.println("Code: "+code);
        
        FileWriter fstream = new FileWriter(args[0]+".asm");
        fstream.write(code);
        fstream.close();
        
        Checker progChecker = ret.typecheck;
        int res = progChecker.check();
        System.out.println("Res: "+res);
        
        if (res != Checker.ERROR) {
        	// Let's run!
        	
            StackVirtualMachineLexer lex2 = new StackVirtualMachineLexer(new ANTLRFileStream(args[0]+".asm"));
            CommonTokenStream tokens2 = new CommonTokenStream(lex2);
            StackVirtualMachineParser parser2 = new StackVirtualMachineParser(tokens2);
          
            SVM m = new SVM(parser2.createCode());
            
            m.run();
		}
    }
}

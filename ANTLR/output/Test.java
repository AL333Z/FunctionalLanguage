
import org.antlr.runtime.*;

import com.al333z.type.Type;
import com.al333z.typechecking.Node;
import com.al333z.typechecking.CommandNode;

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
        
        Node progChecker = ret.node;
        Type res = progChecker.check();
        System.out.println("Res: "+res);
        
        if (!res.isErrorType()) {
        	// Let's run!
        	
            StackVirtualMachineLexer lex2 = new StackVirtualMachineLexer(new ANTLRFileStream(args[0]+".asm"));
            CommonTokenStream tokens2 = new CommonTokenStream(lex2);
            StackVirtualMachineParser parser2 = new StackVirtualMachineParser(tokens2);
          
            SVM m = new SVM(parser2.createCode());
            
            m.run();
		}
        
    }
}

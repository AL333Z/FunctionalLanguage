
import org.antlr.runtime.*;
import java.io.*;


class Test {

    public static void main(String[] args) throws Exception {
      
        FunctionalLanguageLexer lex = new FunctionalLanguageLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        FunctionalLanguageParser parser = new FunctionalLanguageParser(tokens);
        
        FileWriter fstream = new FileWriter(args[0]+".asm");
        fstream.write(parser.prog());
        fstream.close();
        
        StackVirtualMachineLexer lex2 = new StackVirtualMachineLexer(new ANTLRFileStream(args[0]+".asm"));
        CommonTokenStream tokens2 = new CommonTokenStream(lex2);
        StackVirtualMachineParser parser2 = new StackVirtualMachineParser(tokens2);
      
        SVM m = new SVM(parser2.createCode());
        
        m.run();
       
    }
}

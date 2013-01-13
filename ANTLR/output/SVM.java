public class SVM {
  
  private static final int MEMSIZE = 10000;
  private static final int STATICSIZE = 1000;
  
  private int[] code;
  private int[] memory = new int[MEMSIZE];
  
  private int ir = 0;
  private int sp = MEMSIZE;
  private int fp = MEMSIZE;
  private int hp = STATICSIZE;
  private int ra = 0;
  private int rv = 0;
    
  public SVM(int[] instructions) {
    code = instructions;
  }
  
  public void run() {
    while (ir < code.length) {
      int bytecode = code[ir++];
      switch (bytecode) {
        case StackVirtualMachineParser.PUSH:
          push(code[ir++]);
          break;
        case StackVirtualMachineParser.POP:
          pop();
          break;
        case StackVirtualMachineParser.ADD:
          push(pop()+pop());
          break; 
        case StackVirtualMachineParser.SUB:
          push(pop()-pop());
          break;
        case StackVirtualMachineParser.LOADW: 
          push(memory[pop()]);
          break;
        case StackVirtualMachineParser.STOREW: 
          int add = pop();
          memory[add] = pop();
          break;   
        case StackVirtualMachineParser.LOADFP: 
          push(fp);
          break;
        case StackVirtualMachineParser.STOREFP: 
          fp = pop();
          break;  
        case StackVirtualMachineParser.LOADSP: 
          push(sp);
          break;
        case StackVirtualMachineParser.STORESP: 
          sp = pop();
          break;   
        case StackVirtualMachineParser.LOADHP: 
          push(hp);
          break;
        case StackVirtualMachineParser.STOREHP: 
          hp = pop();
          break;   
        case StackVirtualMachineParser.LOADRA: 
          push(ra);
          break;
        case StackVirtualMachineParser.STORERA: 
          ra = pop();
          break;
        case StackVirtualMachineParser.LOADRV: 
          push(rv);
          break;
        case StackVirtualMachineParser.STORERV: 
          rv = pop();
          break;   
        case StackVirtualMachineParser.BRANCH: 
          add = code[ir++];
          ir=add;
          break;   
        case StackVirtualMachineParser.BRANCHEQ: 
          add = code[ir++];
          if ( pop() == pop() ) ir=add;
          break;  
        case StackVirtualMachineParser.BRANCHLESS: 
          add = code[ir++];
          if ( pop() < pop() ) ir=add;
          break;  
        case StackVirtualMachineParser.JAL: 
          ra = ir+1;
          ir = code[ir];
          break;  
        case StackVirtualMachineParser.JRA: 
          ir = ra;
          break; 
        case StackVirtualMachineParser.PRINT:
          System.out.println(pop());
          break;
        case StackVirtualMachineParser.HALT:
          return;          
      }  
    }
  }
  
  private int pop() {
    return memory[sp++]; 
  }
  
  private void push(int b) {
    memory[--sp] = b; 
  }
}
FunctionalLanguage
==================

Implementation of a (really simple) functional language with a Stack Virtual Machine, using ANTLR.
This language is a case-study for the course "Linguaggi di programmazione e modelli computazionali", Ingegneria e Scienze Informatiche LM.

## General
The "FunctionalLanguage" (described by the grammar FunctionalLanguage.g) compiles in pseudo-machine code,
that is then executed by a pseudo-virtualmachine. The language generated is described by the grammar in StackVirtualMachine.g.

**Sample functional language syntax**

	def INT sommatutti( LIST-OF[INT] l) = 
	 if (l==empty) then 0
	               else (l.first)+sommatutti( (l.rest) );  
	
	print sommatutti([5,[3,empty]]);
	print (5-3+2+3);
	
	/*
	 *  Simple var assignment and print
	 */
	def INT num = 10;
	def BOOL state = true;
	print num;
	print state;
	
	/*
	 * Fn INT -> INT
	 */
	def INT double(INT number) =
	if (number == 0) then 0 else number+number;
		
	def INT test0 = double(0);
	def INT test1 = double(1);
	print test0;
	print test1;
	
	/*
	 * Fn INT -> BOOL
	 */
	def BOOL isZero(INT number) =
	if (number == 0) then true else false;
	
	def BOOL prova0 = isZero(0);
	print prova0;
	
	def BOOL prova1 = isZero(1);
	print prova1;
	
	/*
	 * Fn INT, BOOL -> BOOL
	 */
	def INT testFn(INT num, BOOL cond) =
	if(cond == true) then num else 0;

**Sample generated pseudo-machine code**


  	lfp
	push -1
	push 3
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	push 5
	lhp
	sw
	lhp
	push 1
	add
	sw
	lhp
	lhp
	push 2
	add
	shp
	jal sommatutti
	print

	push 3
	push 5
	sub
	push 2
	add
	push 3
	add
	print

	...


**Type Checking**

The type checking has been succesfully implemented, following these steps:

1. Build the AST
2. Create and populate a Symbol Table, that stores information about types of each node/leaf.
3. Use the information stored during the top-down process of syntax-directed translation to perform type checks.



package com.al333z.typechecking;

import com.al333z.type.ListType;
import com.al333z.type.Type;

public class FactorNode implements Node {

	protected Node factorChecker;
	
	public FactorNode(Node factorChecker) {
//		System.out.println(this.getClass().toString()+" object created.");
		this.factorChecker = factorChecker;
	}
	
	@Override
	public Type check() {
		return this.factorChecker.check();
	}

	public boolean isListType(){
		boolean ret = Type.typeEquals(this.factorChecker.check(), new ListType(null));
		return ret;
	}
	
	@Override
	public String toTreeString(String ident) {
		return '\n' + ident + "Factor" +
				this.factorChecker.toTreeString(ident +"  ");
	}
}

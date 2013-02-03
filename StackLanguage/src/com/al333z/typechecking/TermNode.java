package com.al333z.typechecking;

import com.al333z.type.ListType;
import com.al333z.type.Type;

public class TermNode implements Node {

	protected Node termChecker;
	
	public TermNode(Node termChecker) {
//		System.out.println(this.getClass().toString()+" object created.");
		this.termChecker = termChecker;
	}
	
	@Override
	public Type check() {
		return this.termChecker.check();
	}
	
	public boolean isListType(){
		boolean ret = Type.typeEquals(this.termChecker.check(), new ListType(null));
		return ret;
	}

	@Override
	public String toTreeString(String ident) {
		return '\n' + ident + "Term" +
				this.termChecker.toTreeString(ident +"  ");
	}
}

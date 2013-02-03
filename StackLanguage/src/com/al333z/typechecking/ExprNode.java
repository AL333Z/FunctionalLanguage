package com.al333z.typechecking;

import com.al333z.type.ListType;
import com.al333z.type.Type;

public class ExprNode implements Node {

	protected Node exprChecker;
	
	public ExprNode(Node exprChecker) {
//		System.out.println(this.getClass().toString()+" object created.");
		this.exprChecker = exprChecker;
	}
	
	@Override
	public Type check() {
		return this.exprChecker.check();
	}
	
	public boolean isListType(){
		boolean ret = Type.typeEquals(this.exprChecker.check(), new ListType(null));
		return ret;
	}
	
	@Override
	public String toTreeString(String ident) {
		return '\n' + ident + "Expr" +
				this.exprChecker.toTreeString(ident +"  ");
	}
}

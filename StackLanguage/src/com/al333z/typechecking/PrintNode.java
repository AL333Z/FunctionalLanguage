package com.al333z.typechecking;

import com.al333z.type.CorrectType;
import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class PrintNode implements Node {

	protected Node exprChecker;
	
	public PrintNode(Node exprChecker) {
//		System.out.println(this.getClass().toString()+" object created.");
		this.exprChecker = exprChecker;
	}
	
	@Override
	public Type check() {
		Type exprRes = this.exprChecker.check();
		if (!exprRes.isErrorType()) {
			return new CorrectType();
		}
		return new ErrorType();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toTreeString(String ident) {
		return '\n' + ident + "Print" +
				this.exprChecker.toTreeString(ident +"  ");
	}
}

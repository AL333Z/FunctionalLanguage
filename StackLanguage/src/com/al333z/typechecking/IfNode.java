package com.al333z.typechecking;

import com.al333z.type.BoolType;
import com.al333z.type.CorrectType;
import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class IfNode implements Node {

	protected Node condExprChecker;
	protected Node thenExprChecker;
	protected Node elseExprChecker;
	
	public IfNode(Node condExprChecker, Node thenExprChecker, Node elseExprChecker) {
//		System.out.println(this.getClass().toString()+" object created.");
		this.condExprChecker = condExprChecker;
		this.thenExprChecker = thenExprChecker;
		this.elseExprChecker = elseExprChecker;
	}
	
	@Override
	public Type check() {
		boolean retCond = Type.typeEquals(this.condExprChecker.check(), new BoolType());
		boolean retThen = this.thenExprChecker.check().isErrorType();
		boolean retElse = this.elseExprChecker.check().isErrorType();
		
		if (retCond && !retThen && !retElse) {
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
		return '\n' + ident + "if-then-else" +
				this.condExprChecker.toTreeString(ident +"    ")+
				this.thenExprChecker.toTreeString(ident +"    ")+
				this.elseExprChecker.toTreeString(ident +"    ");
	}
}
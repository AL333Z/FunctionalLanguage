package com.al333z.typechecking;

import com.al333z.type.CorrectType;
import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class ProgramNode implements Node {

	protected Node leftCommandChecker;
	protected Node rightCommandChecker;
	
	public ProgramNode(Node leftCommandChecker, Node rightCommandChecker) {
		System.out.println(this.getClass().toString()+" object created.");
		this.leftCommandChecker = leftCommandChecker;
		this.rightCommandChecker = rightCommandChecker;
	}
	
	@Override
	public Type check() {
		Type leftRes = this.leftCommandChecker.check();
		Type rightRes = this.rightCommandChecker.check();
		if (!leftRes.isErrorType() && !rightRes.isErrorType()) {
			return new CorrectType();
		}
		return new ErrorType();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}

}

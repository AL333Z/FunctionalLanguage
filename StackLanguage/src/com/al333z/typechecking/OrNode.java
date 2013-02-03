package com.al333z.typechecking;

import com.al333z.type.BoolType;
import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class OrNode implements Node {

	protected Node leftTermChecker;
	protected Node rightTermChecker;
	
	public OrNode(Node leftTermChecker, Node rightTermChecker) {
//		System.out.println(this.getClass().toString()+" object created.");
		this.leftTermChecker = leftTermChecker;
		this.rightTermChecker = rightTermChecker;
	}
	
	@Override
	public Type check() {
		Type leftCheckerResult = this.leftTermChecker.check();
		if (Type.typeEquals(leftCheckerResult, new BoolType()) && Type.typeEquals(leftCheckerResult, this.rightTermChecker.check())) {
			return new BoolType();
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
		return '\n' + ident + "Or" +
				this.leftTermChecker.toTreeString(ident +"  ")+
				this.rightTermChecker.toTreeString(ident +"  ");
	}
}

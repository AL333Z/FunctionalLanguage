package com.al333z.typechecking;

import com.al333z.type.ErrorType;
import com.al333z.type.IntType;
import com.al333z.type.Type;

public class MinusNode implements Node {

	protected Node leftTermChecker;
	protected Node rightTermChecker;
	
	public MinusNode(Node leftTermChecker, Node rightTermChecker) {
		System.out.println(this.getClass().toString()+" object created created.");
		this.leftTermChecker = leftTermChecker;
		this.rightTermChecker = rightTermChecker;
	}
	
	@Override
	public Type check() {
		Type leftCheckerResult = this.leftTermChecker.check();
		if (Type.typeEquals(leftCheckerResult, new IntType()) && Type.typeEquals(leftCheckerResult, this.rightTermChecker.check())) {
			return new IntType();
		}
		return new ErrorType();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}

}

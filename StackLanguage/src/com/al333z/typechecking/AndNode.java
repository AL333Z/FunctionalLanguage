package com.al333z.typechecking;

import com.al333z.type.BoolType;
import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class AndNode implements Node {

	protected Node leftFactorChecker;
	protected Node rightFactorChecker;
	
	public AndNode(Node leftFactorChecker, Node rightFactorChecker) {
		System.out.println(this.getClass().toString()+" object created.");
		this.leftFactorChecker = leftFactorChecker;
		this.rightFactorChecker = rightFactorChecker;
	}
	
	@Override
	public Type check() {
		Type leftCheckerResult = this.leftFactorChecker.check();
		if (Type.typeEquals(leftCheckerResult, new BoolType()) && Type.typeEquals(leftCheckerResult, this.rightFactorChecker.check())) {
			return new BoolType();
		}
		return new ErrorType();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}

}

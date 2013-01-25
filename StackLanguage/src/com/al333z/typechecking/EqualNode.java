package com.al333z.typechecking;

import com.al333z.type.BoolType;
import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class EqualNode implements Node {

	protected Node leftExprChecker;
	protected Node rightExprChecker;
	
	public EqualNode(Node leftExprChecker, Node rightExprChecker) {
		System.out.println(this.getClass().toString()+" object created created.");
		this.leftExprChecker = leftExprChecker;
		this.rightExprChecker = rightExprChecker;
	}
	
	@Override
	public Type check() {
		if (Type.typeEquals(this.leftExprChecker.check(), this.rightExprChecker.check())) {
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

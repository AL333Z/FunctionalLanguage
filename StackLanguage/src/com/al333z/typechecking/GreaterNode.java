package com.al333z.typechecking;

import com.al333z.type.BoolType;
import com.al333z.type.ErrorType;
import com.al333z.type.IntType;
import com.al333z.type.Type;

public class GreaterNode implements Node {

	protected Node leftExprChecker;
	protected Node rightExprChecker;
	
	public GreaterNode(Node leftExprChecker, Node rightExprChecker) {
		System.out.println(this.getClass().toString()+" object created.");
		this.leftExprChecker = leftExprChecker;
		this.rightExprChecker = rightExprChecker;
	}
	
	@Override
	public Type check() {
		Type leftExprType = this.leftExprChecker.check();
		Type rightExprType = this.rightExprChecker.check(); 
		
		if (Type.typeEquals(leftExprType, new IntType()) && Type.typeEquals(leftExprType, rightExprType)) {
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

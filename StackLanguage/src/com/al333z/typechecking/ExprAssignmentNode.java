package com.al333z.typechecking;

import com.al333z.type.CorrectType;
import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class ExprAssignmentNode implements Node {

	protected Type type;
	protected Node exprChecker;
	
	public ExprAssignmentNode(Type type, Node exprChecker) {
		System.out.println(this.getClass().toString()+" object created created.");
		this.type = type;
		this.exprChecker = exprChecker;
	}
	
	@Override
	public Type check() {
		Type exprType = this.exprChecker.check();
		if (Type.typeEquals(this.type, exprType)) {
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

package com.al333z.typechecking;

import com.al333z.type.BoolType;
import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class NotNode implements Node {
	
	protected Node exprChecker;
	
	public NotNode(Node exprChecker){
		System.out.println(this.getClass().toString()+" object created created.");
		this.exprChecker = exprChecker;
	}
	
	@Override
	public Type check() {
		if (Type.typeEquals(this.exprChecker.check(), new BoolType())  ) {
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

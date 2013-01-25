package com.al333z.typechecking;

import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class ErrorNode implements Node {	
	
	public ErrorNode() {
		System.out.println(this.getClass().toString()+" object created created.");
	}
	
	@Override
	public Type check() {
		return new ErrorType();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.al333z.typechecking;

import com.al333z.type.BoolType;
import com.al333z.type.Type;

public class BoolNode implements Node {

	public BoolNode() {
		System.out.println(this.getClass().toString()+" object created created.");
	}
	
	@Override
	public Type check() {
		return new BoolType();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}

}

package com.al333z.typechecking;

import com.al333z.type.IntType;
import com.al333z.type.Type;

public class NumberNode implements Node{
	
	public NumberNode(){
		System.out.println(this.getClass().toString()+" object created created.");
	}
	
	@Override
	public Type check() {
		return new IntType();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}
}

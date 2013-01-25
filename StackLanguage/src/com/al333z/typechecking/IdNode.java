package com.al333z.typechecking;

import com.al333z.type.ListType;
import com.al333z.type.Type;

public class IdNode implements Node {

	protected Type idType;
	
	public IdNode(Type typeValue) {
		System.out.println(this.getClass().toString()+" object created created.");
		this.idType = typeValue;
	}
	
	@Override
	public Type check() {
		return this.idType;
	}

	public boolean isListType(){
		boolean ret = Type.typeEquals(this.idType, new ListType(null));
		return ret;
	}
}

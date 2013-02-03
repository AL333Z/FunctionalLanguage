package com.al333z.typechecking;

import com.al333z.type.ErrorType;
import com.al333z.type.ListType;
import com.al333z.type.Type;

public class FirstNode implements Node {
	
	protected Node firstChecker;
	
	public FirstNode(Node firstChecker) {
//		System.out.println(this.getClass().toString()+" object created.");
		this.firstChecker = firstChecker;
	}
	

	
	public Type check() {
			
		if ( this.firstChecker.isListType()) {
			ListType listType = (ListType) this.firstChecker.check();	
			return listType.getContainedType();
		}
		return new ErrorType();

	}

	@Override
	public boolean isListType() {
		return false;
	}
	
	@Override
	public String toTreeString(String ident) {
		return '\n' + ident + "First" +
				this.firstChecker.toTreeString(ident +"  ");
	}
}

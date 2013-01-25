package com.al333z.type;

public abstract class PrimitiveType extends Type {

	public boolean isPrimitive(){
		return true;
	}
	
	public boolean isErrorType() {
		return false;
	}
	
	public abstract int getTypeValue();

}

package com.al333z.type;

public abstract class CompoundType extends Type {

	public boolean isPrimitive(){
		return false;
	}
	
	public boolean isErrorType() {
		return false;
	}	
	
	public abstract Type getContainedType();
	public abstract int getContainerTypeValue();
	
}

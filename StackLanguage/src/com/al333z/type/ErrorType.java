package com.al333z.type;
import com.al333z.typechecking.Node;;

public class ErrorType extends PrimitiveType {
	
	public int getTypeValue(){
		return Node.ERROR;
	}
	
	public boolean isErrorType() {
		return true;
	}
	
}

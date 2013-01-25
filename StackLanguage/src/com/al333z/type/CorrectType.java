package com.al333z.type;
import com.al333z.typechecking.Node;;

public class CorrectType extends PrimitiveType {
	
	public int getTypeValue(){
		return Node.CORRECT;
	}
	
	public boolean isErrorType() {
		return false;
	}
	
}

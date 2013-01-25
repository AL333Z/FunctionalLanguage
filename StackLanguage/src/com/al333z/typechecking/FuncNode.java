package com.al333z.typechecking;

import java.util.LinkedList;

import com.al333z.type.ErrorType;
import com.al333z.type.Type;

public class FuncNode implements Node {

	protected Type returnType;
	protected LinkedList<Node> parametersType;
	protected LinkedList<Type> declaredParametersType;
	
	public FuncNode(Type returnType, LinkedList<Node> parametersType, LinkedList<Type> declaredParametersType) {
		System.out.println(this.getClass().toString()+" object created created.");
		this.returnType = returnType;
		this.parametersType = parametersType;
		this.declaredParametersType = declaredParametersType;
	}
	
	@Override
	public Type check() {
		if (!this.returnType.isErrorType() && this.parametersType != null && this.declaredParametersType != null && this.parametersType.size() == this.declaredParametersType.size()) {
			for (int i = 0; i < this.parametersType.size(); i++) {
				Node node = this.parametersType.get(i);
				Type type = this.declaredParametersType.get(i);
				
				if (!Type.typeEquals(node.check(), type)){		
					return new ErrorType();
				}
			}
			
			return this.returnType;
		}
			
		return new ErrorType();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}

}

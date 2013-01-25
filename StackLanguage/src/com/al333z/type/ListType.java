package com.al333z.type;
import com.al333z.typechecking.Node;;

public class ListType extends CompoundType{

	protected Type containedType;
	protected boolean isEmpty;
	
	public ListType(Type containedType){
		if (containedType == null) {
			this.isEmpty = true;
		}else{
			this.isEmpty = false;
			this.containedType = containedType;
		}

	}
	
	public int getTypeValue(){
		return Node.LISTOF;
	}
	
	public Type getContainedType(){
		return this.containedType;
	}

	public int getContainerTypeValue() {
		return Node.LISTOF;
	}
	
	public boolean isEmpty(){
		return this.isEmpty;
	}
	
	public boolean isPrimitive(){
		if (this.isEmpty) {
			return true;
		}
		return false;
	}
	
}
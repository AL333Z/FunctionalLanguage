package com.al333z.typechecking;

import com.al333z.type.ErrorType;
import com.al333z.type.ListType;
import com.al333z.type.Type;

public class ListNode implements Node {
	
	protected Node headChecker;
	protected Node tailListCheker;
	protected boolean isEmpty;
	
	public ListNode(Node headChecker, Node tailListCheker) {
		System.out.println(this.getClass().toString()+" object created created.");
		
		if (headChecker == null && tailListCheker == null) {
			this.isEmpty = true;
		}
		else{
			this.headChecker = headChecker;
			this.tailListCheker = tailListCheker;
			this.isEmpty = false;
		}
	}
	
	public boolean isEmpty(){
		return this.isEmpty;
	}
	
	public Type check() {
		// if list is empty, return empty list type
		if (this.isEmpty) {
			return new ListType(null);
		}
		
		// check that head of list is a primitive type
		Type headType = this.headChecker.check();
		if (!headType.isPrimitive()) {
			return new ErrorType();
		}
		
		// if tail is empty, return the type of the head of the list as the contained type
		ListType tailType = (ListType)this.tailListCheker.check();
		if (tailType.isEmpty()) {
			return new ListType(headType);
		}
		
		// if tail is not empty, retrieve the type of the tail, recursively
		// and check its value with the type of the head.
		// Every elements in the list should have the same type!!!
		if (Type.typeEquals(headType, tailType.getContainedType())){
			return new ListType(headType);
		}
		
		return new ErrorType();
	}

	@Override
	public boolean isListType() {
		return true;
	}

}

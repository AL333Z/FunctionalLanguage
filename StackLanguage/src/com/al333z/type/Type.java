package com.al333z.type;

public abstract class Type {

	public abstract boolean isPrimitive();
	
	public abstract boolean isErrorType();
	
	public static boolean typeEquals(Type t1, Type t2){
		
		// if both type are not primitive, get contained type
		while(t1.isPrimitive() == false && (t1.isPrimitive() == t2.isPrimitive())) {
			CompoundType ct1 = (CompoundType) t1;
			CompoundType ct2 = (CompoundType) t2;
			
			if (ct1.getContainerTypeValue() != ct2.getContainerTypeValue()) {
				// check that container value are the same ( e.g. LIST-OF - LIST-OF)
				return false;
			}
			
			t1 = ct1.getContainedType();
			t2 = ct2.getContainedType();
			
		}
		

		
		if (t1.isPrimitive() && t2.isPrimitive() && !t1.getClass().equals(ListType.class) && !t2.getClass().equals(ListType.class)) {
			PrimitiveType pt1 = (PrimitiveType) t1;
			PrimitiveType pt2 = (PrimitiveType) t2;
			
			if (pt1.getTypeValue() == pt2.getTypeValue()) {
				return true;
			}
			
		}else if (t1.getClass().equals(ListType.class) && t2.getClass().equals(ListType.class)) {
			ListType lt1 = (ListType)t1;
			ListType lt2 = (ListType)t2;
			
			if ((!lt1.isEmpty() && lt2.isEmpty()) || (lt1.isEmpty() && !lt2.isEmpty())) {
				return true;
			}
		}		
		return false;
	}
	
}

package com.al333z.typechecking;

import com.al333z.type.Type;

public interface Node {
	public static final int INT 	= 100;
	public static final int BOOL 	= 101;
	public static final int LISTOF 	= 102;
	
	public static final int CORRECT = 200;
	public static final int ERROR 	= -1;
	
	Type check();
	
	public boolean isListType();
	
}

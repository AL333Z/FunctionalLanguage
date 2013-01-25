package com.al333z.typechecking;

import com.al333z.type.Type;

public class CommandNode implements Node {

	protected Node commandChecker;
	
	public CommandNode(Node commandChecker) {
		System.out.println(this.getClass().toString()+" object created created.");
		this.commandChecker = commandChecker;
	}
	
	@Override
	public Type check() {
		return this.commandChecker.check();
	}

	@Override
	public boolean isListType() {
		// TODO Auto-generated method stub
		return false;
	}

}

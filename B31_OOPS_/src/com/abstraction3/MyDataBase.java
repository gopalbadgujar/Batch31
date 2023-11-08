package com.abstraction3;

public interface MyDataBase {

	public abstract void commit();
	
	void rollback();                // public abstract --> it is by default.
	
}

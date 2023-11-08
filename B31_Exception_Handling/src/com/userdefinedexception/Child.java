package com.userdefinedexception;

import java.io.IOException;
import java.net.SocketException;

public class Child extends Parent{
	
	public Child()throws IOException, Exception {
		super();
		// same or parent
	}

	@Override
	public void m1() throws IOException, SocketException {
		super.m1();
		// same class or child class
	}
}

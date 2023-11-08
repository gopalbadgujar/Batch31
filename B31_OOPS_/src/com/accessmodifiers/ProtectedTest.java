package com.accessmodifiers;

public class ProtectedTest {

	protected int id = 100;
	
	protected ProtectedTest() {
		
	}
	
	protected void m1() {
		System.out.println("PROTECTED M1 METHOD... ");
	}
	
	
	public static void main(String[] args) {
		
		ProtectedTest p = new ProtectedTest();
		System.out.println(p.id);
		p.m1();
	}
	
}

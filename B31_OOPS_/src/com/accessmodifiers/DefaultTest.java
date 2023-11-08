package com.accessmodifiers;

public class DefaultTest {

	int id = 10;
	
	DefaultTest() {
		
	}
	
	void m1() {
		System.out.println("DEFAULT M1 METHOD...");
	}
	
	public static void main(String[] args) {
		
		
		DefaultTest d  = new DefaultTest();
		System.out.println(d.id);
		d.m1();
	}
	
}

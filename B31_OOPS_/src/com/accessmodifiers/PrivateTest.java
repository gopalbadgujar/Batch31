package com.accessmodifiers;

public class PrivateTest {

	private int id =10;
	
	private PrivateTest() {
		
	}
	
	private void m1() {
		System.out.println("PRIVATE METHOD...");
	}
	
	public static void main(String[] args) {
		
		PrivateTest t = new PrivateTest();
		System.out.println(t.id);
		t.m1();
	}
}

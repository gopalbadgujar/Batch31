package com.polymorphism;

public class Test {

	public void m1(int i) {
		System.out.println("Single Parameterized method.");
		System.out.println("----Saving Account----");
	}
	
	public void m1(int i, int j) {
		System.out.println("Double Parameterized method.");
		System.out.println("----Current Account----");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m1(10);
		
		//user 2 input , Single ->>> saving account , double -->>> current account
		
		System.out.println("StringInput" + 10 + "  ");
		System.out.println(20);
		System.out.println('c');
		System.out.println(110.24f);
		System.out.println(101.456789876543);
		System.out.println(100);
		System.out.println(true);
	}
	
}

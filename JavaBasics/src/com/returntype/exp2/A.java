package com.returntype.exp2;

public class A {

	int x = 10;
	int y; //0
	
	public A m1() {
		A a1 = new A(); // x = 10 , y = 0;
		a1.x = 100;
		a1.y = 200;
		
		A a2 = new A();  // x = 10, y = 0;
		return a1; // x & y
	}
	
	public static void main(String[] args) {
		
		A a = new A(); // x = 10 , y = 0;
		System.out.println(a.x); // 10
		System.out.println(a.y); // 0
		
		System.out.println(" -- Calling m1() Method --");
		
		A a2 = a.m1(); // a1 --> x & y
		System.out.println(a2.x); // 100
		System.out.println(a2.y); // 200
		
		
		
	}
	
	
}

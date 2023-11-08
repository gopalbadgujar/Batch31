package com.inheritance;

public class B extends A {

	// A- Parent Class
	// B- Child Class
	//A+B
	//Single Inheritance
	
	int j = 20;
	
	public void m2() {
		System.out.println("m2() method of Class B.");
	}
	
	public static void main(String[] args) {
		A a = new A();     //parent Class(Super Class)
		System.out.println(a.i);
		a.m1();
		
		System.out.println("\n");
		
		B b = new B();     // Child Class(Sub Class)
		// A+B
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		b.m2();
		
	}
}

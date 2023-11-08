package com.abstraction;

public class A extends Demo {

	@Override
	public void m1() {
		System.out.println("Implemented m1 method in Demo Class.");
	}

	public static void main(String[] args) {
		//Demo d = new Demo(); --> Demo is a abstract class so it can't create instance object;
		
		Demo d = new A();   // Indirect Object 
		//Parent-Child Mix Object
		d.m1();
		d.m2();
		
		A a = new A(); // Child class
		a.m1();
		a.m2();
         
		
	}
}

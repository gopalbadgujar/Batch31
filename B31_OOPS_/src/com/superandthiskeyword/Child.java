package com.superandthiskeyword;

public class Child extends Parent {
	
	int j = 20;
	int i = 30;
	
	public void m1() {
		System.out.println("override m1 method");
	}

	public void m2() {
		System.out.println("m2 method of child class");
		System.out.println(super.i); //10
		super.m1();
	}
	
	public void m3() {
		System.out.println("m3 method of child class");
		System.out.println(j);  //20
		System.out.println(this.j);  //20
		this.m2();
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
	}
	
	
	
	
}

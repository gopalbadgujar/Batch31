package com.inheritance;

public class Child extends Parent {
	
	@Override
	public void m1() {
		// New Implementation
		System.out.println("Override m1 method in child class...");
	}
	
	public void m3() {
		System.out.println("m3 method of child class...");
	}
	
	public static void main(String[] args) {
		//PARENT CLASS OBJECT
		System.out.println("PARENT_CLASS_OBJECT");
		Parent p = new Parent();
		p.m1();
		p.m2();
		
		System.out.println("PARENT_CHILD_MIXOBJECT");
		Parent p1 = new Child();
		p1.m1();   // Call Override Method...
		p.m2();
	//	p1.m3();
		
		System.out.println("CHILD_CLASS_OBJECT");
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		
	}
}

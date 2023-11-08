package com.polymorphism.overriding;

public class Parent {

	public void m1(Parent p) {
		System.out.println("--M1 method of Parent Class.");
	}
	public String m2() {
		System.out.println("--M2 method of Parent Class.");
		return "STRING";
	}
	public Parent m3() {
		System.out.println("--M3 method of Parent Class.");
		Parent p = new Parent();
		return p;
	}
	 void m4() {
		System.out.println("--M4 method of Parent Class.");
	}
	private void m5() {
		System.out.println("--M5 method of Parent Class.");
	}
	public final void m6() {
		System.out.println("--M6 method of Parent Class.");
	}
	public static void m7() {
		System.out.println("--M7 method of Parent Class.");
	}
	
}

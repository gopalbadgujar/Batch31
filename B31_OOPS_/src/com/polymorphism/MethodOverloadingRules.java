package com.polymorphism;

public class MethodOverloadingRules {

	private void m1(int i) {                             
		System.out.println("SINGLE PARAMETER");
	}

	public int m1(String s) {
		System.out.println("SINGLE PARAMETER WITH STRING");
		return 10;
	}

	protected final void m1(int i, int j) {
		System.out.println("DOUBLE PARAMETER");
		System.out.println(" Access Modifiers Rule");
	}
//	protected final static void m1(int i, int j) {
//		System.out.println("DOUBLE PARAMETER");
//		System.out.println(" Access Modifiers Rule");
//	}

	public static void main(String[] args) {
		System.out.println("MAIN METHOD.........");
		MethodOverloadingRules mor = new MethodOverloadingRules();
		mor.m1(6);
		mor.m1("AAKASH");
		mor.m1(2,5);
		//MethodOverloadingRules.m1(2, 5);
		//m1(2,5);
		
		
		
	}
	
	public static void main(Integer[] args) {
		System.out.println("..main method..");
	}
}

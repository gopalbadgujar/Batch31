package com.polymorphism;

public class NarrowingConceptTest {

	//A  B  C - inheritance
	
	public void m1(Object o) {
		System.out.println("----Object Class----");
	}
	
	public void m1(String o) {
		System.out.println("----String Class----");
	}
	
//	public void m1(Integer i) {
//		System.out.println("----Integer Class----");
//	}
	
	public static void main(String[] args) {
		NarrowingConceptTest n = new NarrowingConceptTest();
		n.m1(null);// Common Value
	}
	
	
}

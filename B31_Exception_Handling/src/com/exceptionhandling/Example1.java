package com.exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("This Statement will be executed.");
		Integer i = new Integer("Abc");
		System.out.println("Value of i: "+i);
		System.out.println("This Statement will not be executed.");
	}
}

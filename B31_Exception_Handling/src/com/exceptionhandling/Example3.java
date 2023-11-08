package com.exceptionhandling;

public class Example3 {

public static void main(String[] args) {
		
		System.out.println("This Statement will be executed.");
		
		int i = 10/0;
		System.out.println("Value of i: "+i);
		
		System.out.println("This Statement will not be executed.");
	}
}

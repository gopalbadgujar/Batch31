package com.exceptionhandling;

public class Solution3 {

public static void main(String[] args) {
		
	System.out.println("This Statement will be executed.");
	try {
		
		System.out.println("-----try bloch start------");
		
		int i = 10/0;
		System.out.println("Value of i: " + i); 
		
		System.out.println("-----try bloch end------");
		
	} catch (Exception e) {
		System.out.println("-----catch bloch------");
		
		e.printStackTrace();
	}

	System.out.println("This Statement will also be executed.");
	}
}

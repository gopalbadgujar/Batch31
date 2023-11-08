package com.exceptionhandling;

public class Solution2 {

	public static void main(String[] args) {

		System.out.println("This Statement will be executed.");
		
		try {
			System.out.println("-----try bloch start------");

			
			String s = args[1];
			System.out.println("Value of s: "+ s);
			
			System.out.println("-----try bloch end------");

		} catch (Exception e) {
			System.out.println("-----catch bloch------");
			
			e.printStackTrace();
		}

		System.out.println("This statement will also be executed");

	}
}

package com.exceptionhandling;

public class Solution1 {

	public static void main(String[] args) {

		System.out.println("This Statement will be executed.");
		try {
			
			System.out.println("-----try bloch start------");
			
			Integer i = new Integer("ABC"); // exception
			System.out.println("Value of i: " + i); // 12
			
			System.out.println("-----try bloch end------");
			
		} catch (Exception e) {
			System.out.println("-----catch bloch------");
			
			e.printStackTrace();
		}

		System.out.println("This Statement will not be executed.");
	}
}

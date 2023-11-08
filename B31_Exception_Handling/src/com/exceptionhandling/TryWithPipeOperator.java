package com.exceptionhandling;

public class TryWithPipeOperator {

	public static void main(String[] args) {
		
		System.out.println("main method");
		
		try {
			System.out.println("try block");
			String s = args[0];
			System.out.println("Value of s : "+ s);
			
			int i = Integer.parseInt(s);
			System.out.println("Value of i: " + i);

			int c = 100 / i; // i = 0; //ArithmeticException
			System.out.println("Value of c: " + c);
			// subclass --> same level or super class

			String str = null;
			System.out.println(str.length()); // NullPointerException

			System.out.println("exit from try block");
		
		} catch (ArrayIndexOutOfBoundsException| ArithmeticException | NullPointerException e) {
			e.printStackTrace();	
		}
		
	}
	
}

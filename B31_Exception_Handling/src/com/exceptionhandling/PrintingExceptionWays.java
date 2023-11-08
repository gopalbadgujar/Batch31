package com.exceptionhandling;

public class PrintingExceptionWays {

	public static void main(String[] args) {
		
		try {
			System.out.println("try block");
			int i = 10/0;
			System.out.println("Value of i " + i);
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
			System.out.println(e);
		}
	}
	
}

package com.exceptionhandling;

import java.util.Scanner;

public class InnerTryCatchBlock {

	public static void main(String[] args) {
		System.out.println("--inner try catch block--");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();
		name = null; //NullpointerException
		
		try {
			System.out.println("--outer try block--");
			System.out.println("lenth: "+name.length());
			try {
				System.out.println("inner try block");
				Integer i = new Integer(name);  // numberformatexception
				System.out.println("Value of i: "+ i);
				
			} catch (NumberFormatException e) {
				System.out.println("inner catch block");
				e.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("--outer catch block--");
			e.printStackTrace();
		}
	}

}

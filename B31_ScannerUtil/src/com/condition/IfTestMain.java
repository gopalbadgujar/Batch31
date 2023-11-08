package com.condition;

import java.util.Scanner;

public class IfTestMain {

	static Scanner sc = new Scanner(System.in);

	public static void m1() {
		
		System.out.println("Do you want to execute if ?");
		boolean condition = sc.nextBoolean();//

		if (condition) {// true/false-- 1
			System.out.println("Inside If ====");
		} else {
			System.out.println("Inside Else---");

		}
	}

	public static void main(String[] args) {
		System.out.println("main method started....");

		m1();

		m2();
		
		System.out.println("main method completed....");
	}

	public static void m2() {
		// 10<20 -->true
		// 10>30 --> false
		// System.out.println("10<30 : "+ (10<30));
		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();

		if (a < b) {
			System.out.println(a + " is less than " + b);
			if(a<5) {
				System.out.println(a+" is less than 5");
			}
		}else {
			System.out.println(a + " is greater than " + b);
		}
		
		System.out.println("You are passed or not ? ");
		boolean pass = sc.nextBoolean();
		
		if(pass)
			System.out.println("Student is in Pass class");
		else 
			System.out.println("Student is in Failed class");
	}

}
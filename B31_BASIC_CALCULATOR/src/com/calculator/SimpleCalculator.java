package com.calculator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		System.out.println("Calculator started....");
		boolean flag = true;
		while (flag) {// false
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Mult");
			System.out.println("4.Div");
			System.out.println("0.Exit");// Home work -- 5. for Exit

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			int a=0, b=0;
			if (ch != 0) {// 0!=0-->

				System.out.println("enter 1st num: ");
				 a = sc.nextInt();// 100

				System.out.println("enter 2nd num: ");
				 b = sc.nextInt();// 200
			}
			switch (ch) {
			case 1:
				addition(a, b);
				break;
			case 2:
				substraction(a, b);
				break;
			case 3:
				multiplication(a, b);
				break;
			case 4:
				division(a, b);
				break;
			case 0:
				flag = false;
				System.out.println("Exiting the application");
				break;
			default:
				break;
			}
		}
		System.out.println("Calculator stoped....");

	}

	public static void addition(int a, int b) {
		System.out.println("Sum is : " + (a + b));
	}

	public static void substraction(int a, int b) {
		System.out.println("substraction is : " + (a - b));
	}

	public static void multiplication(int a, int b) {
		System.out.println("multiplication is : " + (a * b));
	}

	public static void division(int a, int b) {
		float c = a;
		System.out.println("division is : " + (c / b));
	}

}
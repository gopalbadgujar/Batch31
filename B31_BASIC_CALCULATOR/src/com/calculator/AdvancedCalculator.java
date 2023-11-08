package com.calculator;

import java.util.Scanner;

public class AdvancedCalculator {

	public static void main(String[] args) {
		System.out.println("-__ADVANCED_CALCULATOR__-");
		System.out.println("Calculator Started.....");

		boolean flag = true;
		while (flag) {

			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Mult");
			System.out.println("4.Div");
			System.out.println("5.Exit");// Home work -- 5. for Exit

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice: ");
			int choice = sc.nextInt();

			int a = 0, b = 0;
			if (choice != 0) {
				System.out.println("Enter 1st Number");
				 a = sc.nextInt();
				System.out.println("Enter 2nd Number");
				 b = sc.nextInt();
			}

			switch (choice) {
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
			case 5:
				flag = false;
				break;

			default:
				break;
			}
		}

		System.out.println("Calculator Stopped.....");
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

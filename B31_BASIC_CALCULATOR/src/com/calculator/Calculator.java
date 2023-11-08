package com.calculator;

import java.util.Scanner;

public class Calculator {
//	Scanner sc = new Scanner(System.in);
//	static double num1;
//	static double num2;
//	 static char c;
//	 static double o = 0;

	public double TakeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: \n");
		double num = sc.nextDouble();
		return num;

	}

//	public double TakeInput2() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number2: \n");
//		double num2 = sc.nextDouble();
//		return num2;
//	}

	public char TakeOperator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operators like '+','-','*','/',& '%' :- ");
		char c = sc.next().charAt(0);
		return c;
	}

	public static void main(String[] args) {

	
		boolean flag  = true;
		while(flag) {
		System.out.println("----------------BASIC_CALCULATOR----------------");
		System.out.println("CALCULATOR STARTED....");
		Calculator cal = new Calculator(); 
		double num1 = cal.TakeInput();
		double num2 = cal.TakeInput();
		char c = cal.TakeOperator();
		
		double o = 0;
		switch (c) {
		case '+':
			System.out.println("We Perform The Addition Operation");
			o = num1 + num2;
			break;

		case '-':
			System.out.println("We Perform The Substraction Operation");
			o = num1 - num2;
			break;
		case '*':
			System.out.println("We Perform The Multiplication Operation");
			o = num1 * num2;
			break;
		case '/':
			System.out.println("We Perform The Division Operation");
			o = num1 / num2;
			break;
		case '%':
			System.out.println("We Perform The Modulus Operation");
			o = num1 % num2;
			break;

		default:
			System.out.println(" Sorry, You Enter the Inappropriate Operator. ");
			System.out.println("Please, Try Again....");
			break;
		}
		
		System.out.println("The Final Result: ");
		System.out.println(num1 + "  " + c + "  " + num2 + "  " + "= " + o);
		System.out.println("CALCULATOR STOPED....\n");

		}
	}
}

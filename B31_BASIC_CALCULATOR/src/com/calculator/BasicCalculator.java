package com.calculator;

import java.util.Scanner;

public class BasicCalculator {
	Scanner sc = new Scanner(System.in);
	 static double num1;
	 static double num2;
	 static char c;
	 static double o = 0;

	public void TakeInput() {
		System.out.println("Enter the numbers: \n");
		 num1 = sc.nextDouble();
		 num2 = sc.nextDouble();
	}

	public void TakeOperator() {
		System.out.println("Enter the Operators like '+','-','*','/',& '%' :- ");
		 c = sc.next().charAt(0);
	}

	public static void main(String[] args) {

		System.out.println("----------------BASIC_CALCULATOR----------------");
//		Input i = new Input();
//		i.TakeInput();
//		Operator op = new Operator();
//		op.TakeOperator();

		BasicCalculator bc = new BasicCalculator();
//		System.out.println(bc.num1);
//		System.out.println(bc.num2);
//		System.out.println(bc.c);
		bc.TakeInput();
		bc.TakeOperator();

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

	}
}

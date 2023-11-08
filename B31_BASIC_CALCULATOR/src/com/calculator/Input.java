package com.calculator;

import java.util.Scanner;

public class Input {
	static double num1;
	static double num2;
	public void TakeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: \n");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
	}
}

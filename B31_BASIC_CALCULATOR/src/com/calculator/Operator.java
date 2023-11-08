package com.calculator;

import java.util.Scanner;

public class Operator {

	static char c;
	
	public void TakeOperator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Operators like '+','-','*','/',& '%' :- ");
		c = sc.next().charAt(0);
	}
}

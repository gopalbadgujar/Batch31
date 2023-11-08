package com.loops;

import java.util.Scanner;

public class WhileTestMain {

	public static void main(String[] args) {
		System.out.println("Main started....");
		WhileTestMain main = new WhileTestMain();

		main.displayMsg();
//		main.displayMsg();
//		main.displayMsg();
//		main.displayMsg();
//		int add = main.addition(2, 3);
//		System.out.println(add);
		Scanner sc = new Scanner(System.in);
		boolean condition = true;

		while (condition) {// true then it will executes statements

			System.out.println("Do you want to continue" + " again? Enter 1. yes 2. No ");
			int choice = sc.nextInt();

			if (choice == 2) {// 1==2, 2 ==2
				condition = false;
			}
		}

		int i = 1;
		while (i <= 10) {// 1<=5, 2<=5, 3<=5 4<=5, 5<=5, 6<=5
			main.displayMsg();
			// i=i+1;//1+1=2, i=2, 3, 4, 5, 6 i++;
			i++;
		}

		// Find sum of first 10 positive number
		int a = 1;
		int sum = 0;
		while (a <= 10) {
			sum = main.addition(sum, a);
			a++;
		}
		System.out.println("Sum is : " + sum);
		// 0, 1, 2, 3, 4, 5
		// 0+1 = 1, 1+1=2, 3+3=6, 6+4=10, 10+5=15

		// 100 to 200 --> ?
		System.out.println("Main Completed....");
	}

	public int addition(int a, int b) {
		return a + b;
	}

	public void displayMsg() {
		System.out.println("Hi Welcome to Java");
	}

}
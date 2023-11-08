package com.exceptionhandling;

import java.util.Scanner;

public class ThrowExample {

	// bank application
	// age < 18:
	// age > 18: account created

	public static void validateAge(int age) {
		System.out.println("---inside validateAge inside---");

		if (age < 18) {
			throw new ArithmeticException(
					"Person is not eligiblefor create the  bank, "
					+ "Please visit again after completing the age 18 ");
		} else {
			System.out.println("User is Eligible for creating the bank account");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int userAge = sc.nextInt();

		try {
			validateAge(userAge);
		} catch (Exception e) {
			e.printStackTrace();
		}

		sc.close();
	}

}

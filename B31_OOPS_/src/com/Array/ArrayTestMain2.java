package com.Array;

public class ArrayTestMain2 {

	int a; // Declaration
	int b = 10; // Initialization

	int[] arrayOfInt;
	boolean[] arrayOfBoolean;
	String[] arrayOfString[];
	String[] name = { "Ak", "Mohit" };

	/*
	 * 1. Sum of Elements: Write a program to calculate the sum of all elements in
	 * an array.
	 */
	public static void forLoop() {
		System.out.println("----For Loop----");
		// sum of first 5 numbers--- 1,2,3,4,5
		// FOR LOOP: 1. initialization , 2. condition, 3. increment/decrement
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "   ");
			sum = sum + i;
		}
		System.out.println("Sum is : " + sum);// not not execute in next line (without adding \n)
	}

	public static void addition(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + i;
		}
		System.out.println("Final Sum is by using Addition: " + sum);
	}

	public static void main(String[] args) {
		// forLoop();
		arrayPractice();
	}

	/*
	 * 2. REVERSE THE ARRAY: Implement a program to reverse the elements of an array
	 * in place.
	 */

	public void reverseArray(int[] arr) {
		System.out.println(" Reverse Of Array Elements ");
		// 5,20,30,25,10
		// 10,25,30,20,5
		System.out.println("Before Reverse");
		for (int a = 0; a < arr.length; a++) {
			System.out.println(arr[a] + "  ");
		}
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println();
		System.out.println("After Reverse");
		for (int a = 0; a < arr.length; a++) {
			System.out.println(arr[a] + " ");
		}
		System.out.println();
	}

	public static void arrayPractice() {

		ArrayTestMain2 main = new ArrayTestMain2();
		System.out.println(main.arrayOfInt);
		// 1,2,3,4,5
		// index--> 0,------4
		// Instantiate
		// 1 using new keyword
		int[] arrayInt = new int[5];// roll number,
		System.out.println(arrayInt[0] = 10);// 0
		System.out.println(arrayInt[2]);// 0
		System.out.println(arrayInt[1]);//
		// arrayInt[0] = 5;
		arrayInt[2] = 10;
		arrayInt[1] = 20;
		arrayInt[3] = 25;
		arrayInt[4] = 35;

		addition(arrayInt);
		main.reverseArray(arrayInt);

		System.out.println("After Assigning Values---");
		System.out.println(arrayInt[0]);
		System.out.println(arrayInt[2]);

		System.out.println("By Using for loop ----------------");
		for (int a = 0; a < arrayInt.length; a++) {
			System.out.print(arrayInt[a] + " ");
		}
		System.out.println();
		for (int a = arrayInt.length - 1; a >= 0; a--) {
			System.out.print(arrayInt[a] + " ");
		}
		System.out.println();

		boolean[] arrayBoolean = new boolean[5];
		System.out.println(arrayBoolean[0]);
		System.out.println(arrayBoolean[4]);

		System.out.println("1.2 using new keyword and values----");
		// 1.2 using new keyword and values
		double[] arrayofDouble = new double[] { 12.56, 45.84, 14.85 };
		System.out.println(arrayofDouble[0]);

		String[] names = { "Omkar", "Sagar", "Aakash" };//
		System.out.println(names.length);// 3-- last index--2
		System.out.println(names[0]);
		names[0] = "Abc";
		System.out.println(names[0]);

		System.out.println("By Using for loop ----------------");
		for (int i = 0; i < 3; i++) {// 0, 1, 2
			System.out.println(names[i]);//
		}

		int n = names.length;
		for (int i = 0; i < n; i++) {// 0, 1, 2
			System.out.println(names[i]);//
		}

		for (int i = 0; i < names.length; i++) {// 0, 1, 2
			System.out.println(names[i]);//
		}

		for (String abc : names) {
			System.out.println(abc);
		}

		for (double d : arrayofDouble) {
			System.out.println(d);
		}

		for (int i : arrayInt) {
			System.out.println(i);
		}

	}

}

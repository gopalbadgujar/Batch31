package com.Array;

public class ArrayTestMain {

	int a;  // Declaration
	int b = 10;  //Initialization
	
	
	static int[] arrayOfInt;  //Declare
	int[] arrayOfInt1 = {20,23,45,34}; // Initialize 
	int arrayOfInt2[] = {20,23,45,34}; // Initialize 
	int[] arrayOfInt3 = new int[]{20,23,45,34}; // Initialize 

	boolean[] arrayOfBoolean;
	String arrayOfString[];
	String name;
	
	public static void main(String[] abcd) {
		
		ArrayTestMain main = new ArrayTestMain();
		System.out.println(arrayOfInt);   // null
		System.out.println(main.arrayOfInt1);//Generate hash value
		System.out.println(main.arrayOfInt2);//Generate hash value
		System.out.println(main.arrayOfInt3);//Generate hash value
		
		//Instantiate - 1. Using "New" Keyword
		System.out.println("----Instantiate - 1. Using 'New' Keyword-----");
//		System.out.println("----Instantiate - 1. Using  "New" Keyword-----");---->error line
		int[] arrayInt = new int[5];
		System.out.println(arrayInt[0]);
		System.out.println(arrayInt[2]);
		System.out.println(arrayInt[000001]);
		
		arrayInt[1] = 20;
		arrayInt[3]  = 30;
		System.out.println("After assining value...");
		System.out.println(arrayInt[1]);
		System.out.println(arrayInt[3]);
		
		boolean[] arrayBoolean = new boolean[4];
		arrayBoolean[3]= true;
		arrayBoolean[1]= true;
		System.out.println(arrayBoolean[0]);
		System.out.println(arrayBoolean[1]);
		System.out.println(arrayBoolean[2]);
		System.out.println(arrayBoolean[3]);
		
		//Using new keyword & values:
		System.out.println("------1.2 - Using new keyword & values-------");
		
		double[] arrayDouble = new double[] {12.4, 054.9, 4.7, 8.7};
		System.out.println(arrayDouble[0]);
		System.out.println(arrayDouble[1]);

		System.out.println("------Without Using New Keyword-------");
		String name[] = {"Omkar", "Aakash", "Mohit"};
		System.out.println(name.length);
		System.out.println(name[1]);

		System.out.println(name);//Generate Hash Value
	
	}
	
}

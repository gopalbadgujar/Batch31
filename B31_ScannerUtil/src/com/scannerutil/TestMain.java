package com.scannerutil;

import java.util.Scanner;

public class TestMain {

	public void m1() {

		System.out.println("Main Method started...");
		
		//Scanner-- To take input from user...
		//System.in-- to take input from specific location, console
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.next();// token/ word -- nextLine()
		
		System.out.println("Enter your Roll No: ");
		int rollNo = sc.nextInt();
		
		System.out.println("Enter your Contact No. : ");
	 	long contact = sc.nextLong();
	 	
	 	System.out.println("Enter your Marks: ");
	 	Byte marks = sc.nextByte();
	 	
	 	System.out.println("Enter the Birth Year of Student: ");
	 	short bYear = sc.nextShort();
	 	
	 	System.out.println("Enter the information about student result, Passed or Fail: ");
	 	boolean isPassed = sc.nextBoolean();
	 	
	 	
		// java-- class--jar/war-- deploy
		//String name = "Akash";
		
		System.out.println("Contact no. is : "+contact+" & Birth Year Is: "+bYear);
		System.out.println("Hi, "+ name+"  , Your roll No Is: "+ rollNo+" & Your Marks are: "+marks+"%");
	 	System.out.println(" so, You'r Result will be TRUE then you'r Passed Otherwise Failed : "+isPassed);
		
		System.out.println("Main Method completed...");
	
	}
	
	public static void main(String[] args) {
		TestMain main = new TestMain();
		main.m1();
	}
	
}
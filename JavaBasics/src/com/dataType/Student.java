package com.dataType;

public class Student {
	
	// types --- 1. primitive -- 2. non primitive
		// 1.a Numbers--- 0
		byte rollNo = 11;// <100  --Initialization---
		byte rollNoNew; // declaration ---
		
		short	totalStudent = 20000;// <32000
		int prnNo = 654323456; //< 
		long mobileNumb = 9876543210l;
		
		// 1.b Decimal
		float percentage = 80.50f;// 100 -- max 4byte -- 32bit
		double fuelExpenses = 1100000.5678;// -- 8byte
		
		// 1.2. boolean 
		boolean isPassed = true;// 1bit -- 1
		
		// 1.3 char
		char div = 'A'; // 2 byte 


		// Non Primitive -- All classes -- String Array custom classes 
		//2.String 
		String fullName = " Abc Pqr";
		String userName = "ajay321";
		String emailId = "ajay@gmail.com";
		
		
		
		public static void main(String[] args) {
			System.out.println("Main Method started...");

			Student s = new Student();
			System.out.println(s.rollNo);
			System.out.println(s.rollNoNew);
			
			System.out.println(s.totalStudent);
			// Check default values for all data types --
			
			// Student -- example -- Laptop , Mobile , Car--- 

			System.out.println("Main Method Completed...");
		}
			
		
//1 byte --- 8bit
	// 1 -- true-- 1 bit
	// 0 -- false -- 1 bit 
	
	//00000001---- 
	//2 ---00000010----
	//3	---00000011----2+1= 3
	//2 ---256
	
	byte b = 127;  // -128 to 127 -- 1byte 
	//short s = 	// 0000000000000011	-- 2byte -- 16bit
	// int 						
			
}

package com.model;

public class Student {

	
	public int rollNo;
	public String name;
	public String address;
	
	// 50
	public void displaySingleStudentData(String name, String address, int roll) {
		// display single student data -- 
		System.out.println(roll);
		System.out.println("Hi "+ name +" Welcome to Java...");
		System.out.println(address);
		
	}
	
	public void displayStudentData(Student s) {
		System.out.println("Student Data....");
		System.out.println(s.rollNo);
		System.out.println(s.name);
		System.out.println(s.address);
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.displaySingleStudentData("Akash", "Pune", 10);
		s.displaySingleStudentData("Datta", "Mumbai", 20);
		
		Student stu = new Student();
		stu.rollNo=30;
		stu.name = "Dhanshri";
		stu.address ="Talegaon";
		stu.displayStudentData(stu);
	}
	
	
	
}
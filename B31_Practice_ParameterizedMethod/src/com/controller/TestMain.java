package com.controller;

import com.model.Student;

public class TestMain {

	// data type -- parameter-- 
	public void addition(int a, int b) {// a=10, b=20
		//int a=10, b=20;
		int c = a+b;
		System.out.println("Additon :"+c);
		
	}
	
	public void square(int a) {// a=10
		System.out.println("Square method called...");
		System.out.println(a*a);
	}
	
	public void studentData(Student s) {
		System.out.println(s.rollNo);
		System.out.println(s.name);
	}
	
	public static void main(String[] args) {
		TestMain tm = new TestMain();
		tm.addition(10, 20);//10, 20
		tm.addition(30, 40);// 30, 40
		tm.addition(50,100);// 50, 100
		
		tm.square(10);
		tm.square(20);
		
		Student s1 = new Student();
		s1.rollNo=100;
		s1.name="Abc";
		tm.studentData(s1);
		
		
	}
	
	
	
}
package com.staticFinal;

import com.superThis.Parent;

public class StaticFinalTestMain {

	static {
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Student.collegeName);
		//Student.collegeName = "MIT";
		Student s = new Student();
		System.out.println(s.rollNo);
		System.out.println(s.name);
		System.out.println(Student.collegeName);
		
		Parent.m1();
	}
	
}
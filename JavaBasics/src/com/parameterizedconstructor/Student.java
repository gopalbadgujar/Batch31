package com.parameterizedconstructor;

public class Student {

	int id;
	String address;
	String name;
	long contact;
	double marks;
	char grade;

	public Student(int studentId, String studentname, String studentAddress, long studentContact, double studentMarks,
			char studentGrade) {

		name = studentname;
		id = studentId;
		address = studentAddress;
		contact = studentContact;
		marks = studentMarks;
	    grade = studentGrade;
	}
	
	
}

package com.controller;

import com.model.AllStudent;
import com.model.Student;
import com.service.Collage;

public class University {

	public void displaySingleStudent(Student s) {
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.address);
		System.out.println("\n");
	}
	
	public void displayAllStudentDetails(AllStudent stu) {
		System.out.println(stu.s1.id+"----"+stu.s1.name+"----"+stu.s1.address);
		System.out.println();
		
		System.out.println(stu.s2.id+"----"+stu.s2.name+"----"+stu.s2.address);
		System.out.println();
		
		System.out.println(stu.s3.id+"----"+stu.s3.name+"----"+stu.s3.address);

	}
	
	
	
	public static void main(String[] args) {
		Collage clg = new Collage();
		clg.addSingleStudentDetails();
		clg.addAllStudentDetails();
	}
	
}

package com.service;

import com.model.AllStudent;
import com.model.Student;

public class Collage {

	public Student addStudentDetails() {
		
		 Student s = new Student();
		 s.id = 1000;
		 s.name = "AK";
		 s.address = "pune";
		 
		 Student s1 = new Student();
		 s1.id = 1001;
		 s1.name = "MP";
		 s1.address = "jalgaon";
		return s;
	}
	
	public AllStudent addAllStudentDetails() {
		AllStudent all = new AllStudent();
		all.aakash.id = 1001;
		all.aakash.name = "AAKASH BADGUJAR";
		all.aakash.address = "Pune";
		
		all.mayur.id = 1002;
		all.mayur.name = "MAYUR JAGTAP";
		all.mayur.address = "Nashik";
		
		all.mohit.id = 1003;
		all.mohit.name = "MOHIT PARDESHI";
		all.mohit.address = "Jalgaon";
		
		return all;
		
	}
	
	
}

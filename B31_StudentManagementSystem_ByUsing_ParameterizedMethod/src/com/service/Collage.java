package com.service;

import com.controller.University;
import com.model.AllStudent;
import com.model.Student;

public class Collage {

	public void addSingleStudentDetails() {
		Student s =  new Student();
		s.id = 123;
		s.name = "Aakash_Badgujar";
		s.address = "Dhule";
		
		University uni = new University();
		uni.displaySingleStudent(s);
	}
	
	public void addAllStudentDetails() {
		AllStudent allStu = new AllStudent();
		allStu.s1.id = 12;
		allStu.s1.name = "Rohit";
		allStu.s1.address = "Gurgaon";
		
		allStu.s2.id = 13;
		allStu.s2.name = "Mohit";
		allStu.s2.address = "Nashik";
		
		allStu.s3.id = 14;
		allStu.s3.name = "Ajay";
		allStu.s3.address = "Malegaon";
		
		University uni = new University();
		uni.displayAllStudentDetails(allStu);
		
	}
	
}

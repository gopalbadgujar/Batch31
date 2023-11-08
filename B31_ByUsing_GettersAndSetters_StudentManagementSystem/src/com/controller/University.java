package com.controller;

import com.model.Student;
import com.service.Collage;

public class University {

	
	public static void main(String[] args) {
		System.out.println("-------STUDENTS DETAILS------");
		Student st = new Student();
		st.setId(100);
		st.setName("AAKASH");
		st.setAddress("PUNE");
//		System.out.println("Student id : "+st.getId());
//		System.out.println("Student Name : "+st.getName());
//		System.out.println("Student Address : "+st.getAddress());
		

		System.out.println("-----------------------------------");
		Collage clg = new Collage();
		Student s1 = clg.getStudent();
		System.out.println("Student id : "+s1.getId());
		System.out.println("Student Name : "+s1.getName());
		System.out.println("Student Address : "+s1.getAddress());
		
		
		
	}
}

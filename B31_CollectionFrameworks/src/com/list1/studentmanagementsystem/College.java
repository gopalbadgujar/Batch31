package com.list1.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class College {
	
	public List<Student> addStudentDetails(){
		
		Student s = new Student();
		s.setId(101);
		s.setName("Aakash");
		s.setAddress("PCMC");
		
		Student s1 = new Student();
		s1.setId(102);
		s1.setName("Mohit");
		s1.setAddress("Pune");
		
		Student s2 = new Student();
		s2.setId(103);
		s2.setName("Mayur");
		s2.setAddress("Dhule");
		
		List<Student> listOfStudents = new ArrayList<>();
		listOfStudents.add(s);
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		
		return listOfStudents;
		
	}

}

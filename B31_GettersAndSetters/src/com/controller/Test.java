package com.controller;

import com.gettersandsetters.*;

public class Test {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(30);
		s1.setName("Mayur");
		s1.setAddress("Lonavala");
		s1.setContact(98805305076l);
		s1.setMark(90.91);
		s1.setGrade('A');
		System.out.println("Student id is: " + s1.getId() + "\n" + "Student Name is: " + s1.getName() + "\n"
				+ "Student Address is: " + s1.getAddress());
		System.out.println("Student Contact is: " + s1.getContact() + "\n" + "Student mark is: " + s1.getMark() + "\n"
				+ "Student Grade is: " + s1.getGrade());

		System.out.println();
		System.out.println();
		
		Employee emp = new Employee();
		emp.setEid(121);
		emp.setEname("Mohit P.");
		emp.setSallery(56000.89);
		System.out.println("Employee Id = "+emp.getEid());
		System.out.println("Employee Name = "+emp.getEname());
		System.out.println("Employee Sallery = "+emp.getEsallery());
	}
}

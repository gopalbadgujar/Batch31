package com.list1.studentmanagementsystem;

import java.util.List;

public class University {

	public static void main(String[] args) {

		College collage = new College();
		List<Student> listStudent = collage.addStudentDetails();

		for (Student s : listStudent) {
			System.out.println(s.getId() + "  " + s.getName() + "  " + s.getAddress());
		}
		System.out.println();

		AllUniversities all = new AllUniversities();
		List<List<String>> allU = all.addUniversities();
		
		for(List<String> U:allU) {
			System.out.println(U);
			for(String uni :U) {
				System.out.println(uni);
			}
		}

	}
}

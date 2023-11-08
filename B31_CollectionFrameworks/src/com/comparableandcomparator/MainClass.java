package com.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student(99, "xyz", "pune");
		Student s2 = new Student(5, "ddd", "dhule");
		Student s3 = new Student(199, "kkk", "pcmc");
		Student s4 = new Student(77, "hhh", "delhi");
		Student s5 = new Student(44, "abc", "chincholi");
		Student s6 = new Student(22, "pqr", "mumbai");

		List<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		listOfStudent.add(s4);
		listOfStudent.add(s5);
		listOfStudent.add(s6);
		
		System.out.println("---Before Sorting---");
		for(Student s:listOfStudent) {
		   System.out.println(s.id+ "  "+ s.name+ "  "+ s.address);
		}
		Collections.sort(listOfStudent);
		
		System.out.println("\n---After Sorting---");
		for(Student s:listOfStudent) {
		   System.out.println(s.id+ "  "+ s.name+ "  "+ s.address);
		}


	}
}

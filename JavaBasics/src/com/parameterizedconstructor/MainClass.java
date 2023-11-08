package com.parameterizedconstructor;

public class MainClass {

	public static void main(String[] args) {

		Student s = new Student(101, "Santosh", "PCMC", 9098909845l, 89.90, 'A');
		System.out.println(s.id + "  " + s.name + "  " + s.address + "  " + s.contact + "  " + s.marks + "  " + s.grade);


	}
}

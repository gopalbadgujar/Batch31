package com.statickeywords;

public class Student {

	int id; //Non-Static Variable
	String name; //Non-Static Variable
	 final static String collageName = "DYP";   //Static Variable
	
	static {
		System.out.println("Static Block");
	}
	
	public static void m1() {
		System.out.println("Static m1 method....");
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.id = 201;
		s.name = "Aakash";
		System.out.println(collageName);
		//s.collageName = "PCCOE";
		//System.out.println(collageName);
		
		Student s1 = new Student();
		s1.id = 202;
		s1.name = "Suraj";
		System.out.println(s.id+"   "+s.name+"   "+collageName);
		System.out.println(s1.id+"   "+s1.name+"   "+collageName);

		
		
	}
	
}

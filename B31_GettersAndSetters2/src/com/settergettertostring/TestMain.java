package com.settergettertostring;

public class TestMain {

	public void displayData(Student s) {
		s.toString();
		System.out.println(s.toString());//
		System.out.println(s);//

//		System.out.println(s.getSid());
//		System.out.println(s.getSaddress());
//		System.out.println(s.getSname());
//		System.out.println(s.getScontact());
//		System.out.println(s.isPassed());
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setSid(21);
		s.setSaddress("MUMBAI");
		s.setSname("AAKASH_BADGUJAR");
		s.setScontact(8805305076l);
		s.setPassed(false);
		System.out.println(s.getSid());
		System.out.println(s.getSaddress());
		System.out.println(s.getSname());
		System.out.println(s.getScontact());
		System.out.println(s.isPassed());
		System.out.println();
		System.out.println("------------------------------------------------");
		
		TestMain t = new TestMain();
		t.displayData(s);
	}
	
	}

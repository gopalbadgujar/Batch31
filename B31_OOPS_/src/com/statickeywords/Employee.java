package com.statickeywords;

public class Employee {

	int eid = 201;                      //Non-Static Variable
	String ename = "AAKASH";            //Non-Static Variable
	static String deptName = "IT";      //Static Variable
	
	public void m1() {                 //Non-Static Method
		System.out.println("Non-Static m1 method....");
		System.out.println(eid +"  "+ename+"  "+deptName);
	}
	
	public static void m2() {
		
		Employee e = new Employee();
		System.out.println(e.eid);
		System.out.println(e.ename);
		System.out.println(deptName);
	}
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.m1();
		m2();
	}
	
}

package com.superandthiskeyword;

public class EmpDepartment extends Employee{
	
	String name;
	
	public EmpDepartment() {
     super();
     this.m1();
     System.out.println("EmpDepartment Constructor...");
	}
	public EmpDepartment(String s) {
		this.id = 2345;
		this.m3();
		System.out.println(id);
	}
	
	public void m3() {
	this.name = "IT";
	System.out.println("m3 method call Department Name:  "+name);
	}

	public static void main(String[] args) {
		EmpDepartment empD = new EmpDepartment();
		empD.m3();
	}
}

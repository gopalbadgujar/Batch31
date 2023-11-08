package com.superandthiskeyword;

public class Employee {

	int id;
	String name;
	long salary;
	
	public Employee() {
		this.id = 2003;
		System.out.println(id);
	}
	
	public String m1() {
		this.name = "AAKASH";
		System.out.println(name);
		this.m2();
		return name;
	}
	
	public void m2() {
		this.salary = 950000;
		System.out.println(salary);
	}
	
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.m1();
		
		System.out.println(emp.id);
		
	}
}

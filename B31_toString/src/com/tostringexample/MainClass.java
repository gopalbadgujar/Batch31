package com.tostringexample;

public class MainClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.toString();
		emp.id = 22;
		emp.name = "NILESH";
		emp.address = "Pune";
		emp.salary = 99000;
		System.out.println(emp);// id name address salary
	}
}

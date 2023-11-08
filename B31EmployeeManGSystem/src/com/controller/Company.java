package com.controller;

import com.model.AllEmployee;
import com.model.Employee;
import com.service.Department;

public class Company {

	public static void main(String[] args) {
		Department department = new Department();
		Employee emp = department.getEmployeeDetails();
		System.out.println(emp.companyName+"  "+emp.eid+"  "+emp.ename+"  "+emp.address+"  "+emp.emailId+"  "+emp.mobileNo+"  "+emp.salary);
		
		AllEmployee allEmp = department.getAllEmployeeDetails();
		System.out.println();
		System.out.println("::------ALL EMPLOYEE DETAILS------::");
		System.out.println(allEmp.aakash.companyName);
		System.out.println(allEmp.aakash.eid);
		System.out.println(allEmp.aakash.ename);
		System.out.println(allEmp.aakash.address);
		System.out.println(allEmp.aakash.emailId);
		System.out.println(allEmp.aakash.mobileNo);
		System.out.println(allEmp.aakash.salary);
		
		System.out.println();
		System.out.println(allEmp.mayur.companyName);
		System.out.println(allEmp.mayur.eid);
		System.out.println(allEmp.mayur.ename);
		System.out.println(allEmp.mayur.address);
		System.out.println(allEmp.mayur.emailId);
		System.out.println(allEmp.mayur.mobileNo);
		System.out.println(allEmp.mayur.salary);
		
		System.out.println();
		System.out.println(allEmp.mohit.companyName);
		System.out.println(allEmp.mohit.eid);
		System.out.println(allEmp.mohit.ename);
		System.out.println(allEmp.mohit.address);
		System.out.println(allEmp.mohit.emailId);
		System.out.println(allEmp.mohit.mobileNo);
		System.out.println(allEmp.mohit.salary);
		
		
	}
}

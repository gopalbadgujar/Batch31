package com.service;

import com.model.AllEmployee;
import com.model.Employee;

public class Department {

	public Employee getEmployeeDetails() {
		Employee e = new Employee();
		e.eid = 125449;
		e.ename = "Aakash S. Badgujar.";
		e.address = "Pune";
		e.emailId = "ak143@gmail.com";
		e.mobileNo = 8805305076l;
		e.salary = 150000;
		return e;
		
	}
	
	public AllEmployee getAllEmployeeDetails() {
		
		AllEmployee allE = new AllEmployee();
		allE.aakash.companyName = "XYZ";
		allE.aakash.eid = 125449;
		allE.aakash.ename ="Aakash S. Badgujar.";
		allE.aakash.address = "Pune";
		allE.aakash.emailId = "ak143@gmail.com";
		allE.aakash.mobileNo = 8805305076l;
		allE.aakash.salary = 150000;
		
		allE.mohit.companyName = "xxyyzz";
		allE.mohit.eid = 125448;
		allE.mohit.ename ="Mohit G. Pardeshi.";
		allE.mohit.address = "Dhule";
		allE.mohit.emailId = "mp143@gmail.com";
		allE.mohit.mobileNo = 8805305075l;
		allE.mohit.salary = 151000;
		
		allE.mayur.companyName = "aabbcc";
		allE.mayur.eid = 125447;
		allE.mayur.ename ="Mayur P. Jagtap.";
		allE.mayur.address = "Akurdi";
		allE.mayur.emailId = "mj2001@gmail.com";
		allE.mayur.mobileNo = 8005365074l;
		allE.mayur.salary = 50000;
		
		return allE;
		
	}
	
}

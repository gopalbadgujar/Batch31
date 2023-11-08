package com.parameter;

public class Student {

	int rollNo;
	String name;
	String address;
	
	// 
	Student(int roll){
		rollNo =roll;
	}
	
	Student(int rn, String n, String a){// 20, "PQR", "Mumbai" 
		rollNo = rn;
		name = n;
		address=  a;
	}
	
}
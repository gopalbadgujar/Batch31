package com.staticFinal;

public class Student {
	int rollNo;// 0
	final String name;// null
	static final String collegeName = "PCCOE";

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		System.out.println(rollNo);
	}

	public String getName() {
		return name;
	}

	Student() {
		this.name = "abc";
		System.out.println(name);
	}

}
package com.tostringexample;

public class Employee extends Object {

	int id;
	String name;
	String address;
	double salary;

	@Override
	public String toString() {
		return id+"  "+name+"  "+address+"  "+salary;
	}

}

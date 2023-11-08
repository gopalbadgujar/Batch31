package com.serializationanddeserialization;

import java.io.Serializable;

public class Employee implements Serializable {

	int id;
	transient String name;
	transient String address;
	transient double salary;
	public Employee(int id, String name, String address, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	// setter getter
	// para const
	
}

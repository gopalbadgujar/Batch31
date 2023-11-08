package com.parameterizedconstructor;

public class Employee {

	int id;
	String name;
	String address;

	public Employee() {
		
	}
	
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println(id+"  "+name+"  "+address);
	}
	
	public Employee(Employee e) {
		System.out.println(e.id+"  "+e.name+"  "+e.address);
	}
	public static void main(String[] args) {
		
		Employee em = new Employee(112, "SUNNY", "ShriRamPur");//Parameterized Constructor.
		
		Employee e = new Employee();
		e.id = 909;
		e.name = "Kiran";
		Employee e1 = new Employee(e);
		Employee e2 = new Employee(e1);

	}

	
	
}

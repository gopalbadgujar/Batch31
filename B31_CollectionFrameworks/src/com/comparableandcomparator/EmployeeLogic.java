package com.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeLogic {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "Santosh", "Pune", 75000.00);
		Employee e2 = new Employee(100, "Aakash", "Pune", 98000.00);
		Employee e3 = new Employee(99, "Vijay", "Pune", 50000.80);
		Employee e4 = new Employee(77, "Sunil", "Pune", 25000.10);
		Employee e5 = new Employee(89, "Vikas", "Pune", 100000.00);
		
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(e1);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		listOfEmployee.add(e4);
		listOfEmployee.add(e5);
		
		System.out.println("---Before Sorting---");
		for(Employee emp:listOfEmployee)
		{
			System.out.println(emp.eid+"   "+ emp.name+"   "+ emp.address+"   "+ emp.salary);
		}
		
		System.out.println("\n---Sort by Employee Using Name ---");
		Collections.sort(listOfEmployee, new SortByEmployeeUsingName());
		for(Employee emp:listOfEmployee)
		{
			System.out.println(emp.eid+"   "+ emp.name+"   "+ emp.address+"   "+ emp.salary);
		}

		
		System.out.println("\n---Sort by Employee Using Id ---");
		Collections.sort(listOfEmployee, new SortByEmployeeUsingId());
		for(Employee emp:listOfEmployee)
		{
			System.out.println(emp.eid+"   "+ emp.name+"   "+ emp.address+"   "+ emp.salary);
		}
		
		System.out.println("\n---Sort by Employee Using Salary ---");
		Collections.sort(listOfEmployee, new SortByEmployeeUsingSalary());
		for(Employee emp:listOfEmployee)
		{
			System.out.println(emp.eid+"   "+ emp.name+"   "+ emp.address+"   "+ emp.salary);
		}

		
	}
}

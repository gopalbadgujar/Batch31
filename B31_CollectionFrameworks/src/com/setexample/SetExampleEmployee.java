package com.setexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExampleEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "AAKASH");
		Employee emp2 = new Employee(101, "AAKASH");
		
		Set<Employee> setOfEmployees = new HashSet<Employee>();
		setOfEmployees.add(emp1);
		setOfEmployees.add(emp2);
		
		System.out.println(setOfEmployees.size());
	
		
		            //EXTRA PRACTICE
		
		System.out.println(setOfEmployees);//hash-value
		
		System.out.println("----------Using Iterator--------");
		Iterator<Employee> itr=setOfEmployees.iterator();
		while (itr.hasNext()) {
			Employee employee=itr.next();
			System.out.println(employee.id + "   "+ employee.name );
		}
		
		System.out.println("\n----------Using for each loop----------");
		for(Employee e:setOfEmployees) {
			System.out.println(e.id+ "   "+ e.name);
		}



	}
}

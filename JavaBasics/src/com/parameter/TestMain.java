package com.parameter;

public class TestMain {

	
	public static void main(String[] args) {
		System.out.println("Main started....");
		
		Student s = new Student(20, "PQR", "Mumbai");
		
		System.out.println(s.rollNo+"  "+s.name+"  "+s.address);
		// 20, "PQR", "Mumbai" 
		s.rollNo=10;
		s.name="Abc";
		
		System.out.println(s.rollNo+"  "+s.name+"  "+s.address);//10
		//10, "Abc", "Mumbai"
		
		Student s1= new Student(30);
		System.out.println(s1.rollNo+"  "+s1.name+"  "+s1.address);
		//30 , null , null
		
		
		System.out.println(" ----Car Details ---- ");
		
		Car c1 = new Car("Tata", "1500CC");
		System.out.println(c1.company+"  "+c1.engineCapacity);
		
		Car c2 = new Car("Mahindra", "2000CC");
		System.out.println(c2.company+"  "+c2.engineCapacity);
		
		System.out.println("Main Completed....");
	}
}
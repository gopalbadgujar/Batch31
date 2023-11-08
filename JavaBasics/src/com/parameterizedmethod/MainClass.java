package com.parameterizedmethod;

public class MainClass {
	
	public void m1() {
		
		System.out.println("Without Parameterized Method");
	}
	
	public void m2(int i) {
		System.out.println("Single Parameterized Method");
		System.out.println(i);
	}
	
	public void m3(String s, int i) {
		System.out.println("Double Parameterized Method");
		System.out.println(s+"   "+i);
	}
	
	public void m4(boolean flag, char c, double d) {
		System.out.println("Three Parameterized Method");
		System.out.println(flag+"   "+c+"   "+d);
	}
	
	public void m5(String s) {
        System.out.println("m5 method of MainClass");
        System.out.println(s);
	}
	
	public void displayEmpolyeeDeyails(Employee e) {
		System.out.println("---DISPLAY EMPLOYEE DETAILS---");
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}
	
	public void displayStudentAndEmployeeDetails(Student s, Employee e) {
		System.out.println("---DISPLAY STUDENT AND EMPLOYEE DETAILS---");
		System.out.println(s.rollNo+"   "+s.address);
		System.out.println(e.id+"   "+e.name+"   "+e.salary);
	}

	public static void main(String[] args) {
		MainClass test = new MainClass();
		test.m1();
		test.m2(0);
		test.m3("Aakash", 7890);
		test.m4(false, 'A', 12.32);
		test.m5("JAVA_WORLD");
		
		Employee emp = new Employee();
		emp.id = 1009;
		emp.name = "Sanjiv";
		emp.salary = 98000.9;
		test.displayEmpolyeeDeyails(emp);
		
		Student stu = new Student();
		stu.rollNo = 101;
		stu.address = "PUNE";
		
		test.displayStudentAndEmployeeDetails(stu, emp);
	}
}

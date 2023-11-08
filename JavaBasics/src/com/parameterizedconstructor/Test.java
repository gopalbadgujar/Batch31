package com.parameterizedconstructor;

public class Test {

	public Test() {
		System.out.println("---DEFAULT CONSTRUCTOR---");
	}
	
	public Test (int i) {
		System.out.println("---SINGLE PARAMETER---");
	}
	
	public Test(String s, double d) {
		System.out.println("---DOUBLE PARAMETER---");
		System.out.println(s+"  "+d);
	}
	
	public Test (boolean flag, char c, int k) {
		System.out.println("---THREE PARAMETER---");
		System.out.println(flag+"  "+c+"  "+k+"  ");
	}
	public Test(double h) {
		System.out.println("---SINGLE PARAMETER WITH DOUBLE---");
		System.out.println(h);
	}
	
	public Test (Company c) {
		System.out.println("---COMPANY PARAMETER---");
		System.out.println(c.companyId+"   "+c.companyAddress+"   "+c.companyName);
	}
	
	public Test (int i, String s, String str) {
		System.out.println("-------------------------------------");
		System.out.println(i +"   "+s+"   "+str);
	}
	
	public Test (Employee emp) {
		System.out.println("-------EMPLOYEE-DETAILS-------");
		System.out.println(emp.id+"  "+emp.address+"  "+emp.name);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		Test t1 = new Test(5);
		Test t2 = new Test("Aakash", 11);
		Test t3 = new Test(true, 'A', 121);
		Test t4 = new Test(5.77);

		Company com = new Company();
		com.companyId = 12012;
		com.companyAddress = "Mumbai";
		com.companyName = "InfoPlanet";
		Test t5 = new Test(com);
     	Test t6 = new Test(111, "Pune", "Infosys");
     	
     	Employee e = new Employee(11111, "MOHIT", "Kolkata");

     	Test t7 = new Test(e);
	}
}

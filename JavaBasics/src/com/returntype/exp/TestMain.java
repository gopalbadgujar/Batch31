package com.returntype.exp;

public class TestMain {

	public void m1() {
		System.out.println("-- m1() method -- ");
	}
	
	public byte getRollNo() {
		System.out.println("--- RollNo() method called... ---");
	    byte rN = 15;
		return rN;
	}
	
	public short getTotalStudent() {
		short s = 2222;
		return s;
		//return 2222;
	}
	
	public String getName() {
		return "AKWITHEXPONENT";
	}
	
	public Student getStudentData() {
		Student s = new Student();
		System.out.println("1..Student Values:"+s.rollNo+" "+s.name+" "+s.mobileNo);
		s.rollNo = 10;
		System.out.println("2..Student Values:"+s.rollNo+" "+s.name+" "+s.mobileNo);
        s.name ="AAKASH";
		System.out.println("3..Student Values:"+s.rollNo+" "+s.name+" "+s.mobileNo);
        s.mobileNo = 8805305076l;
        s.uniPRN = 1951711245009l;
        s.userName = "akashBad2019";
        s.age = 20;
        s.emailId = "ak1234@gmail.com";
        s.pswd = "ak1234";
        s.std = 14;
        s.div = 0;
        //System.out.println(s.div);
        s.sub = 11;
        s.marks= 89.54f;
        s.cgpa = 9.0;
        s.gradeOfStudent = 'A';
        s.backLog = 0;
        s.uniformColor = "SkyBlue";
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println("--Main Method Started....----");
		TestMain ts = new TestMain();
		ts.m1();
		byte b = ts.getRollNo();
		System.out.println(b);
		
		short s = ts.getTotalStudent();
		System.out.println(s);
		
		String str = ts.getName();
		System.out.println(str);
		
		Student stu = ts.getStudentData();
		System.out.println("Student Values:- \n"+"Student RollNo: "+stu.rollNo+"\n "+"Student Name: "+stu.name+"\n "+"Student MobileNo: "+stu.mobileNo);
		System.out.println("\n ----: STUDENT DATA :----");
		System.out.println(stu.name);
		System.out.println(stu.mobileNo);
		System.out.println(stu.userName);
		System.out.println(stu.emailId);
		System.out.println(stu.pswd);
		System.out.println(stu.uniPRN);
		System.out.println(stu.rollNo);
		System.out.println(stu.uniformColor);
		System.out.println(stu.std);
		System.out.println(stu.div);
		System.out.println(stu.sub);
		System.out.println(stu.marks);
		System.out.println(stu.cgpa);
		System.out.println(stu.gradeOfStudent);
		System.out.println(stu.backLog);
		System.out.println(stu.age);

		System.out.println("--Main Method Ended....----");
	}
}

package com.stringUtil;

public class StringTestMain1 {

	public static void main(String[] args) {

		String s1 = "abc";// scp
		String s2 = new String("abc");// heap
		String s4 =	s1.concat("pqr");
		System.out.println("String value is "+ s4);
		System.out.println(s1 == s2);// false

		// intern
		String s3 = s2.intern();// scp
		System.out.println(s1 == s3);// true
		
		String s5 = "   Expo nent   ";
		System.out.println("before trim :"+ s5);
		System.out.println("After trim :"+s5.trim());
		
		
		String s6 = "welcome to Exponent";
		System.out.println(s6.substring(7));
		System.out.println(s6.substring(0, 7));
		System.out.println(s6.substring(7, 9));
		
		//format 
		
		int rollNo =100;
		String name = "Abc";
		String address ="Pune";
		System.out.println("Hi Your roll No is :"+ rollNo + "  & name is : "+ name + " & adress is :"+address);
		String str = String.format("Hi Your roll No is : %s  & name is : %s , Addres is %s", rollNo, name, address);
		System.out.println(str);
		

	}
	
	

}
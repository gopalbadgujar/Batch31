package com.stringUtil;

public class MemoryManagement {

	public static void stringMemoryManagment() {
		System.out.println("------------String Memeory Management-------------");
				String s = "abc";// literal
				String s1 = new String("abc"); // by using new keyword

				System.out.println(s);
				System.out.println(s1);

				System.out.println(s == s1);// equal to operator ...hashcode/reference

				String s2 = "abc";
				System.out.println(s == s2);//

				String s3 = "abc";
				System.out.println(s == s3);//

				String s4 = "Abc";
				System.out.println(s == s4);

				String s5 = new String("abc");
				//System.out.println(s1 == s5);
				System.out.println(s1.equals(s5));
			}

}

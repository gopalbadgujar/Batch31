package com.stringUtil;

public class StringMethods {

	public static void stringMethods() {
		String s = "abcd"; // Literal
		String s1 = new String("abcd"); // By using new keyword
		System.out.println(s == s1); // Condition

		// 1. equals....
		System.out.println("-----Equals Method------");
		System.out.println(s.equals(s1));// equals.... method

		// 2.--> length
		System.out.println("-----Length Method------");
		System.out.println(s.length());
		String mobileNo = "8805305076";
		System.out.println(mobileNo.length());

		// 3. toCharArray
		System.out.println("-----toCharArray Method------");
		char[] characters = mobileNo.toCharArray();

		for (char c : characters) {
			System.out.print(c + "");
		}
		System.out.println();

		// 4/ charAt(index)
		System.out.println("-----charAt(index) Method------");
		String s2 = "Exponent";
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(1));
		System.out.println("Last Char is : " + s2.charAt(s2.length() - 1));// last character ? -- s2.length()-1

		// toLowerCase & toUpperCase
		System.out.println("-----toLowerCase & toUpperCase Method------");
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());

		// startsWith
		System.out.println("-----startsWith Method------");
		System.out.println(s2.startsWith("Ex"));// prefix
		System.out.println(s2.startsWith("xpo"));//

		// endsWith
		System.out.println("-----endsWith Method------");
		System.out.println(s2.endsWith("ent"));// suffix
		System.out.println(s2.endsWith("abc"));//

		// concat
		System.out.println("-----concat Method------");
		String firstName = "abc";
		String lastName = "pqr";
		// String fullName = firstName + lastName;
		String fullName = firstName.concat(" ").concat(lastName);
		System.out.println(fullName);

		// format, substring, trim

	}

}

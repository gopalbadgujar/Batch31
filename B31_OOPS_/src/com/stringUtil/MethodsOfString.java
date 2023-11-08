package com.stringUtil;

public class MethodsOfString {
	static String str = new String("Hello Aakash");

	public static void stringLength() {
		System.out.println("-------------Length Method -----------------");
		System.out.println("Length of given String: " + str.length());
	}

	public static void stringLowerAndUpperCase() {
		System.out.println("-------------Lower And Upper Case Method -----------------");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

	static public void stringTrim() {
		System.out.println("-------------Trim Method -----------------");
		String string = new String("  Hello Aakash, How are you?  ");
		System.out.println(string);
		String s = string.trim();
		System.out.println("This method removes the LEADING & TRATING Spaces : \n" + s);
		System.out.println(string.trim());

		System.out.println("\n");
		String s5 = "   Expo nent   ";
		System.out.println("before trim :" + s5);
		System.out.println("After trim :" + s5.trim());
	}

	static public void stringSubString() {
		System.out.println("-------------SubString Method -----------------");
		String substr = str.substring(3, 9);
		System.out.println("Return a string from Start index to End index: \n" + substr);
		System.out.println("Return a string from Start index: \n" + str.substring(5));

		System.out.println("\n");
		String s6 = "welcome to Exponent";
		System.out.println(s6.substring(7));
		System.out.println(s6.substring(0, 7));
		System.out.println(s6.substring(7, 9));
	}

	public static void stringReplace() {
		String str1 = "Hello";
		System.out.println("-------------Replace Method -----------------");
		System.out.println("Replaced String  : " + str1.replace("He", "Bo"));
		System.out.println("Replaced String Characters : " + str1.replace('l', 'p'));
	}

	public static void stringEndWithStartWith() {
		System.out.println("-------------Start With & End With Method -----------------");
		System.out.println(str.startsWith("ha"));
		System.out.println(str.endsWith("h"));
	}

	public static void stringCharAt() {
		System.out.println("-------------charAt() Method -----------------");
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(3));
		System.out.print(str.charAt(str.length() - 1)); // Last Character
		System.out.print(str.charAt(str.length() - 2)); // Last 2nd Character
		System.out.print(str.charAt(str.length() - 3)); // Last 3rd Character
		System.out.print(str.charAt(str.length() - 4)); // Last 4th Character
		System.out.print(str.charAt(str.length() - 5)); // Last 5th Character
		System.out.print(str.charAt(str.length() - 6)); // Last 6th Character
		System.out.println();
	}

	public static void stringIndexOf() {
		System.out.println("-------------indexOf() Method -----------------");
		// System.out.println(str.indexOf('r'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('l', 1));
		System.out.println(str.indexOf('H', 8)); // -1 = default value
		System.out.println();

		System.out.println("-------------LastIndexOf() Method -----------------");
		System.out.println(str.lastIndexOf('s'));
		System.out.println(str.lastIndexOf('s', 7));// -1 = default value when character not found
		System.out.println(str.lastIndexOf('H', 8));
		System.out.println(str.lastIndexOf('a', 8));
		System.out.println(str.lastIndexOf('a', 9));
	}

	public static void stringEquals() {
		System.out.println("-------------equals() Method -----------------");
		System.out.println(str.equals(str));
		System.err.println(str.equals("Hello Aakash"));
		System.err.println(str.equals("Hello"));
		System.out.println();

		System.out.println("-------------equalIgnoreCase() Method -----------------");
		System.out.println(str.equalsIgnoreCase("Hello Aakash"));
		System.out.println(str.equalsIgnoreCase("helloAakash"));
		System.out.println(str.equalsIgnoreCase("hello"));
	}

	public static void stringFormat() {
		System.out.println("-------------format() Method -----------------");
		int rollNo = 100;
		String name = "Abc";
		String address = "Pune";
		System.out.println("Hi Your roll No is :" + rollNo + "  & name is : " + name + " & adress is :" + address);
		String str = String.format("Hi Your roll No is : %s  & name is : %s , Addres is %s", rollNo, name, address);
		System.out.println(str);
	}

	public static void stringConcat() {
		System.out.println("---------------concat() Method-------------");
		String firstName = "abc";
		String lastName = "pqr";
		// String fullName = firstName + lastName;
		String fullName = firstName.concat(" ").concat(lastName);
		System.out.println(fullName);
		System.out.println("\n");
		
		String s1 = "abc";// scp
		String s2 = new String("abc");// heap
		String s4 = s1.concat("pqr");
		//String s4 = s1.concat(s2);
		System.out.println("String value is " + s4);
		System.out.println(s1 == s2);// false
	}

	public static void stringToCharArray() {
		System.out.println("---------------toCharArray Method----------");

		String name = "Aakash_Badgujar";
		// name.toCharArray();
		// System.out.println(name.toCharArray());
		char[] n = name.toCharArray();
		for (char c : n) {
			System.out.print(c + "  ");
		}
		System.out.println();
		System.out.println();

		String mobileNo = "8805305076";
		char[] characters = mobileNo.toCharArray();

		for (char c : characters) {
			System.out.print(c + "    ");
		}
		System.out.println();
	}

	public static void stringIntern() {
		System.out.println("---------------intern() Method----------");

		String s1 = "abc";// scp
		String s2 = new String("abc");// heap
		String s4 = s1.concat("pqr");       //concat method joins the strings..
		System.out.println("String value is " + s4);
		System.out.println(s1 == s2);// false

		// intern
		String s3 = s2.intern();// scp-->String Constant Pool
		System.out.println(s1 == s3);// true

	}

}

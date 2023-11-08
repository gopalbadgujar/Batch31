package com.stringUtil;

public class StringTestMain {

	public static void main(String[] args) {
		StringMethods.stringMethods();
		MemoryManagement.stringMemoryManagment();
		
		MethodsOfString.stringLength();
		MethodsOfString.stringLowerAndUpperCase();
		MethodsOfString.stringTrim();
		MethodsOfString.stringSubString();
		MethodsOfString.stringReplace();
		MethodsOfString.stringEndWithStartWith();
		MethodsOfString.stringCharAt();
		MethodsOfString.stringIndexOf();
		MethodsOfString.stringEquals();
		MethodsOfString.stringConcat();
		MethodsOfString.stringToCharArray();
		MethodsOfString.stringIntern();

		MethodsOfString.stringFormat();
		int rollNo = 100;
		String str = "Aakash";
		System.out.format("Your RollNo is: %s  & Name is : %s",rollNo,str);
		System.out.println();
		

	}

}

package com.dataType;

public class DataTypesTest {
	//Global Variable
	//Integer
	// byte<short<int<long
	byte b = 127; //1 byte = 8 bit   Range=> -128 to 127 // Default Value = 0
	byte b1;
	short s = 133; //2 byte = 16 bit   Range=> -32768 to 32767 // Default Value = 0
	int i = 33000; //4 byte = 32 bit   Range=> -2,147,483,648 to 2,147,483,647 // Default Value = 0
	long l = 9999999l; //8 byte = 64 bit   Range=> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 // Default Value = 0
	
	//Floating
	//float<double
	float f = 123.54f; // 4 byte , // 6 to 7 decimal digit , //  Default Value = 0.0
	double d = 46.78;  // 8 byte , // 15 decimal digit ,  //  Default Value = 0.0
	
	//Boolean 
	boolean flag = true; // 1 bit , //  Default Value = false
	
	// Character
	char c = 'G'; // A-Z , a-z , $#   // Default Value 1byte
	char ca;
	
	// non primitive
	String name = "abc";
	//System.out.println(b); --> int gives us error


public static void main(String[] args) {
	DataTypesTest t = new DataTypesTest();
//	System.out.println(t.b + " by default value of byte is :" + t.b1);
//	System.out.println(t.s);
//	System.out.println(t.i);
//	System.out.println(t.l);
//	System.out.println(t.f);
//	System.out.println(t.d);
//	System.out.println(t.flag);
//	System.out.println(t.c);
//	System.out.println(t.name);
	
	
	System.out.println(t.ca);

}

}


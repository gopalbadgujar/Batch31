package com.AccessModifiers_1;

public class TestMain {

	public int id_Public= 100;
	String name_default = "Abc Pqr";
protected String address_protected = "Pune ";
private int areaCode_private = 412101;

// create m1, m2, m3, m4-- different scope..

public static void main(String[] args) {
	TestMain main = new TestMain();
	
	System.out.println(main.id_Public);
	System.out.println(main.name_default);
	System.out.println(main.address_protected);
	System.out.println(main.areaCode_private);
}


}

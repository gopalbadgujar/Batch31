package com.AccessModifiers_1;

public class SamePackageAnotherClass {

	public static void main(String[] args) {

		TestMain main = new TestMain();
		System.out.println(main.id_Public);
		System.out.println(main.name_default);
		System.out.println(main.address_protected);
		//System.out.println(main.areaCode_private);
	
	}
}

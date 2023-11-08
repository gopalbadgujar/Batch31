package com.AccessModifiers_2;

import com.AccessModifiers_1.TestMain;

public class NewPackageWithoutInheritance {

	public static void main(String[] args) {

		TestMain main = new TestMain();
		System.out.println(main.id_Public);
		//System.out.println(main.name_default);
		//System.out.println(main.address_protected);
		//System.out.println(main.areaCode_private);
	
	}
	
}
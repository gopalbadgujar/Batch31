package com.AccessModifiers_2;

import com.AccessModifiers_1.*;

public class NewPackageWithInheritance extends TestMain {
		
		public static void main(String[] args) {
			NewPackageWithInheritance main = new NewPackageWithInheritance();
			
			System.out.println(main.id_Public);
			//System.out.println(main.name_default);
			System.out.println(main.address_protected);
			//System.out.println(main.areaCode_private);
			
			
		}

}

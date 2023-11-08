package com.accessmodifiers2;

import com.accessmodifiers.DefaultTest;
import com.accessmodifiers.ProtectedTest;

public class Demo extends ProtectedTest {
	
	public static void main(String[] args) {
		
//		DefaultTest d = new DefaultTest();
//		
//		System.out.println(d.id);
//		d.m1();
//	
//		ProtectedTest p  = new ProtectedTest();
		
		Demo dm = new Demo();
		System.out.println(dm.id);
		dm.m1();
		
	
	}

}

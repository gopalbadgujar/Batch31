package com.accessmodifiers;

public class Test {

	
	public static void main(String[] args) {
		
		//PrivateTest pt = new PrivateTest();
		
		//System.out.println(pt.id);
		//pt.m1();
		
		DefaultTest dt = new DefaultTest();
		System.out.println(dt.id);
		dt.m1();
		
		
		ProtectedTest p = new ProtectedTest();
		System.out.println(p.id);
		p.m1();
		
		
		
		
	}
	
	
	
}

package com.finalkeywords;

public class FinalTest {

	final int id = 100;//constant
	
	public void m1() {
		System.out.println("m1 Method of FinalTest");
	}
	
	public static void main(String[] args) {
		
		FinalTest t = new FinalTest();
		// t.id = 200; //-> give error--> remove final keyword of 'id'
		
		int i = t.id;
		System.out.println(i);
		System.out.println(t.id);
		
	}
	
}


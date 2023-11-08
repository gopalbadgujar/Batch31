package com.tostringexample;

public class Test {
// There are 5 Blocks in Java :--> CONSTRUCTOR, METHOD, MAIN METHOD, STATIC BLOCK , NON-STATIC BLOCK
//	STATIC BLOCK & NON-STATIC BLOCK
	
	static {
		System.out.println("------Static Block-------");
	}
	
	Test(){
		System.out.println("............Default Constructor...........");
	}
	
	{
		System.out.println("--------------Non-Static Block--------------");
	}
	
	public static void main(String[] args) {
		
		System.out.println("====================Main Method======================");
		
		Test test1 = new Test();
		//Test test2 = new Test();
		//Test test3 = new Test();
		new Test();

		
	}
	
}

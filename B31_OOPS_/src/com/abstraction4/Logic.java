package com.abstraction4;

public class Logic implements  I10 {
	
	public static void main(String[] args) {
		
		System.out.println(I10.x);
		System.out.println(Logic.x);
		System.out.println(x);
		
		
		I10 i = new Logic();
		System.out.println(i.x);
		
		
		Logic logic = new Logic();
		System.out.println(logic.x);
		
	}

}

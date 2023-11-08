package com.abstraction4;

public class H implements I8, I9 {

	@Override
	public void show() {
		System.out.println("Show method of I8 & I9.");
	}
	
	public static void main(String[] args) {
		
		I8 i8 = new H();
		i8.show();
		
		I9 i9 = new H();
		i9.show();
	}

}

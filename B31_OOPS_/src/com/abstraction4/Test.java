package com.abstraction4;

public class Test implements I3 {
	
	int x = 500;

	@Override
	public void m2() {
		System.out.println("I2 : interface");
	}

	@Override
	public void m1() {
		System.out.println("I1 : interface");
	}

	@Override
	public void m3() {
		System.out.println("I3 : interface");
	}
	
	public void m4()
	{
		System.out.println("test class m4 method");
	}
	
	public static void main(String[] args) {
		
         I1 i = new Test();		
         System.out.println(i.p);
         i.m1();
         
         
         System.out.println("---I2----");
         I2 i2 = new Test();//I1+I2
         System.out.println(i2.p);
         System.out.println(i2.q);
         i2.m1();
         i2.m2();
         
         System.out.println("---I3---");
         I3 i3 = new Test();//I1+I2+I3
         System.out.println(i3.p);
         System.out.println(i3.q);
         System.out.println(i3.r);
         i3.m1();
         i3.m2();
         i3.m3();
         
         System.out.println("---Test----");
         
         Test test = new Test();
         System.out.println(test.p);
         System.out.println(test.q);
         System.out.println(test.r);
         System.out.println(test.x);
         
         test.m1();
         test.m2();
         test.m3();
         test.m4();
         
		
	}

	
}
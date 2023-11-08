package com.returntype.exp2;

public class B {
	int p = 10;
	int q;
	int r = 30;
	
	public B m2() {
	    B b1 = new B();
	    b1.r = 20;
	    b1.q = 80;
	    System.out.println(b1.p+ " "+b1.q+" "+b1.r); //10 80 20
	    int p = 100;
	    int q = 200;
	    int r = 300;
	    
	    B b2 = new B();
	    b2.p = q; //200
	    b2.q = p; //100
	    b2.r = r; //300
	    System.out.println(b2.p+" "+b2.q+" "+b2.r); //200 100 300
	    
	    B b3 = new B(); // p = 10, q = 0, r = 30;
	    System.out.println(b3.p+"  "+q+"  "+r); //10  200 300
	    
	    B b4 = new B(); // p = 10, q = 0, r = 30;
	    return b4;
	    
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.p+"  "+b.q+"  "+b.r);
		
		 B b6 = b.m2();
		// b6.p = 1111;
		 System.out.println(b6.p+"  "+b6.q+"  "+b6.r);
		
	}
}

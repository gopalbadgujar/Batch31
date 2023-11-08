package com.inheritance;

public class R extends Q {

	// Q : Parent Class
	// R : Child Class
	// P+Q+R
	
	int z = 30;
	
	public void m3() {
		System.out.println("R--> m3() Method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("-----------P------------");
		P p = new P();
		System.out.println(p.x);
		p.m1();
		System.out.println("\n");
		
		System.out.println("-----------Q------------");
		Q q = new Q();
		System.out.println(q.x);
		System.out.println(q.y);
		q.m1();
		q.m2();
		System.out.println("\n");
		System.out.println("-----------R------------");
		R r = new R();
		System.out.println(r.x);
		System.out.println(r.y);
		System.out.println(r.z);
		r.m1();
		r.m2();
		r.m3();
	}
	
}

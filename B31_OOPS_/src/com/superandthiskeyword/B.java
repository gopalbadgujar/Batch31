package com.superandthiskeyword;

public class B extends A {

	public B() {

		this(10);
		System.out.println("B const");
	}

	public B(int i) {

		this("OM", 80);
		System.out.println(222);
	}

	public B(String s, int i) {

		super(10.10, 10, true);
	}

	public static void main(String[] args) {
		
		B b = new B();
	}

}

package com.superandthiskeyword;

public class D extends C {

	public D() {

		this(20, 40);
		System.out.println(111);
	}

	public D(int i ,  int j ) {

		this(true, 34.67f, 997l);
		System.out.println(999);
	}

	public D(String s) {

		this();
		System.out.println(777);
	}

	public D(boolean b, float f, long l) {

		super();
		System.out.println(555);
	}

	public static void main(String[] args) {
		D d = new D("testing");
	}
}

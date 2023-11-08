package com.superandthiskeyword;

public class C {

	public C() {

		this('c', 20);
		System.out.println(444);
	}

	public C(double d) {

		this(90,"abc",true);
		System.out.println(777);
	}

	public C(int i, String s, boolean v) {
		super();
		System.out.println(222);
	}

	public C(char c, int j) {

		this(10.34);
		System.out.println(888);
	}
}

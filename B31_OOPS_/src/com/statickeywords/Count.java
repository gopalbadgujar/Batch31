package com.statickeywords;

public class Count {

	int count = 0;

	Count() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {

		Count c = new Count();
		Count c1 = new Count();
		Count c2 = new Count();

	}
}

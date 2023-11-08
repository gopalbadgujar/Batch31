package com.abstraction1;

public class MH extends Vehicle {

	@Override
	public void specification() {
		System.out.println("MH SPECIFICATION");
	}
	
	public static void main(String[] args) {
		Vehicle v = new MH();
		v.specification();
		v.tyre();
		
		MH mh = new MH();
		mh.specification();
		mh.tyre();
		
		MS ms = new MS();
		ms.specification();
		ms.tyre();
	}
}

package com.abstraction1;

public class TATA extends Vehicle {

	@Override
	public void specification() {
		System.out.println("TATA Specification");
	}
	
	public void tataMethods() {
		System.out.println("TATA Class own methods.");
	}
	
	
	public static void main(String[] args) {
		
		Vehicle v = new TATA();
		v.specification();
		v.tyre();
		
		TATA tata = new TATA();
		tata.tyre();
		tata.specification();
		tata.tataMethods();
	}
	
}

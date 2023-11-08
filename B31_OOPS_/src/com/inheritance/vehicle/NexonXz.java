package com.inheritance.vehicle;

public class NexonXz extends Nexon{
	// Tata--> Nexon--> NexonXZ --- > Multilevel 

	
	String VariantType = "XZ";
	
	public static void main(String[] args) {
		NexonXz n = new NexonXz();
		System.out.println(n.companyName);
		System.out.println(n.modelName);
		System.out.println(n.VariantType);
		n.moveForward();
		n.moveReverse();
		n.playMusic();
	}
}
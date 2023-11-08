package com.inheritance.vehicle;


public class Safari extends Tata{//Single
	// Tata--> Nexon Safari -- Hierarchical 

	String modelName ="Safari";
	
	public void moveForward() {
		System.out.println("Car is moving in Forward direction....250KMPH");
	}
	
	public static void main(String[] args) {
		Safari s = new Safari();
		System.out.println(s.modelName);
		System.out.println(s.companyName);
		s.moveForward();
		s.playMusic();
	}
}
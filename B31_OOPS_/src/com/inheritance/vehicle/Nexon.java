package com.inheritance.vehicle;


public class Nexon extends Tata {// single Inheritance

	//String companyName ="Tata";
	String modelName ="Nexon";
	
	public void moveForward() {
		System.out.println("Car is moving in Forward direction....150KMPS");
	}
	
	public void moveReverse() {
		System.out.println("Car is moving in Reverse direction....");
	}
	
	/*public void playMusic() {
		System.out.println("Music system started...");
	}*/
	
	public static void main(String[] args) {
		Nexon n = new Nexon();
		System.out.println(n.companyName);
		System.out.println(n.modelName);
		n.moveForward();
		n.moveReverse();
		n.playMusic();
	}
}
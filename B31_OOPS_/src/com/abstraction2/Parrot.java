package com.abstraction2;

public class Parrot extends Bird {

	@Override
	public void bodyColor(String color) {
		System.out.println(name + " color is " + color);
	}

	public void feather(String color) {
		System.out.println(name + " Feathers are " + color + " in color.");
	}

	@Override
	public void beak(String color) {
		System.out.println(name + " beak is " + color + " in color.");
	}

	@Override
	public void voice(String name) {
		System.out.println(name + " voice is like mithuuu~~~ mithuu~~~~");
	}

	@Override
	public void fly(String name) {
		super.fly(name);
	}

	@Override
	public void layEggs() {
		super.layEggs();
	}

	@Override
	public void bodyStructure() {
		System.out.println("????????????");
	}
	
	public static void main(String[] args) {
		
		
		Bird bird1 = new Parrot();
		bird1.name= "Parrot";
		//bird1.beak ="Red";
		//bird1.feathers = "Green";
		bird1.bodyColor("Green");
		bird1.beak("Red");
		bird1.bodyStructure();
		bird1.feather("Green");
		bird1.fly("Parrot");
		bird1.layEggs();
		bird1.voice("Parrot");	
		
	}
}

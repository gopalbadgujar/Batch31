package com.abstraction2;

public abstract class Peacock extends Bird {

	@Override
	public void bodyColor(String color) {
		System.out.println(name+" color is "+color);
	}
	@Override
	public void feather(String color) {
        System.out.println(name + " Feathers are "+color+" in color.");
	}
	@Override
	public void beak(String color) {
        System.out.println(name + " beak is "+color+" in color.");
	}
	@Override
	public void voice(String name) {
		System.out.println(name +" voice is like maoo~ maooo~~");
	}
	@Override
	public void fly(String name) {
		super.fly(name);
	}
	@Override
	public void layEggs() {
		super.layEggs();
	}
	
	public static void main(String[] args) {
		Bird bird1 = new Parrot();
		bird1.name= "Peacock";
		bird1.bodyColor("Blue");
		bird1.beak("Red");
		bird1.bodyStructure();
		bird1.feather("Blue_green");
		bird1.fly("Peacock");
		bird1.layEggs();
		bird1.voice("Peacock");
	}
}

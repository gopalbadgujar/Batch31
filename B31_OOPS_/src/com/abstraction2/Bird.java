package com.abstraction2;

public abstract class Bird {
	String name;
	String feathers;
	String beak;
	
    public abstract void bodyColor(String color);
	
	public abstract void feather(String color);
	
	public abstract void beak(String color);

	public abstract void voice(String name);

	public abstract void bodyStructure();
	
	public void fly(String name) {
		System.out.println(name + " Can fly !!");
	}
	
	public void layEggs() {
		System.out.println("Birds Can Lay Eggs.");
	}

}

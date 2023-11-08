package com.abstraction3;

public class MainClass implements I {

	int y = 25;
		@Override
	public void m1() {
		System.out.println("implemented m1 method");
	}

	@Override
	public void m2() {
		System.out.println("implemented m2 method");
	}

	public static void main(String[] args) {
		// I i = new I();
		I i = new MainClass(); // indirect object
		i.m1();
		i.m2();
		System.out.println(i.x);
		System.out.println(i.y);//200

		System.out.println("---implemented class object----");
		MainClass mainclass = new MainClass();
		mainclass.m1();
		mainclass.m2();
		System.out.println(mainclass.x);
		System.out.println(mainclass.y);//25
		
	}

}

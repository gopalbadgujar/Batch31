package com.superThis;

public class Parent {

	int id = 10;//300

	// we cann't use super and this keywords inside static --
	public static void main(String[] args) {
		m1();// static to static --- no need of object
		Parent p = new Parent();
		p.m2();
		p.m3();
		// static to non static -- need an object
		System.out.println(p.id);
	}

	public void m2() {
		m3();
		System.out.println("Final Ans: "+id);//300 
		int id = 100;
		System.out.println(this.id);// 10
	}

	public void m3() {
		int id = 200;
		this.id=300;
	}

	public static void m1() {
		System.out.println("m1 method of Parent Class...");
	}

}
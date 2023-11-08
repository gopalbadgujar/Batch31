package com.thread;

public class Test extends Thread {

	@Override
	public void run() {
		System.out.println("Thread Name : " + Thread.currentThread().getName()); // by default--> Thread -0
		System.out.println("\n");

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
		}

		System.out.println("\n -- by using sleep() method--");
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread Name : " + Thread.currentThread().getName());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Main Thread Name: " + Thread.currentThread().getName()); // by default--> main

		Test t = new Test();

		t.setName("MyThread"); // custom name
		t.start();
	}

}

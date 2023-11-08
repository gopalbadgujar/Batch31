package com.runnable;

public class Demo implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Name : " + Thread.currentThread().getName()); // by default--> Thread -0
		System.out.println("Thread is  : " + Thread.currentThread().isDaemon());
	}

	// main method is not declare as setDaemon.
	public static void main(String[] args) { //main thread also a user-defined thread.

		Demo d =  new Demo();
		Thread t = new Thread(d);
		Thread t1 = new Thread(d, "MyThread"); // parameterized thread constructor

		t.setDaemon(true);
		t.start();  // user-defined threads.
		
		t1.setDaemon(false);
		t1.start(); // user-defined threads.
		

	}

}

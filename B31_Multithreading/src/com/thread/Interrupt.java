package com.thread;

public class Interrupt extends Thread {
	
	@Override
	public void run() {
		
//		System.out.println(Thread.currentThread().isInterrupted()); // true
//		System.out.println(Thread.currentThread().isInterrupted()); // true

		System.out.println(Thread.currentThread().interrupted()); //true-->false
		System.out.println(Thread.currentThread().interrupted()); //false
		System.out.println(Thread.currentThread().interrupted()); //false


		

		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
//				Thread.sleep(1000);
				Thread.sleep(1000, i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		Interrupt inpt = new Interrupt();
		inpt.start();
		inpt.interrupt();
		
	}
}

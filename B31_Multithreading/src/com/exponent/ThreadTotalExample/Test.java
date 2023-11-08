package com.exponent.ThreadTotalExample;

public class Test extends Thread {

	private static Thread mainThread;

	@Override
	public void run() {

		try {
			mainThread.join();
//			mainThread.sleep(2000);
			for (int i = 1; i <= 5; i++) {
//				Thread.yield();

				System.out.println("MyThread : " + i);
				Thread.sleep(1000);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		mainThread = currentThread();

		Test t = new Test();
		t.setName("MyThread");
		t.start();
//		Thread.yield();
//		t.join();

		try {
//			mainThread.join();
//			mainThread.sleep(2000);
		for (int i = 1; i <= 5; i++) {
				System.out.println("main Thread : " + i);
				Thread.sleep(1000);
			} 
		}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


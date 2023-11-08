package com.exponent.ThreadTotalExample;

public class DemoSyncExample {

	private synchronized void printTable(int n) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			Thread.sleep(1000);
		}
	}

	public static void main(String[] args) {

		DemoSyncExample d = new DemoSyncExample();

		Thread th = new Thread() { // anonymous class

			@Override
			public void run() {
				try {
					d.printTable(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};

		Thread th1 = new Thread() { // anonymous class

			@Override
			public void run() {
				try {
					d.printTable(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		
		th.start();
		th1.start();

	}
}

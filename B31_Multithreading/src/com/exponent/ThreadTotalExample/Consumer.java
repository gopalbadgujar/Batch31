package com.exponent.ThreadTotalExample;

public class Consumer extends Thread {

	Company c;
	public Consumer(Company c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				this.c.consume_item();
				Thread.sleep(1000);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.exponent.ThreadTotalExample;

public class Producer extends Thread {
	Company c;
	public Producer(Company c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		int i =1;
		try {
			while(true) {
				this.c.produce_item(i);
				Thread.sleep(1000);
				i++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

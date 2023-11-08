package com.userdefinedexception;

import java.util.Scanner;

public class MainClass {

	public static void pinCheck() throws ATMPinCheckException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your four digit atm pin ");
		String atmPin = sc.next();
		
		if (atmPin.equals("1234")) {
			System.out.println("txn success...");
		}
		else {
			throw new ATMPinCheckException("Invalid atm pin");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		
		try {
			pinCheck();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

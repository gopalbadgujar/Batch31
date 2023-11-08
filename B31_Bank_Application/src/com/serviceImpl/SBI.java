package com.serviceImpl;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.model.Account;
import com.service.RBI;

public class SBI implements RBI {

	Account ac = new Account();
	Scanner sc = new Scanner(System.in);

	public void createAccount() {
		System.out.println("SBI bank is going to open an account ");
		ac.setAccNo(getValidAccountNumber());
		ac.setName(getValidName());
		ac.setAddress(getValidAddress());
		ac.setBalance(getValidBalance());
		ac.setPanNumber(getPanNumber());
		ac.setMobNumber(getValidMobileNumber());

	}

	public void displayAccountDetails() {
		if (getValidAccountNumber() == ac.getAccNo()) {
			System.out.println("Account Details is :- ");
			System.out.println("Account Number : " + ac.getAccNo());
			System.out.println("Account Holder Name : " + ac.getName());
			System.out.println("Account Holder Address : " + ac.getAddress());
			System.out.println("Account Pan Number : " + ac.getPanNumber());
			System.out.println("Account Mobile Number : " + ac.getMobNumber());
		} else {
			System.out.println("Account Number Not Found...");
		}
	}

	public void displayBalance() {
		if (getValidAccountNumber() == ac.getAccNo()) {
			System.out.println("Account Balance: " + ac.getBalance());
		} else {
			System.out.println("Account Number Not Found...");
		}
	}

	public void depositAmount() {
		if (getValidAccountNumber() == ac.getAccNo()) {
			System.out.println("Amount to be deposited? ");
			double depositAmount = sc.nextDouble();// 10,000
			double currentBalance = ac.getBalance();// 20,000
			double totalAmount = currentBalance + depositAmount;// 30,000
			ac.setBalance(totalAmount);
			System.out.println("latest Balance :" + ac.getBalance());
		} else {
			System.out.println("Account Number Not Found...");
		}
	}

	@Override
	public void withdrawalAmount() {
		if (getValidAccountNumber() == ac.getAccNo()) {
			System.out.println("Amount to be Withdraw..");
			double withdrawAmount = sc.nextDouble();
			double currentBalance = ac.getBalance();// 20,000
			double totalAmount = currentBalance - withdrawAmount;// 30,000
			ac.setBalance(totalAmount);
			System.out.println("latest Balance :" + ac.getBalance());
		} else {
			System.out.println("Account Number Not Found...");
		}
	}

	@Override
	public void updateAccountDetails() {

		boolean flag = true;
		while (flag) {
			System.out.println("Enter Your Choice Update: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Your Updated Account Holder Name: ");
				ac.setName(getValidName());
				break;
			case 2:
				System.out.println("Enter Your Updated Account Holder Address: ");
				ac.setAddress(getValidAddress());
				break;
			case 3:
				System.out.println("Enter Your Updated Account Balance:");
				ac.setBalance(getBalance());
				break;
			case 4:
				System.out.println("Enter Your Updated Mobile Number: ");
				ac.setMobNumber(getValidMobileNumber());
				break;
			case 5:
				System.out.println("Your Account Details Has been Updated... ");
				flag = false;
				break;
			default:
				System.out.println("Enter Valid Choice plese...");
				break;
			}
		}
	}

	private long getValidAccountNumber() {
		System.out.println("Enter Account Number: ");
		long accNumber = sc.nextLong();
		String accNumInString = String.valueOf(accNumber);
		if (accNumInString.length() != 5) {
			System.out.println("Invalid Account Number ");
			return getValidAccountNumber();
		}
		return accNumber;
	}

	private String getValidName() {
		System.out.println("Enter Account Holder Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		if (name.length() < 3 || !Character.isUpperCase(name.charAt(0))) {
			System.out.println("Invalid Name entered, try again");
			return getValidName();
		}
		return name;
	}

	private String getValidAddress() {
		System.out.println("Enter Account Holder Address: ");
		String address = sc.next();
		return address;
	}

	private double getBalance() {
		System.out.println("Enter Account Opening Amount:");
		double balance = sc.nextDouble();
		return balance;
	}

	private String getPanNumber() {
		System.out.println("Enter Account Opening Pan Number");
		String panNumber = sc.next();
		// String PAN_PATTERN = "[a-z]{5}[0-9]{4}[A-Z]{1}";
		if (panNumber.length() != 10) {
			System.out.println("Invalid PAN");
			return getPanNumber();
		}

		return panNumber;
	}

	private long getValidMobileNumber() {
		System.out.println("Enter Account Opening Mobile Number");
		long mobNumber = sc.nextLong();
		String mobNumInString = String.valueOf(mobNumber);
		if (mobNumInString.length() != 10) {
			System.out.println("Invalid Mobile Number, Please try again...");
			return getValidMobileNumber();
		}
		return mobNumber;
	}

	private double getValidBalance() {
		System.out.println("Your Account Balance: ");
		double balance = sc.nextDouble();
		if (balance < 0) {
			System.out.println("Invalid Balance: Balance cannot be negative.");
			return getValidBalance();
		}
		return balance;
	}

}

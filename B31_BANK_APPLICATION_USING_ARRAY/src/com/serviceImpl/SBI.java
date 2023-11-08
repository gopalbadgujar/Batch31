package com.serviceImpl;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.model.Account;
import com.service.RBI;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account[] acArray = new Account[5];// 0 1 2 3 4 --null

	public void createAccount() {
		System.out.println("SBI bank is going to open an account ");
		System.out.println("How Many Accounts You Want to add:");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Account a = new Account();

			System.out.println("FILL THE FOLLOWING DATA AS REQUIRED");

			a.setName(getValidName());

			a.setAadharNo(getValidAadharNo());

			System.out.println("Account number");
			a.setAccNo(getValidAccountNumber());

			System.out.println("Account Holder Address: ");
			sc.nextLine();
			a.setAddress(sc.nextLine());

			System.out.println("Pancard number");
			a.setPanNumber(sc.next());

			System.out.println("Mobile number");
			a.setMobNumber(sc.nextLong());

			System.out.println("Initial account deposit is");
			a.setAccountBalance(sc.nextDouble());

			acArray[i] = a;
			System.out.println("Your account has been created!!");

		}
	}

	public void showAccountDetails() {
		for (Account a : acArray) {
			if (a != null) {

				System.out.println("Persons Account Number        : " + a.getAccNo());
				System.out.println("Name of person                : " + a.getName());
				System.out.println("Account Holder Aadhar number  : " + a.getAadharNo());
				System.out.println("Account Holder Address        : " + a.getAddress());
				System.out.println("Account Holder Pancard number : " + a.getPanNumber());
				System.out.println("Account Holder Mobile Number  : " + a.getMobNumber());
				System.out.println("Accounts Initial Balance      : " + a.getBalance() + " Rs.");
				System.out.println("\n");
			}
		}
	}

	public long getValidAccountNumber() {
		System.out.println("Enter Account Number: ");
		long accNo = sc.nextLong();
		String accNumber = String.valueOf(accNo);
		if (accNumber.length() != 5) {
			System.out.println("Invalid Account Number : ");
			return getValidAccountNumber();
		}
		return accNo;
	}

	@Override
	public void displayBalance() {
		System.out.println("Enter Account Number: ");
		long a1 = sc.nextLong();
		for (Account a : acArray) {
			if (a != null) {
				if (a1 == a.getAccNo()) {
					System.out.println("Your Account Balance is : ");
					System.out.println("Account Balance: " + a.getBalance());
				}
			}
		}
	}

	public String getValidName() {
		System.out.println("Enter Account Holder Name: ");
		sc.nextLine();
		String name = sc.nextLine();
//		String newName = name.replaceAll("[^A-Za-z]", name);
//		if (newName.length() == name.length()) {
//			System.out.println("Valid Account Holder Name");
//			return name;
//		} else {
//			return getValidName();
//		}
		return name;
	}

	public long getValidAadharNo() {
		System.out.println("Enter Account Holder Aadhar Number: ");
		long aadhar = sc.nextLong();
		String aadharV = String.valueOf(aadhar);

		if (aadharV.length() != 12) {
			System.out.println("Invalid Aadhar Number,  Please try Again");
			return getValidAadharNo();
		} else {
			return aadhar;
		}
	}

	public void depositMoney() {

		System.out.println("Enter account number : ");
		long a1 = sc.nextLong();
		boolean flag = false;
		for (Account a : acArray) {// 0 1 2 3* 4*
			if (a != null) {
				if (a1 == a.getAccNo()) {
					System.out.println("Enter the amount you want to deposit : ");
					// double d = sc.nextDouble();
					double td = a.getBalance() + sc.nextDouble();
					// a.setAccountBalance(td);
					a.setAccountBalance(td);
					System.out.println("Updated account balance : " + a.getBalance());
				}
			}
			if (!flag) {// true
				System.out.println("Account Number Not Found...");
			}
		}
	}

	@Override
	public void withdrawalMoney() {
		System.out.println("Enter account number : ");
		long a1 = sc.nextLong();
		boolean flag = false;
		for (Account a : acArray)// 5-- 111 null null .. ---111
			if (a != null) {//
				if (a1 == a.getAccNo()) {
					flag = true;
					System.out.println("Amount to be Withdraw..");
//				double withdrawAmount = sc.nextDouble(); //withdrawAmount
//				double currentBalance = a.getBalance();// currentBalance   // 20,000
					double totalAmount = a.getBalance() - sc.nextDouble(); // 30,000
					a.setBalance(totalAmount);
					System.out.println("latest Balance :" + a.getBalance());
				}
			}
		if (!flag) {// true
			System.out.println("Account Number Not Found...");
		}
	}

	@Override
	public void updateAccountDetails() {
		// TODO Auto-generated method stub

	}

}

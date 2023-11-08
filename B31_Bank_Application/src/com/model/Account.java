package com.model;

public class Account {

	private long accNo;
	
	private String name;
	
	private String address;
	
	private String panNumber;
	
	private long mobNumber;
	
	private double balance;

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

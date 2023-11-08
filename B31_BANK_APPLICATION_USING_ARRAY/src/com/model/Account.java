package com.model;

public class Account {

	private long accNo;

	private String name;

	private String address;

	private long aadharNo;

	private String panNo;

	private String panNumber;

	private long mobNumber;

	private double balance;

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

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

	public void setAccountBalance(double balance) {
		this.balance = balance;
	}

}

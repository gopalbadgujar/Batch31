package com.gettersandsetters;

public class Student {
	private int id;
	private String name;
	private String address;
	private long contact;
	private char grade;
	private double mark;

	public void setId(int sId) {
		id = sId;
	}
	public int getId() {
		return id;
	}

	public void setName(String sName) {
		name = sName;
	}
	public String getName() {
		return name;
	}

	public void setAddress(String sAddress) {
		address = sAddress;
	}
	public String getAddress() {
		return address;
	}

	public void setContact(long sContact) {
		contact = sContact;
	}
	public long getContact() {
		return contact;
	}

	public void setGrade(char sGrade) {
		grade = sGrade;
	}
	public char getGrade() {
		return grade;
	}

	public void setMark(double sMark) {
		mark = sMark;
	}
	public double getMark() {
		return mark;
	}

}

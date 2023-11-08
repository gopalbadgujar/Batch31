package com.settergettertostring;

public class Student {

	private int sid;
	private String sname;
	private String saddress;
	private long scontact;
	private boolean passed;
	
	public String toString() {
		String str = " Student , Id: "+sid+ " , Name: "+sname+ " , Address: "+saddress+" , Contact: "+scontact+" , &Passed: "+passed;
		return str;
	}
	
	public void setSid(int id) {
		sid = id;
	}
	public int getSid() {
		return sid;
	}
	
	public void setSname(String name) {
		sname = name;
	}
	public String getSname() {
		return sname;
	}
	
	public void setSaddress(String address) {
		saddress = address;
	}
	public String getSaddress() {
		return saddress;
	}
	
	public void setScontact(long contact) {
		scontact = contact;
	}
	public long getScontact() {
		return scontact;
	}
	
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	public boolean isPassed() {
		return passed;
	}
	
	
}

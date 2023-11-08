package com.gettersandsetters;

public class Employee {

	private int eid;
	private String ename;
	private double esallery;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEid() {
		return eid;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEname() {
		return ename;
	}
	
	public void setSallery(double esallery) {
		this.esallery = esallery;
	}
	public double getEsallery() {
		return esallery;
	}
}

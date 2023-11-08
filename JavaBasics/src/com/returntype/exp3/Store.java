package com.returntype.exp3;

public class Store {

	public Desktop getDesktopData() {
		System.out.println("-Desktop Details & Congiguration..");
		Desktop d = new Desktop();
		d.branD = "LENOVO";
		d.coloR = "BlackDiamond";
		d.price = 45000;
		d.windows = 10;
		d.storageInGb = 8;
		d.newDesk();
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println("-----Main method Started.....");
		Store str = new Store();
		Desktop s = str.getDesktopData();
		System.out.println(s.branD);
		System.out.println(s.coloR);
		System.out.println(s.price);
		System.out.println("Windows "+s.windows);
		System.out.println(s.storageInGb+"GB");
		
	}
}

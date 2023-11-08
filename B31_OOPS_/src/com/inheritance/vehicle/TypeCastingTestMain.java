package com.inheritance.vehicle;

public class TypeCastingTestMain {

	// widening & narrowing ---
	// implicit & explicit
	// upcasting & downcasting

	public static void main(String[] args) {
		int i = 10;
		long l = i;
		System.out.println(l);

		int j = (int) l;

		long l1 = 9765431456l;

		int k = (int) l1;
		System.out.println(k);

		TypeCastingTestMain main = new TypeCastingTestMain();
		Tata t1 = main.getVehicle();// Tata t1 = new NexonXz();
		System.out.println(t1.companyName);
		t1.playMusic();

		if (t1 instanceof NexonXz) {// t1=NexonXz-- false 
			NexonXz xz = (NexonXz) t1;// nexon --> nexonxz
			System.out.println(xz.modelName);
			System.out.println(xz.VariantType);
			xz.moveForward();
			xz.moveReverse();
		}
		
		if (t1 instanceof Nexon) {// t1=NexonXz-- false --  
			// it will return true if t1 has same or child class
			// false in case t1 has parent of Nexon
			Nexon xz = (Nexon) t1;// nexon --> nexonxz
			System.out.println(xz.modelName);
			xz.moveForward();
			xz.moveReverse();
		}
		// pen drive -- mobile -- laptop
		// mobile -- laptop
		// pend drive -- > Mobile
	}

	public Tata getVehicle() {// return type is present just before method name
		Tata t = new Tata();
		Nexon n = new Nexon();
		NexonXz nxz = new NexonXz();
		//return t;// returned value
		// return n;// Tata t = new Nexon();
		 return nxz;//

	}

}
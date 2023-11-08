package com.abstraction3;

public class OracleDatabase implements MyDataBase {

	@Override
	public void commit() {
		System.out.println("OracleDatabase commit");
	}

	@Override
	public void rollback() {
		System.out.println("OracleDatabase rollback");
	}

	public void m1() {
		System.out.println("OracleDatabase method");
	}

	public static void main(String[] args) {
		MyDataBase db = new OracleDatabase();  // indirect object
		db.commit();
		db.rollback();
		//db.m1();       // not access the m1 method of OracleDatabase
		
		System.out.println("----implemented class---");
		OracleDatabase db2 = new OracleDatabase();
		db2.commit();
		db2.rollback();
		db2.m1();
	}

}

package com.abstraction3;

public class MYSql implements MyDataBase {

	@Override
	public void commit() {
		System.out.println("MYSql commit");
	}

	@Override
	public void rollback() {
		System.out.println("MYSql rollback");
	}

	
	public static void main(String[] args) {
		MyDataBase database = new MYSql();
		database.commit();
		database.rollback();
	}
	
}

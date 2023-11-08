package com.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;

import com.singletondesignpattern.MyConnection;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			
			Connection connection = MyConnection.getConnection();
			String sql = "query";
			CallableStatement cs = connection.prepareCall("{call insert_employee_details(?,?,?)}");
			cs.setInt(1, 999);
			cs.setString(2, "Vijay");
			cs.setString(3, "Pune");
			cs.execute();
			
			System.out.println("Records inserted...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

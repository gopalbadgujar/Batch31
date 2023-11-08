package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecords {

	public static void main(String[] args) {
	
		
		System.out.println("---- jdbc example ----");
		try {
			// step 1 : load the driver class //
			Class.forName("com.mysql.jdbc.Driver");

			// step 2 : create the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b31", "root", "root");

			// step 3 : to build sql query
			String sql = "Delete from employee where eid = 103 and name = 'ajay'";

			// step 4 : create the statement
			Statement smt = connection.createStatement();

			// step 5 : to execute the sql
			                                // execute(); --> returns boolean , 
			                                // executeUpdate(); --> returns int ,
			                                // executeQuery(); --> returns ResultSet
			 int deletedCount = smt.executeUpdate(sql);

			// step 6 : close connection
			connection.close();
			System.out.println("Deleted Records Count : " + deletedCount);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
}

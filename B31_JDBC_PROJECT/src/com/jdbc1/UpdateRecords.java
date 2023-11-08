package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateRecords {

	public static void main(String[] args) {
		
		System.out.println("---- jdbc example ----");
		try {
			// step 1 : load the driver class //
			Class.forName("com.mysql.jdbc.Driver");

			// step 2 : create the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b31", "root", "root");

			// step 3 : to build sql query
			String sql = "update employee set address ='Mumbai' , name = 'Karan' where eid = 103 and address = 'PCMC' ";

			// step 4 : create the statement
			Statement smt = connection.createStatement();

			// step 5 : to execute the sql
			                                // execute(); --> returns boolean , 
			                                // executeUpdate(); --> returns int ,
			                                // executeQuery(); --> returns ResultSet
			 int recordsCount = smt.executeUpdate(sql);

			// step 6 : close connection
			connection.close();
			System.out.println("Updated Records Count : " + recordsCount);

		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
}

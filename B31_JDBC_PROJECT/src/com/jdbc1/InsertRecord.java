package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		
		System.out.println("---- jdbc example ----");
		try {
			// step 1 : load the driver class //
			Class.forName("com.mysql.jdbc.Driver");

			// step 2 : create the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b31", "root", "root");

			// step 3 : to build sql query
			String sql = "insert into employee values (101, 'Mohit', 'Pune'),(102, 'Aakash', 'Akurdi'),(103, 'Mayur', 'PCMC')";

			// step 4 : create the statement
			Statement smt = connection.createStatement();

			// step 5 : to execute the sql
			                                // execute(); --> returns boolean , 
			                                // executeUpdate(); --> returns int ,
			                                // executeQuery(); --> returns ResultSet
			smt.execute(sql);

			// step 6 : close connection
			connection.close();
			System.out.println("Records Inserted...");

		} catch (Exception e) {

			e.printStackTrace();

		}
		
	}
}

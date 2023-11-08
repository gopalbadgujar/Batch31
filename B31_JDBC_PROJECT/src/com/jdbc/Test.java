package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		// 6 steps
		// jdbc methods : CheckedException
		// jdbc database like classes interface : java.sql

		System.out.println("---- jdbc example ----");
		try {
			// step 1 : load the driver class //mysql
			Class.forName("com.mysql.jdbc.Driver");
			
			// step 2 : create the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b31", "root", "root");
			
			// step 3 : to build sql query
			String sql = "insert into student values(102, 'Avinash', 'pcmc')";
			
			// step 4 : create the statement
			Statement smt = connection.createStatement();
			
			// step 5 : to execute the sql
			smt.execute(sql);
			
			// step 6 : close connection
			connection.close();
			System.out.println("Success");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

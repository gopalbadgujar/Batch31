package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectRecords {

	public static void main(String[] args) {

		System.out.println("---- jdbc example ----");
		try {
			// step 1 : load the driver class //
			Class.forName("com.mysql.jdbc.Driver");

			// step 2 : create the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b31", "root", "root");

			// step 3 : to build sql query
			String sql = "select * from employee";

			// step 4 : create the statement
			Statement smt = connection.createStatement();

			// step 5 : to execute the sql
			                         // execute(); --> returns boolean ,
			                         // executeUpdate(); --> returns int ,
			                         // ex"ecuteQuery(); --> returns ResultSet
			
			ResultSet rs = smt.executeQuery(sql);

			while(rs.next()) {
				int employeeId = rs.getInt("eid");                // or      rs.getInt(1);
				String employeeName = rs.getString("name");       // or      rs.getString(2);
				String employeeAddress = rs.getString("address"); // or      rs.getString(3);
				
			System.out.println(employeeId + "   "+ employeeName+ "   "+ employeeAddress);
			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

}

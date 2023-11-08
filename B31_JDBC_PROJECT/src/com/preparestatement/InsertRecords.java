package com.preparestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import com.singletondesignpattern.MyConnection;

public class InsertRecords {

	public static void main(String[] args) {

		System.out.println("---Prepare Statement Example---");
		Scanner sc = new Scanner(System.in);
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			// Connection connection =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/b31", "root",
			// "root");
			Connection connection = MyConnection.getConnection();

			String sql = "insert into employee values(?,?,?)"; // eid, name, address
			System.out.println("Enter your Employee id :");
			int empId = sc.nextInt();
			System.out.println("Enter your Employee name :");
			String empName = sc.next();
			System.out.println("Enter your Employee address :");
			String empAddress = sc.next();
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, empId);
			ps.setString(2, empName);
			ps.setString(3, empAddress);

			//connection.close();
			System.out.println("Records inserted using ps ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

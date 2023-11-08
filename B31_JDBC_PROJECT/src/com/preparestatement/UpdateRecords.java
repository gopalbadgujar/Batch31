package com.preparestatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.singletondesignpattern.MyConnection;

public class UpdateRecords {

	public static void main(String[] args) {

		try {
			// Class.forName("com.mysql.jdbc.Driver");
			// Connection connection =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/b31", "root", "root");
			Connection connection = MyConnection.getConnection();

			String sql = "update employee set name = ? where eid = ?"; 
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Employee new name :");
			String name = sc.next();
			System.out.println("Enter Employee id whose name to update :");
			int id = sc.nextInt();
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, name);
//			ps.setString(1, sc.next()); // its getting exception inputmismatch
			ps.setInt(2, id);

			//connection.close();
			sc.close();
			System.out.println("Update Records using ps ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

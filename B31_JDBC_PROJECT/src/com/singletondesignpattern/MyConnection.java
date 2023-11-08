package com.singletondesignpattern;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	public static Connection connection = null; //lazy
	
	private MyConnection() {
		
	}
	
	public static Connection getConnection() {
		if(connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/b31", "root", "root");
				return connection;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
}

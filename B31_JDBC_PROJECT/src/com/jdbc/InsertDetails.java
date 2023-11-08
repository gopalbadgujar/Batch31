package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDetails {
//	right click on project >>> buildpath >> configure buildpath >> classpath select >> add external jars >> apply and close
	
	
//	referenced lab >> com.mysql.jdbc >> driver >>right click copy qualified name >>> remove .class
	
	
	public static void main(String[] args) {
		try {
//			1. Register driver
			Class.forName("com.mysql.jdbc.Driver");   //bridge
			
//			2. Create connection-- 6 new getI getCon fractory clone serilze
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/b31","root","root");// url username password
			
//			3. Create Query
			String sql="insert into student (id, name) values (103,'Akash');";
			
//			4. create a statement
			Statement smt=connection.createStatement();
			
//			5. execute query
			smt.execute(sql);// create , insert
			
//			6. Close connection
			connection.close();

			System.out.println("Data Inserted");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
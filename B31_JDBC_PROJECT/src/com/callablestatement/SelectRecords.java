package com.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.singletondesignpattern.MyConnection;

public class SelectRecords {

	public static void main(String[] args) {

		try {
			Connection connection = MyConnection.getConnection();
			CallableStatement cs = connection.prepareCall("{call get_employee_details()}");
			ResultSet rs = cs.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.service;

import java.util.Scanner;

import com.singletondesignpattern.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ServiceImpl implements Services {

	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {

		System.out.println("How Much Courses You Want To Add");

		int i = sc.nextInt();

		try {
			Connection connection = MyConnection.getConnection();

			String sql = "insert into Course values (?, ?)";

			PreparedStatement psmt = connection.prepareStatement(sql);

			for (int ii = 0; ii < i; ii++) {

				System.out.println("Enter Course Id :-");
				int cid = sc.nextInt();

				System.out.println("Enter Course Name :-");
				String cname = sc.next();

				psmt.setInt(1, cid);

				psmt.setString(2, cname);

				psmt.execute();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void displayCourse() {

		Connection connection;
		try {
			connection = MyConnetion.getConnections();

			String sql = "select * from Course;";

			PreparedStatement psmt = connection.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {

				System.out.println("Cid : -" + rs.getInt(1));
				System.out.println("Cname : -" + rs.getString(2));

			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@Override
	public void addFaculty() {

		System.out.println("How Much Faculty You Want To Add");

		int i = sc.nextInt();

		try {
			Connection connection = MyConnetion.getConnections();

			String sql = "insert into Faculty values (?, ?, ?)"; // fid fname cid

			PreparedStatement psmt = connection.prepareStatement(sql);

			for (int ii = 0; ii < i; ii++) {

				System.out.println("Enter Faculty Id :-");
				int fid = sc.nextInt();

				System.out.println("Enter Faculty Name :-");
				String fname = sc.next();

				psmt.setInt(1, fid);

				psmt.setString(2, fname);

				System.out.println("Choose Course For Faculty");
				displayCourse();

				int cid = sc.nextInt();
				psmt.setInt(3, cid);

				psmt.execute();

				System.out.println("ADDED FACULTY");

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	@Override
	public void displayFaculty() {

		Connection connection;
		try {
			connection = MyConnetion.getConnections();

			String sql = "select Faculty.fid,Faculty.fname,Course.cid,Course.cname from faculty inner join course on faculty.cid=course.cid;";

			PreparedStatement psmt = connection.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {

				System.out.println("Fid : -" + rs.getInt(1));
				System.out.println("Fname : -" + rs.getString(2));
				System.out.println("Cid : -" + rs.getInt(3));
				System.out.println("Cname : -" + rs.getString(4));

				System.out.println("---------------------------");

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
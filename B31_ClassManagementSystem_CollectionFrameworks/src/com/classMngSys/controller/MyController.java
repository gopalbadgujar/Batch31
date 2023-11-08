package com.classMngSys.controller;

import java.util.Scanner;

import com.classMngSys.services.ServiceIMPL;
import com.classMngSys.services.Services;

public class MyController {

	public static void main(String[] args) {

		Services obj = new ServiceIMPL();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("\n*************WELCOME TO CLASS************\n");
			System.out.println("Please Select the The Service From Following Options :\n");
			System.out.println("ENTER 1  : TO ADD COURSE DETAILS");
			System.out.println("ENTER 2  : TO DESPLY COURSE DETAILS");
			System.out.println("ENTER 3  : TO UPDATE COURSE DETAILS");
			System.out.println("ENTER 4  : TO DELETE COURSE DETAILS");
			System.out.println("ENTER 5  : TO ADD FACULTY DETAILS");
			System.out.println("ENTER 6  : TO DESPLY FACULTY DETAILS");
			System.out.println("ENTER 7  : TO UPDATE FACULTY DETAILS");
			System.out.println("ENTER 8  : TO DELETE FACULTY DETAILS");
			System.out.println("ENTER 9  : TO ADD BATCH DETAILS");
			System.out.println("ENTER 10 : TO DESPLY BATCH DETAILS");
			System.out.println("ENTER 11 : TO UPDATE BATCH DETAILS");
			System.out.println("ENTER 12 : TO DELETE BATCH DETAILS");
			System.out.println("ENTER 13 : TO ADD STUDDENT DETAILS");
			System.out.println("ENTER 14 : TO DESPLY STUDENT DETAILS");
			System.out.println("ENTER 15 : TO UPDATE STUDENT DETAILS");
			System.out.println("ENTER 16 : TO DELETE STUDENT DETAILS");
			System.out.println("ENTER 17 : TO EXIT THE APPLICATION");

			int userInput = sc.nextInt();

			switch (userInput) {

			case 1:
				obj.addCourse();
				break;

			case 2:
				obj.displayCourse();
				break;
			case 3:
				obj.updateCourse();
				break;
			
			case 4:
				obj.deleteCourse();
				break;
				
			case 5:
				obj.addFaculty();
				break;

			case 6:
				obj.displayFaculty();
				break;
			case 7:
				obj.updateFaculty();
				break;
			case 8:
				obj.deleteFaculty();
				break;

			case 9:
				obj.addBatch();
				break;

			case 10:
				obj.displayBatch();
				break;
			case 11:
				obj.updateBatch();
				break;
			case 12:
				obj.deleteBatch();
				break;

			case 13:
				obj.addStudent();
				break;

			case 14:
				obj.displayStudent();
				break;
			case 15:
				obj.updateStudent();
				break;
			case 16:
				obj.deleteStudent();
				break;

			case 17:
				System.out.println("<Thank You, Visit Again !>");
				flag = false;
				break;

			default:
				System.out.println("\nXXXXXXXX Please enter valid input XXXXXXXX\n");
			}
		}
	}
}

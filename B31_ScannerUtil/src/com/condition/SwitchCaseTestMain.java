package com.condition;

import java.util.Scanner;

public class SwitchCaseTestMain {

	public static void main(String[] args) {
		System.out.println("Main Method Started-------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month Number: ");
		int month = sc.nextInt();
		SwitchCaseTestMain main = new SwitchCaseTestMain();
		main.printMonth(month);

		System.out.println("Enter the Name: ");
		String n = sc.next();
		main.printData(n);

		System.out.println("Main Completed---");
	}

	public void printMonth(int month) {

		switch (month) {// key -- variable

		case 1: // if(month == 1)
			System.out.println("You have Selected January");
			break;
		case 2:
			System.out.println("You have Selected February");
			break;
		case 3:
			System.out.println("You have Selected March");
			break;
		case 4:
			System.out.println("You have Selected April");
			break;
		case 5:
			System.out.println("You have Selected May");
			break;
		case 6:
			System.out.println("You have Selected June");
			break;
		case 7:
			System.out.println("You have Selected July");
			break;
		case 8:
			System.out.println("You have Selected August");
			break;
		case 9:
			System.out.println("You have Selected September");
			break;
		case 10:
			System.out.println("You have Selected October");
			break;
		case 11:
			System.out.println("You have Selected November");
			break;
		case 12:
			System.out.println("You have Selected Desember");
			break;
		default:
			System.out.println("__Please Take a Correct Input__");
		}

	}

	public void printData(String name) {

		switch (name) {
		case "AAKASH":
			System.out.println(" Your full name is: Aakash_Badgujar,\n Address: Pune_Akurdi , \n Marks: 80%.");
			break;
		case "MOHIT":
			System.out.println(" Your full name is: Mohit_Pardeshi,\n Address: Jalgaon , \n Marks: 81% ");
			break;
		case "ROHIT":
			System.out.println(" Your full name is: Rohit_Pawar,\n Address: Dhule_Waghadi , Marks: 85.92% ");
			break;
		case "Mayur":
			System.out.println(" Your full name is: Mayur_Jagtap,\n Address: Wadi_Shewade , \n Marks: 86% ");
			break;
		default:
			System.out.println("Student not found ...");
			break;
		}
	}
}
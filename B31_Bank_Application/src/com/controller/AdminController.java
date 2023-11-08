package com.controller;

import java.util.Scanner;

import com.service.RBI;
import com.serviceImpl.SBI;

public class AdminController {

	public static void main(String[] args) {
		boolean flag = true;
 // ctl+shift+O
		Scanner sc = new Scanner(System.in);
		RBI rbi = new SBI();
		while (flag) {// flag
			System.out.println("-!!-*-!!!-*-!!!-*-!!!-*-!!!-*-!!--!!-*-!!!-*-!!!-*-!!!-*-!!!-*-!!-");
			System.out.println("!!                                                              !!");
			System.out.println("!!                [1]. Create Account                           !!");
			System.out.println("!!                [2]. Show Account Details                     !!");
			System.out.println("!!                [3]. Show Account Balance                     !!");
			System.out.println("!!                [4]. Deposite Money                           !!");
			System.out.println("!!                [5]. Withdrawal Money                         !!");
			System.out.println("!!                [6]. Update account Details                   !!");
			System.out.println("!!                [7]. Exit The Application                     !!");
			System.out.println("!!                                                              !!");
			System.out.println("!!!|||!|||!|||!|||!|||!|||!|||!!!!!!|||!|||!|||!|||!|||!|||!|||!!!");
			System.out.println("-!!-*-!!!-*-!!!-*-!!!-*-!!!-*-!!--!!-*-!!!-*-!!!-*-!!!-*-!!!-*-!!-");


			System.out.println("Select your Choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("User Want's to open an Account ...");
				rbi.createAccount();
				break;
			case 2:
				System.out.println("User Want's to Check Account Details...");
				rbi.displayAccountDetails();
				break;
			case 3:
				System.out.println("User Want's to check Balance ...");
				rbi.displayBalance();
				break;
			case 4:
				System.out.println("User Want's to deposit Amount ...");
				rbi.depositAmount();
				break;
			case 5:
				System.out.println("User Want's to withdraw an Amount ...");
				rbi.withdrawalAmount();
				break;
			case 6:
				System.out.println("User Want's to update an Account ...");
				System.out.println("-!!-*-!!!-*-!!!-*-!!!-*-!!!-*-!!--!!-*-!!!-*-!!!-*-!!!-*-!!!-*-!!-");
				System.out.println("!!                                                              !!");
				System.out.println("!!                [1]. UPDATE NAME :                            !!");
				System.out.println("!!                [2]. UPDATE ADDRESS :                         !!");
				System.out.println("!!                [3]. UPDATE ACCOUNT BALANCE :                 !!");
				System.out.println("!!                [4]. UPDATE MOBILE NO. :                      !!");
				System.out.println("!!                [5]. EXIT :                                   !!");
				System.out.println("!!                                                              !!");
				System.out.println("!!!|||!|||!|||!|||!|||!|||!|||!!!!!!|||!|||!|||!|||!|||!|||!|||!!!");
				System.out.println("-!!-*-!!!-*-!!!-*-!!!-*-!!!-*-!!--!!-*-!!!-*-!!!-*-!!!-*-!!!-*-!!-");

				rbi.updateAccountDetails();
				break;
				
			case 7:
				System.out.println("User Want's to Exit an Account ...");
				flag= false;
				break;

			default:
				System.out.println("Invalid Choice...");
				break;
			}
		}
	}
}
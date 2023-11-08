package com.exceptionhandling;

import java.util.Scanner;

public class TryCatchAndFinallyBlock {

	public static void main(String[] args) {

		System.out.println("---Main Method---");
            //System.exit(0);
		Scanner sc = new Scanner(System.in);
          // sc.close();
		try {
			System.out.println("-------inside try block-------");
			String s = args[1];
			System.out.println("Value of s is: "+ s);
			// sc.close(); //100%
			
		} catch (Exception e) {

			System.out.println("--catch block--");
			e.printStackTrace();
			// sc.close();//100%
		}
		finally {
			// System.exit(0);
			System.out.println("---Finally Block---");
			sc.close();
		}
	}
}

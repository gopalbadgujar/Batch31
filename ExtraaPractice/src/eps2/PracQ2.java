package eps2;

import java.util.Scanner;

public class PracQ2 {

	public static void main(String[] args) {

//Use comparison operator to find out whether a given number is grater than the user entered number or not.	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n = sc.nextInt();
		System.out.println(n>8);
		

//Use comparison operator to find out whether a given number is lesser than the user entered number or not.	
		System.out.println(n<8);
	}
}

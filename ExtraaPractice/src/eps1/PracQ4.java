package eps1;

import java.util.Scanner;

// Write a java program to detect whether a number entered by the user is integer or not.

public class PracQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-Enter the number :- ");
		
		System.out.println(sc.hasNextInt());
	}
}

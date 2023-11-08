package eps1;

import java.util.Scanner;

// Write a program to calculate CGPA using marks of three Subjects.

public class PracQ2 {

	
	public static void main(String[] args) {
		
		float physics, chemistry, mathamatics;
		double cgpa;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-Enter the Physics subject marks :- ");
		physics = sc.nextFloat();
		System.out.println("-Enter the Chemistry subject marks :- ");
		chemistry = sc.nextFloat();
		System.out.println("-Enter the Mathamatics subject marks :- ");
		mathamatics = sc.nextFloat();
		
		System.out.println("--Now the CGPA of total marks is :--");
		
		cgpa = (float)((physics + chemistry + mathamatics)/30.0f);
		System.out.println("-The CGPA is :- " + cgpa);
		
	}
}

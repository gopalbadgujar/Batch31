package eps4;

import java.util.Scanner;

public class PracQ2 {

	public static void main(String[] args) {
		
//1. Write a program to find out whether a student is pass or fail; If it requires a total of 40% 
// & at least 33% in each subject to pass. Assume 3 subjects & take marks as input from user
		
		int s1, s2, s3;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Physics marks :- ");
	s1 = sc.nextInt();
	
	System.out.println("Enter the Chemistry marks :- ");
	s2 = sc.nextInt();
	
	System.out.println("Enter the Mathematics marks :- ");
	s3 = sc.nextInt();
	
	float avg = ((s1+s2+s3)/3.0f);
	System.out.println("The Total marks of Student is : "+avg+"%");
	
	if (avg>=40 && s1>= 33 && s2>=33 &&s3>=33) {
		System.out.println("Congratulations, You have been Promoted !");
		}
	else {
		System.out.println("Sorry, You have not been Promoted !\n Please Try Again ");
		
		
	}
	
		
	}
}

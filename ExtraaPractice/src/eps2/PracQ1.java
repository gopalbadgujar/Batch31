package eps2;

import java.util.Scanner;

class PracQ1{
	
	public static void main(String[] args) {
//1. What will be the result of following expression.
		float d = 7/4.0f * 9/2.0f ;
		System.out.println(d);
		

//2. Write a java program to encrypt a grad by adding 8 to it. Decrypt it to show the correct grade		
		//Encrypt the Grade:-
		char grade = 'B';
		grade = (char) (grade+8);
		System.out.println("---->" + grade);
		
		//Decrypt the Grade :-
		grade = (char)(grade-8);
		System.out.println("---->" + grade);
		System.out.println();
		
//	Write a java program to encrypt	& decrypt the number.
		//Encrypt the number:
		System.out.println("----Enter the Number :-");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		num = (int)(num+'A');
		System.out.println("-->When number is Encrypted__:- " + num);
		
		System.out.println();
		//Decrypt the number:-
		num = (int) (num-'A');
		System.out.println("-->When number is Decrypted__:- " + num);
		
	}
	
}
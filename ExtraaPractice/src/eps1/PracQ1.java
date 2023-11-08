package eps1;

import java.util.Scanner;

public class PracQ1 {
// Write a Program, to Sum of three numbers.
	public static void main(String[] args) {

		int a, b, c, sum;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("---Enter the First number a :- ");
		a = sc.nextInt();
		
		System.out.println("---Enter the Second number b :- ");
		b = sc.nextInt();
		
		System.out.println("---Enter the Third number c :- ");
		c = sc.nextInt();
		
		sum = a + b + c ;
		System.out.println("==>The Sum of three numbers is :- " + sum );
		
	}
}

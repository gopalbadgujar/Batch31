package eps1;

import java.util.Scanner;

// Write a java program which asks the user to enter her/his name & greats.
public class PracQ3 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//name = sc.next();
		
		String name = "Aakash";
		System.out.println("Hello " + name + ", have a Good Day!");
		
// Write a java program to convert kilometers to miles.
		float km;
		float miles;
		System.out.println("-Enter the kilometers :-");
		Scanner sc = new Scanner(System.in);
		km = sc.nextFloat();
		
		miles = (float) (km/1.6);
		System.out.println(miles+" miles");
	}
}

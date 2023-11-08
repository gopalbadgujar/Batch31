package com.loops;

//Find sum of 100 to 200 positive numbers.
public class WhileSum {

	public static void main(String[] args) {
		
		int i = 100;
		int sum = 0;
		while (i<=200) {
			sum = sum + i;
			i++;
		}
		System.out.println("The Sum of 100 to 200 Positive Numbers is : "+sum);
	}
}

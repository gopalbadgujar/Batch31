package com.condition;

public class IfElseIfElseTestMain {

	public static void main(String[] args) {
		System.out.println("Main started----");

		IfElseIfElseTestMain main = new IfElseIfElseTestMain();

		main.displayGrade(90);

		System.out.println("main completed----");
	}

	public void displayGrade(int marks) {
		System.out.print("Garde is : ");
		if (marks > 90) {// 95>90, 85>90
			System.out.println(" A ");
		}else if(marks<=90 && marks>80) {// true && true--> true
			System.out.println(" B ");
		}else if(marks<=80 && marks>70) {// true && true--> true
			System.out.println(" C ");
		}else if(marks<=70 && marks>40) {// true && true--> true
			System.out.println(" Pass class ");
		}else {
			System.out.println("You are in fail class");
		}
		
		// && And 
				//1 1 --> true true --> 1
				//1 0 --> 0
				//0 1 -->0
				//0 0 -->0
		// || Or
		
		// 1 0 ---> 1
		// 0 1 --> 1
		// 1 1  --> 1
		// 0  0 --> 0
		
		
		
		
		
	}

}
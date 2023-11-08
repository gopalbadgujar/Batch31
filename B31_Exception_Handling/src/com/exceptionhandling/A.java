package com.exceptionhandling;

public class A {

	private A() {
	}

	public static int m() {

		try {
			int i = 10 / 0;
			return 11;

		} catch (Exception e) {
			// TODO: handle exception
			return 22;
		} finally { // finally block always executes
//			return 33;
		}
	}

//	static void show() { 
//
//		 try { System.out.println("inside TRY"); 
//		 return; 
//		 
//		} catch (Exception e) {
//		System.out.println("inside Catch");
//		}
//		}

	static void show() {
		try {
			System.out.println("inside TRY");
			return;

		} finally {
			System.out.println("inside FINALLY");
		}

	}

	public static void main(String[] args) {
		System.out.println(m());

		show();

		try {
			int result = 10 / 0;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("General Exception");
		}

		try {
			int[] arr = new int[5];
			arr[10] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bounds");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out of Bounds");
		}

//		 try { 
//			  int result = 10 / 0; 
//			 System.out.println("Result: " + result);
//			 } catch (Exception e) {
//			 System.out.println("Exception caught"); 
//			 } catch (ArithmeticException e){
//			 System.out.println("Arithmetic Exception caught");
//			 }
		System.out.println("---------------------");
		try {
			int ary[] = { 10, 20, 30 };
			int tempt = ary[4];

		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());

		} catch (Exception e2) {
			System.out.println("Some exception");

		}
	}

}
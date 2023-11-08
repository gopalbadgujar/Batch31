package com.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExample {

	// text.txt ->>> line code

	public static void readFile()
			throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException, NullPointerException {

		File file = new File("text.txt");
		
		FileInputStream in = new FileInputStream(file);
		System.out.println(in.available());
		System.out.println(in.read());
		//100
		//vikas
		
	}
	
	public static void main(String[] args) {
	
		try {
			readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}













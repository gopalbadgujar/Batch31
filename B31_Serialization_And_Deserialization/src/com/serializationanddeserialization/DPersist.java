package com.serializationanddeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DPersist {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		FileInputStream fin= new FileInputStream("output.txt");
		
		ObjectInputStream in = new ObjectInputStream(fin);
		
		Employee e = (Employee)in.readObject();   //object--> return type
		
		Employee e2 = (Employee)in.readObject();


		System.out.println(e.id+ "  "+ e.name+"  "+e.address+"  "+e.salary);
		System.out.println(e2.id+ "  "+ e2.name+"  "+e2.address+"  "+e2.salary);
		
		in.close();
		
		
		
	}

}

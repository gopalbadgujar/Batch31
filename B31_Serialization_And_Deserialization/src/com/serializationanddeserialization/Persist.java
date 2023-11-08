package com.serializationanddeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {
	
	public static void main(String[] args) throws IOException {
		
		Employee e = new Employee(101, "abc", "pune", 50000.0);
		
		Employee e1 = new Employee(102, "efg", "mumbai", 55000.0);
		
		FileOutputStream fout = new FileOutputStream("output.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(e);
		out.writeObject(e1);
		
		out.close();
		
		System.out.println("SUCCESS");
		
		System.out.println(e.id+ "  "+ e.name+"  "+e.address+"  "+e.salary);
		System.out.println(e1.id+ "  "+ e1.name+"  "+e1.address+"  "+e1.salary);

		
	}

}

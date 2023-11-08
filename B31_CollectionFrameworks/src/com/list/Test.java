package com.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		              //index 
		al.add("abc");// 0
		al.add("xyz");// 1
		al.add("pqr");// 2
		al.add("yyy");// 3

		System.out.println(al);

		System.out.println("--using iterator interface---");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext())// boolean true
		{
			String s = itr.next();
			System.out.println(s);
		}

		//jdk 1.7 
		System.out.println("----for each loop-----");

		for (String s1 : al) {
			System.out.println(s1);
		}
		
		
		List<Integer> al2 = new ArrayList<>();
		
		al2.add(67);
		al2.add(66);
		al2.add(90);
		
		for( Integer i : al2)
		{
			System.out.println(i);
		}
		
		

	}

}
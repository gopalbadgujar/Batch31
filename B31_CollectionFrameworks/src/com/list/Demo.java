package com.list;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		// List : Interface
		// AL  ,  LL  ,  Vector  : classes
		
		List al = new ArrayList();
		
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(101);
		al.add(null);
		al.add(null);
		al.add("abc");
		al.add(10.12);
		al.add('c');
		
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.get(3));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(103));
		al.remove(3);
		System.out.println(al);
		
		
		
	}
	
}

package com.failfastandfailsafe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		al.add(105);
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			/// al.add(77);
			Integer i = itr.next();
			System.out.println(i);
		}
		System.out.println(al);

//		jdk 1.5 
//		CopyOnWriteArrayList<E>
//		CopyOnWriteArraySet<E>
//		ConcurrentHashMap<K, V>
		ConcurrentHashMap<Integer, String> al2 = new ConcurrentHashMap<Integer, String>();
		
	}
}

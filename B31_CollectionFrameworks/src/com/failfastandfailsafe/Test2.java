package com.failfastandfailsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class Test2 {

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
		CopyOnWriteArraySet<Integer> al2 = new CopyOnWriteArraySet<>();
		al2.add(90);
		al2.add(100);
		al2.add(60);
		System.out.println("al2:" + al2);
		Iterator<Integer> itr2 = al2.iterator();
		while (itr2.hasNext()) {
			al2.add(10);
			Integer i2 = itr2.next();
			System.out.println(i2);
		}
		System.out.println(al2);  // duplicates not allowed.
	}
}

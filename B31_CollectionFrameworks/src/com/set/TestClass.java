package com.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class TestClass {
	public static void main(String[] args) {
		
		//HashSet
		/* 
		 * 1.Null value print at only once.
		 * 2. Avoid duplicate value in primitive data types, print at only once.
		 * 3. by helping hashCode & equals methods avoid duplicate value.
		 * 4. Executed Randomly
		 */
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(30);
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(10));
		set.remove(10);
		// System.out.println(set);
		
		List<Integer> al2 = new ArrayList<>();
		al2.add(201);
		al2.add(201);
		Set<Integer> set2 = new HashSet<>(al2);
		
		
		System.out.println("---using iterator---");
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}

		System.out.println("---for each loop---");
		for (Integer i : set) {
			System.out.println(i);
		}

	}

}
package com.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTypes {

	public static void main(String[] args) {

		// LinkedHashSet
		/*
		 * 1. Null value print at only once. 
		 * 2. Avoid duplicate values, print at only once.
		 * 3. Executed by Index Order 
		 */
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.add(201);
		set.add(502);
		set.add(203);
		set.add(201);
		set.add(601);
		set.add(201);
		set.add(null);
		set.add(null);

		System.out.println();
		System.out.println(set);

		// TreeSet
		/*
		 * 1. No Null value print. 
		 * 2. Avoid duplicate values, print at only once.
		 * 3. Executed by Sorting order (Smaller to Larger).
		 */
		Set<Integer> set1 = new TreeSet<Integer>();
		set1.add(55);
		set1.add(5);
		set1.add(2);
		set1.add(55);
		set1.add(100);
		set1.add(60);
		// set1.add(null);
		try { // handle exception
			set1.add(null);
		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println("NullPointer Exception:" + e);
		}

		System.out.println(set1);

	}

}

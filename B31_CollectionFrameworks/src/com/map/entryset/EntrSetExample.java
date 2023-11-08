package com.map.entryset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EntrSetExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Santosh");
		map.put(102, "Amol");
		map.put(103, "Sahil");
		map.put(104, "Vijay");
		map.put(105, "Vikas");
		System.out.println(map);

		// keySet() - list of keys
		// entrySet() - list of keys and values

		Set<Map.Entry<Integer, String>> set1 = map.entrySet();
		System.out.println("=====For Each Loop=====");
		Iterator<Map.Entry<Integer, String>> itr1 = set1.iterator();
		while (itr1.hasNext()) {
			Map.Entry<Integer, String> entries = itr1.next();
			// System.out.println(entries); // returns keys and values
			System.out.println(entries.getKey() + "  " + entries.getValue());
		}

		System.out.println("=====For Each Loop=====");
		for (Map.Entry<Integer, String> entries : set1) {
			// System.out.println(entries); // returns keys and values
			System.out.println(entries.getKey() + "  " + entries.getValue());
		}
	}
}

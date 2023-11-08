package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("abc", 10);
		map.put("pqr", 20);
		map.put("xyz", 30);
		map.put("hhh", 40);
		map.put("jjj", 55);
		map.put("kkk", 50);

		System.out.println(map);

		// keySet(): list of keys Set
		// entrySet(): list of keys and values Set<Map.Entry>
		// values(); : list of values

		Set<String> set = map.keySet();
		System.out.println(set);
		System.out.println("---using iterator----");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " " + map.get(key));
		}

		System.out.println("---for each loop---");
		for (String k : set) {
			System.out.println(k + " " + map.get(k));
		}

		System.out.println("----------LINKEDHASHMAP-----------");

		Map<Integer, Character> map2 = new LinkedHashMap<>();
		map2.put(20, 'A');
		map2.put(100, 'Z');
		map2.put(77, 'B');
		map2.put(55, 'H');
		map2.put(null, 'P');

		System.out.println(map2);

		System.out.println("-----------TREEMAP-----------");

		Map<Integer, Character> map3 = new TreeMap<>();
		map3.put(20, 'A');
		map3.put(100, 'Z');
		map3.put(77, 'B');
		map3.put(55, 'H');
		map2.put(null, 'P');

		System.out.println(map3);// ASC SORT
	}

}
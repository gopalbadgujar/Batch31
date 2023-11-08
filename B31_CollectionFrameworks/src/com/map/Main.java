package com.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		// HashMap:
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 101);
		map.put(2, 102);
		map.put(3, 103);
		map.put(4, 104);
		map.put(5, 105);
		map.put(5, 106);
		// One Null key
		// Multiple Null Values
		map.put(null, 104);
		map.put(6, null);
		map.put(7, null);
		// map.put(1, null);

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue(3));
		System.out.println(map.containsValue(104));

		System.out.println(map.get(3));

	}

}

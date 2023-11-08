package com.map.practice;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PracLinkedHashMap {

	public static void main(String[] args) {
		
		System.out.println("----------LINKEDHASHMAP-----------\n");

		Map<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();
		map2.put('A', 101);
		map2.put('B', 102);
		map2.put('B', 103);
		map2.put(null, 104);
		
		//map2.notifyAll();

		System.out.println(map2);
		int size= map2.size();
		System.out.println(size);
		
		System.out.println(map2.containsKey(5) + " " + map2.get(5));// no present so give false & null
		System.out.println(map2.containsValue(4)); //  no present
		System.out.println(map2.getOrDefault('E', 404));
		System.out.println(map2);
		System.out.println(map2.hashCode()); // returns HashCode

		System.out.println(map2.putIfAbsent('E', 505));
		System.out.println(map2); // key - E
		System.out.println(map2.size());// 4

		System.out.println(map2.remove(1)); // key 1 not present 
		System.out.println(map2.remove(2, "Emp2")); // key & Value Not present 
		System.out.println(map2);
		System.out.println(map2.size());

		System.out.println(map2.replace('C', 909));
		System.out.println(map2.replace('A', 101, 10110 ));
		System.out.println(map2);
		System.out.println(map2.size()); // 10

		System.out.println(map2.toString());// {null=__, 2=Emp2, 3=EMPOYEEE2, 4=EMPLOYEE4, 5=Emp5, 6=Emp6, 7=Emp7,
											// 8=Emp8, 9=Emp5, 10=Emp10}
		System.out.println(map2.getClass());// class java.util.HashMap

		
		System.out.println("\n");
		System.out.println("------Using Iterator------");
		//Set<Character> set= map2.keySet();
		//Set<Character, Integer> set = map2.entrySet();
		
	}
}

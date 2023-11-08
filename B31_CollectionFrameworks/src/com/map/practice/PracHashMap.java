package com.map.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PracHashMap {

	public static void main(String[] args) {
		System.out.println("----------HASHMAP-----------\n");

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Emp1");
		map.put(2, "Emp2");
		map.put(3, "Emp3");
		map.put(4, "Emp4");
		map.put(5, "Emp5");
		map.put(6, "Emp6");
		map.put(7, "Emp7");
		map.put(8, "Emp8");
		map.put(null, "__");
		map.put(9, "Emp1");
		map.put(9, "Emp");
		map.clear();  // clear all data
		System.out.println(map);

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Emp1");
		map1.put(2, "Emp2");
		map1.put(3, "Emp3");
		map1.put(4, "Emp4");
		map1.put(5, "Emp5");
		map1.put(6, "Emp6");
		map1.put(7, "Emp7");
		map1.put(8, "Emp8");
		map1.put(null, "__");
		map1.put(9, "Emp1");
		map1.put(9, "Emp5");

		System.out.println(map1);
		System.out.println(map1.size());
		System.out.println(map1.containsKey(5) + " " + map1.get(5));
		System.out.println(map1.containsValue(4));
		System.out.println("Equals method of Compare two Objects:  "+map1.equals(map)); // returns -> true or false
		System.out.println(map1.getOrDefault(map1, "ghftfdhsjvcsvc"));
		System.out.println(map1.hashCode()); // returns HashCode

		System.out.println(map1.putIfAbsent(10, "Emp10"));
		System.out.println(map1);
		System.out.println(map1.size());

		System.out.println(map1.remove(1)); // key
		System.out.println(map1.remove(2, "Emp2")); // key & Value
		System.out.println(map1);
		System.out.println(map1.size()); //9
		System.out.println(map1.put(2, "Emp2"));// newly put/add

		System.out.println(map1.replace(3, "EMPOYEEE2"));
		System.out.println(map1.replace(4, "Emp4", "EMPLOYEE4"));
		System.out.println(map1);
		System.out.println(map1.size()); // 10

		System.out.println(map1.toString());// {null=__, 2=Emp2, 3=EMPOYEEE2, 4=EMPLOYEE4, 5=Emp5, 6=Emp6, 7=Emp7,
											// 8=Emp8, 9=Emp5, 10=Emp10}
		System.out.println(map1.getClass());// class java.util.HashMap

		System.out.println();
		System.out.println("--------Using Iterator-----------");
		Set<Integer> set = map1.keySet();
		System.out.println(set);
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer empD = itr.next();
			System.out.println(empD + " = " + map1.get(empD));
		}

		System.out.println();
		System.out.println("--------Using ForEach Loop----------");
		for (Integer i : set) {
			System.out.println(i + " = " + map1.get(i));
		}

	}

}

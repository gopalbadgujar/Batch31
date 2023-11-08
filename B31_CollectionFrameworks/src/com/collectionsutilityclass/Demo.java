package com.collectionsutilityclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
//		a1.add(null);// null pointer exception
		Collections.addAll(a1, "Amol", "Vikas", "Vijay", "Sourav");
		System.out.println(a1);

		Collections.sort(a1); // primitive data type
		System.out.println(a1);

		Collections.reverse(a1);
		System.out.println(a1);

		Collections.shuffle(a1);
		System.out.println(a1);

//		Collections.max(null);
//		Collections.min(null);
//
//		a1 = Collections.unmodifiableList(a1);
//		//a1.add("kkk"); // unsupportedexception
//		
//		Collections.unmodifiableMap(null);
//		Collections.unmodifiableSet(null);
//		
//		Collections.synchronizedList(a1);
//		System.out.println(a1);
//		Collections.synchronizedMap(null);
//		Collections.synchronizedSet(null);
	}
}

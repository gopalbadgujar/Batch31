package com.list;

import java.util.ArrayList;

public class NEW {

	 
	
	public static void main(String[] args) {
		System.out.println("--------------------------");
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		System.out.println(colors.get(1));
		
		
		System.out.println("--------------------------");
		ArrayList<String> listA = new ArrayList<>();
		listA.add("A");
		listA.add("B");
		ArrayList<String> listB = new ArrayList<>(listA);
		listB.add("C");

		System.out.println(listA.size() + " " + listB.size());

		
		
		System.out.println("--------------------------");
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		for (int num : numbers) {
		    numbers.remove(num);
		}
		System.out.println(numbers.size());
		
		System.out.println("--------------------------");

	}
}

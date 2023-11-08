package com.map.practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Country {

	public Map<String, List<String>> addCountry() {

		List<String> maharashtra = new ArrayList<>();
		maharashtra.add("pune");
		maharashtra.add("Nagpur");
		maharashtra.add("mumbai");

		List<String> gujarat = new ArrayList<>();
		gujarat.add("Surat");
		gujarat.add("vapi");
		gujarat.add("Gandhinagar");

		Map<String, List<String>> india = new HashMap<>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("GUJARAT", gujarat);
		return india;
	}

	public static void main(String[] args) {

		Country country = new Country();
		Map<String, List<String>> india = country.addCountry();
		System.out.println(india);
		// keySet();
		Set<String> sets = india.keySet();
		System.out.println(sets);//
		Iterator<String> itr = sets.iterator();
		while (itr.hasNext()) {
			String stateName = itr.next();
			System.out.println(stateName);
			List<String> citiesList = india.get(stateName);
			// System.out.println(citiesList);
			Iterator<String> itr2 = citiesList.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
			}
		}

//		System.out.println("-------for each loop--------");
//		for (String stateNames : sets) {
//			System.out.println(stateNames);
//			List<String> stateList = india.get(stateNames);
//			for (String citiesName : stateList) {
//				System.out.println(citiesName);
//			}
//		}
//
	}

}
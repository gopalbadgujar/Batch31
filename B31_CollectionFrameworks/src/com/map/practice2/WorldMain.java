package com.map.practice2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WorldMain {

	public static void main(String[] args) {

		World w = new World();
		Map<String, Map<String, List<String>>> world = w.addCountry();
		// System.out.println(world);

		// keySet
		Set<String> set1 = world.keySet();
		// System.out.println(set1);


		// by using iterator
		System.out.println("---Using Iterator---");

		Iterator<String> itr1 = set1.iterator();
		while (itr1.hasNext()) {
			String country = itr1.next();
			System.out.println(country);
			// get method
			Map<String, List<String>> cities = world.get(country);
			// System.out.println(cities);

			// key set double
			Set<String> set2 = cities.keySet();
			// System.out.println(set2);

			// by using Iterator
			Iterator<String> itr2 = set2.iterator();
			while (itr2.hasNext()) {
				String country1 = itr2.next();
				System.out.println(country1);

				// get
				List<String> cityList = cities.get(country1);
				// System.out.println(cityList);
				// Again Iterator
				Iterator<String> itr3 = cityList.iterator();
				while (itr3.hasNext()) {
					String city = itr3.next();
					System.out.println(city);
				}
			}
		}

		System.out.println();
		System.out.println("---Using For Each Loop---");

		for (String country : set1) {
			System.out.println(country);
			Map<String, List<String>> clist = world.get(country);
			// System.out.println(clist);
			Set<String> set2 = clist.keySet();
			for (String state : set2) {
				System.out.println(state);
				List<String> slist = clist.get(state);
				// System.out.println(slist);
				for (String city : slist) {
					System.out.println(city);
				}
			}

		}
	}

}

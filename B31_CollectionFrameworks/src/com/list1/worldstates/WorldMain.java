package com.list1.worldstates;

import java.util.Iterator;
import java.util.List;

public class WorldMain {

	public static void main(String[] args) {

		World w = new World();
		List<List<List<String>>> world = w.addCountry();

		for (List<List<String>> w1 : world) {
			System.out.println(w1);

			for (List<String> state : w1) {
				System.out.println(state);

				for (String dest : state) {
					System.out.println(dest);
				}

			}

		}

		System.out.println("\n");
		Iterator<List<List<String>>> itr = world.iterator();
		while (itr.hasNext()) {
			List<List<String>> country = itr.next();

			Iterator<List<String>> itr2 = country.iterator();
			while (itr2.hasNext()) {
				List<String> state = itr2.next();

				Iterator<String> itr3 = state.iterator();
				while (itr3.hasNext()) {
					String city = itr3.next();
					System.out.println(city);
				}

			}

		}
	}
}

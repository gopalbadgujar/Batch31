package com.list1.worldstates;

import java.util.ArrayList;
import java.util.List;

public class World {

	public List<List<List<String>>> addCountry() {
		
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Nagpur");
		maharashtra.add("Pune");
//		maharashtra.add("Mumbai");
//		maharashtra.add("Nashik");
//		maharashtra.add("Dhule");
//		maharashtra.add("Ahmednagar");
//		maharashtra.add("Akola");
//		maharashtra.add("Amravati");

		List<String> gujarat = new ArrayList<String>();
		gujarat.add("Surat");
		gujarat.add("Vapi");
//		gujarat.add("Gandhinagar");
//		gujarat.add("Kachchh");
//		gujarat.add("Jamnagar");
//		gujarat.add("Rajkot");
//		gujarat.add("Ahmedabad");
		
		List<String> punjab = new ArrayList<String>();
		punjab.add("Amritsar");
		punjab.add("Jalandhar");
//		punjab.add("Kapurthala");
//		punjab.add("Ludhiana");
//		punjab.add("Bathinda");
//		punjab.add("Patiala");
		
		List<List<String>> India = new ArrayList<List<String>>();
		India.add(maharashtra);
		India.add(gujarat);
		India.add(punjab);

		
		List<String> california = new ArrayList<String>();
		california.add("Alameda");
		california.add("Alpine");
//		california.add("Amador");
//		california.add("Butte");

		List<String> texas = new ArrayList<String>();
		texas.add("Anderson");
		texas.add("Andrews");
//		texas.add("Austin");

		List<String> florida = new ArrayList<String>();
		florida.add("Sarasota");
		florida.add("Seminole");
//		florida.add("Marion");
		
		List<List<String>> USA = new ArrayList<List<String>>();
		USA.add(california);
		USA.add(texas);
		USA.add(florida);
		
		List<List<List<String>>> world = new ArrayList<List<List<String>>>();
		world.add(USA);
		world.add(India);
		return world;

	}
}


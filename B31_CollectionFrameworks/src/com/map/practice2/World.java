package com.map.practice2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class World {

	public Map<String, Map<String, List<String>>> addCountry(){
		
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("nagpur");
		maharashtra.add("mumbai");
		
		List<String> gujarat = new ArrayList<String>();
		gujarat.add("surat");
		gujarat.add("vapi");
		gujarat.add("gandhinagar");
		
		Map<String, List<String>> India=new HashMap<String, List<String>>();
		India.put("1. MAHARASHTRA", maharashtra);
		India.put("2. GUJARAT", gujarat);
		
		List<String> california = new ArrayList<String>();
		california.add("Alameda");
		california.add("Alpine");
		california.add("Amador");

		List<String> texas = new ArrayList<String>();
		texas.add("Anderson");
		texas.add("Andrews");
		texas.add("Austin");
		
		Map<String, List<String>> usa = new HashMap<String, List<String>>();
		usa.put("1. CALIFORNIA", california);
		usa.put("2. TEXAS", texas);
		
		Map<String, Map<String, List<String>>> World = new HashMap<String, Map<String,List<String>>>();
		World.put("INDIA", India);
		World.put("USA", usa);
		
		return World;



	}
}

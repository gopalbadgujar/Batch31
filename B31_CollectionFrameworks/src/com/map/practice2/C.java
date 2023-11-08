package com.map.practice2;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;

import java.util.*; 

public class C {
	
	public static void main(String[] args) {
		List<String> maharashtra = new ArrayList<String>();
		maharashtra.add("Pune");
		maharashtra.add("Mumbai");
		maharashtra.add("Nashik");

		List<String> gujarat = new ArrayList<String>();
		gujarat.add("Surat");
		gujarat.add("Gandhinagar");
		gujarat.add("Ahmedabad");

		// India Map
		Map<String, List<String>> india = new HashMap<String, List<String>>();
		india.put("MAHARASHTRA", maharashtra);
		india.put("GUJARAT", gujarat);
		
		List<String> california = new ArrayList<String>();
		california.add("Los Angeles");
		california.add("San Francisco");
		california.add("San Deigo");

		List<String> washington = new ArrayList<String>();
		washington.add("Seattle");
		washington.add("Olympia");
		washington.add("Bellingham");
		
		//usa map
		Map<String, List<String>> usa = new HashMap<String, List<String>>();

		usa.put("CALIFORNIA", california);
		usa.put("WASHINGTON", washington);
		
		Map<String, Map<String, List<String>>> worldMap=new HashMap<String, Map<String,List<String>>>();
		//key = String    value = Map<String, List<String>>
//		                             key=String  value=List<String>
//		                                                    String
		worldMap.put("India", india);
		worldMap.put("USA", usa);
		
		Set<String> countrySet=worldMap.keySet();
//		Iterator<String> itr=countrySet.iterator();
//		
//		while(itr.hasNext()) {
//			String country=itr.next();
//			System.out.println("Country : "+country+"\n");
//			Map<String, List<String>> countryMap=worldMap.get(country);
//			
//			Set<String> stateSet=countryMap.keySet();
//			Iterator<String> itr2=stateSet.iterator();
//			
//			while(itr2.hasNext()) {
//				String state=itr2.next();
//				System.out.println("State : "+state+"\n");
//				List<String> cityList=countryMap.get(state);
//				Iterator<String> itr3=cityList.iterator();
//				while(itr3.hasNext()) {
//					System.out.println("City : "+itr3.next());
//				}
//			}
//			System.out.println("-----------------------------------------\n");
//		}
		
		System.out.println("----By Using For Each Loop----");
		for(String country:countrySet) {
			System.out.println("*****************************************\n");
			System.out.println(country);
			Map<String, List<String>> countryMap=worldMap.get(country);
			Set<String> stateSet=countryMap.keySet();
			for(String state:stateSet) {
				System.out.println();
				System.out.println("State : "+state);
				 List<String> cityList=countryMap.get(state);
				 for(String city:cityList) {
					 System.out.println(city);
				 }
			}
			
		}
		
		
	}

}
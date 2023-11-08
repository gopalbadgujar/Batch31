package com.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {
	
	public static void main(String[] args) {
		
//Array -- Homegenous byte i[] -128 to 127 faster Fixed size-8 Don't have any predefined,we can Array of pm datatypes
		
//collection -- Hetrogenous slower growable(75%)-20 have any predefined methods , Objects
		
//Iterabal(Iterator) >> Collection(I) >> List(I) >> ArrayList() -- LinkedList()
		
// List -- Insertion order preserve , Multiple null allowed , Duplicated Allowed , we can get data by index
		
//ArrayList -- Growabale Array , LoadFactor -75% , initial Size = 10
		
//LinkedList -- 
		
		List<Integer> list= new ArrayList<Integer>();
		int i2=45;
		list.add(123);
		list.add(null);
		list.add(123);
		list.add(i2);
		
//		List list1= new ArrayList<Integer>();
//		list1.add(123);
//		list1.add(null);
//		list1.add(123);
//		list1.add("Aakash");
//		
//		for(Object l1:list1) {
//			System.out.println(l1);
//		}
		
			
		int i=list.size();
		System.out.println(i);
		
		Iterator<Integer> itr=list.iterator();
		
		while(itr.hasNext()) {//boolean
			Integer i1=itr.next();
			System.out.println();
		}
		
		for(Integer it:list) {
			System.out.println(it);
		}
		
		
		
		
	}

}
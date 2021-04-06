package com.arrays;

import java.util.HashMap;
import java.util.LinkedList;

public class LinkedList_java {

	public static void main(String[] args) {
		
		LinkedList<String > MylikedList = new LinkedList<String> ();
		
		
		MylikedList.add("Bmw");
		MylikedList.add("Corrolla");
		MylikedList.add("jeep");
		MylikedList.addFirst("Tonis car");
		MylikedList.addLast("toyota");
		MylikedList.remove("Bmw");
	
		System.out.println(MylikedList.getFirst());
		System.out.println(MylikedList.getLast());
		
		System.out.println("===============================");
		
		
		HashMap<String, String > CapitalCities = new HashMap<String, String>();
		
		
		CapitalCities.put("Iran", "Tehran");
		CapitalCities.put("Aemrica", "Washington");
		CapitalCities.put("Afghanistan", "Kabul");
		System.out.println(CapitalCities);
//		
//		System.out.println(CapitalCities.get("Afghanistan "));
//		System.out.println(CapitalCities.get("Aemrica"));
//		System.out.println(CapitalCities.remove("Iran"));
		
		for(String i : CapitalCities.keySet()) {
		System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}

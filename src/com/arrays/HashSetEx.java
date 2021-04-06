package com.arrays;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		
		HashSet<String > cars = new HashSet<String>();
//		see how ever here mentioned two times Bmw but print only one time.
		cars.add("BMW");
		cars.add("Toyouta");
		cars.add("tonis");
		cars.add("corrolla");
		cars.add("BMW");
		cars.remove("tonis");
//		cars.clear();
		
		
		System.out.println(cars);
		System.out.println(cars.contains("tonis"));
		System.out.println(cars.contains("truck"));
		System.out.println(cars);
		System.out.println(cars.size());
	
		for (String i :cars) {
			System.out.println(i);
		}
	
		
		
		
		
	}

}

package com.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {

	public static void main(String[] args) {
	
	
		ArrayList<String > cars = new ArrayList<String>();
		
		cars.add("bmw");
		cars.add("toyota");
		cars.add("corrolla");
	
		System.out.println(cars);
		 Collections.sort(cars);
	for (int i = 0 ; i < cars.size(); i ++) {
		System.out.println(cars.get(i));
	}
		
	
System.out.println("===================================");

ArrayList<Integer > myNumbers = new ArrayList <Integer>();
	
	
myNumbers.add(20);
myNumbers.add(30);
myNumbers.add(50);
	for (int i : myNumbers)
	System.out.println(i);

	
	
	
	
	
	
	
	

	}

}

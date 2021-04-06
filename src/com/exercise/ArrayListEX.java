package com.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEX {

	public static void main(String[] args) {
	
		
		ArrayList<String > LosticsNames = new ArrayList<String> ();

		LosticsNames.add("Ahmad");
		LosticsNames.add("Reshad");
		LosticsNames.add("Farzad");
		
//		print by iterator traversing.
		Iterator Logistics = LosticsNames.iterator();
		
		
		while (Logistics.hasNext()) {
			System.out.println(Logistics.next());
		}
System.out.println("==============================");
//		print by for 
		
	for (int s =0; s < LosticsNames.size(); s ++) {
		System.out.println(LosticsNames.get(s));
	}
		
//		print by for each loop.
	
	System.out.println("==========================");
	
	for (String a : LosticsNames) {
		System.out.println(a);
	}
		

//	print it by for each methods.
	
System.out.println("========================");
	
	
LosticsNames.forEach(Log ->{
	System.out.println(Log);
});
	
	
//   reverse the data.

Collections.reverse(LosticsNames);

System.out.println(LosticsNames);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

package com.Collections;

import java.util.ArrayList;

public class LogistcsDetails {

	public static void main(String[] args) {
	
		
		Losgistics A1= new Losgistics(20, "ramesh", "akbary", 30)	;
		Losgistics A2 = new Losgistics(30, "ramin", "azimi", 10)	;
		Losgistics A3 = new Losgistics(20, "minis", "fatah", 34)	;
		Losgistics A4 = new Losgistics(20, "jawaid", "tanha", 50)	;
		
//		we need to create a list
		
ArrayList<Losgistics>	allLogs	 = new ArrayList<Losgistics>();
		
		
allLogs.add(A1);
allLogs.add(A2);
allLogs.add(A3);
allLogs.add(A4);
		
	
		
		
		for (Losgistics s : allLogs) {
//			System.out.println(s.id);
//			System.out.println(s.firstname);
//			System.out.println(s.lastname);
//			System.out.println(s.age);
//			
//			System.out.println("===================================");
			
//			all of them at the same time should print.
//			System.out.println( "-" + s.id + " - "+ s.firstname + " , "+ s.lastname + "  - "+s.age );
			
			System.out.println(s);
		}
		
		
		
		

	}

}

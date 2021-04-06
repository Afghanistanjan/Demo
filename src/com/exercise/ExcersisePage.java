package com.exercise;

import java.util.ArrayList;
import java.util.Hashtable;

public class ExcersisePage {
	private static final String Iterator names  = null;

	public static void main(String[] args) {
		
//		
//int ListNum [] = new int [4];
//ListNum [0] = 20;
//ListNum [1] = 30;
//ListNum [2] = 50;	
//ListNum [3] = 100;	
//	
//for (int i = 0; i <ListNum.length; i ++){
//	
//	System.out.println(ListNum[i]);
//	
//	
//}
//
//System.out.println("===================================");
//
//
//int Asheet [][] = { {3,4,4,4}, {3, 5, 7, 9}, {23, 45, 20, 11}};
//
//for (int i = 0; i < Asheet.length; i++) {
//	for (int j =0; j < Asheet[i].length; j++) {
//		System.out.println(Asheet [i][j]);
//	}
//}
//
//
//Hashtable<Integer, String> myList = new Hashtable<Integer, String>();
//
//
//myList.put(20, "Ramein");
//myList.put(23, "monis");
//myList.put(40, "Jawaid");
//myList.remove(20, "Ramein");	
//System.out.println(myList);
//System.out.println(myList.get(23));



ArrayList<String > LosticsNames = new ArrayList<String> ();

LosticsNames.add("Ahmad");
LosticsNames.add("Reshad");
LosticsNames.add("Farzad");
Iterator Logistics = LosticsNames.iterator();

while (Logistics.hasNext()) {
	System.out.println(Logistics.hashCode());
}


	}
}

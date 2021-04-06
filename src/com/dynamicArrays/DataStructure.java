package com.dynamicArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Vector;

import com.sun.java.swing.action.NewAction;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class DataStructure {

	public static void main(String[] args) {
		
		
//   how to add, remove print, replace the data in dynamic collection data.	
		
		
//	employees names list.
//		array list.
//		first need to create object of array list class.
		
//		this is the originla object and according the original object create dynamic object.
		
	ArrayList<String > employeesList = new ArrayList<String >();	
	employeesList.add("Ramesh");
	employeesList.add("Ramin");
	employeesList.add("Ahmad");
	employeesList.add("jawid");
	
	employeesList.add(0, "hedayat");
	System.out.println(employeesList);
	
System.out.println("Ramin");



ArrayList<String > ShopkeeperLIst = new ArrayList<String >();

ShopkeeperLIst.add("Mahmood");
ShopkeeperLIst.add("Maqsood");
ShopkeeperLIst.add("Tamim");

employeesList.addAll(ShopkeeperLIst);


	
	System.out.println("=================================");
	
	LinkedList<String> studentList = new LinkedList<String>();	
	studentList.add("Sanuallah");
	System.out.println(studentList);
	
	
	System.out.println("=============================");
	Vector <Double > LosticsID = new Vector < Double >(); 
	
	LosticsID.add(23.44);
	System.out.println(LosticsID);
	
	
//	HashMap<String, String> countriesNames = new HashMap<String, String>();
//	
//	
//	countriesNames.put("Afghnaistan", "Kabul");
//		System.out.println(countriesNames);	
		
HashMap<String, String> countryCnames = new HashMap<String, String> ();
		
countryCnames.put("America", "DC");
countryCnames.put("Kanada", "ottawa");

System.out.println(countryCnames);
		

	System.out.println("====================================");
	
	Hashtable <Integer, String> UberDriver = new Hashtable <Integer, String> ();
	
	UberDriver.put(2, "Sharif");
	UberDriver.put(10," Rameshjan");
	UberDriver.remove(2);
	System.out.println(UberDriver);
	System.out.println(UberDriver.get(10));
	
	System.out.println(UberDriver.get(2));
	
	UberDriver.replace(10," Rameshjan");
	
	System.out.println(UberDriver.get(10));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}

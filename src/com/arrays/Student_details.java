package com.arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student_details {

	public static void main(String[] args) {
		
//		 formula for constructor: name of class name = new constructor ();
		
		Students student1 = new Students(1, "Friba", "ahmadi", 12);
		Students student2 = new Students(2, "Tamim", "osmani", 12);
		Students student3 = new Students(3, "hedayat", "akbary", 12);
		Students student4 = new Students(4, "setayes", "akbary", 12);
		
//		formula for arrayList ArrayList <Datatype> name = new  ArrayList <Datatype> ();
		
		
		ArrayList<Students> StudentscompleteList = new ArrayList<Students> ();
		StudentscompleteList.add(student1);
		StudentscompleteList.add(student2);
		StudentscompleteList.add(student3);
		StudentscompleteList.add(student4);
		
	for (Students stulist :StudentscompleteList) {
		
//		System.out.println(stulist.firstName);
//		System.out.println(stulist.lastName);
//		System.out.println(stulist.age);
//		
//		by another formula.
		
//	System.out.println(stulist.id + "  "+ stulist.firstName + "    "+ stulist.lastName + "     "+ stulist.age);	
//		
		
		System.out.println(stulist);
		
	}
	
	System.out.println("===========================");
	
	
//	LinkedList Section.
	
	LinkedList<Integer> AptNumber = new LinkedList<Integer>();
	
	AptNumber.add(30);
	AptNumber.add(10);
	AptNumber.add(50);
		
System.out.println(AptNumber);

AptNumber.addFirst(100);
	
		System.out.println(AptNumber);
		
		AptNumber.addLast(60);
		System.out.println(AptNumber);
		
		AptNumber.addLast(150);
		
		System.out.println(AptNumber);
		
System.out.println("================================");

		LinkedList<Integer> newApt = new LinkedList<Integer>();
		
		AptNumber.add(1);
		AptNumber.add(2);
		AptNumber.add(3);
		
		AptNumber.addAll(newApt);
		
		System.out.println(AptNumber);
		
//		how to contain 
		System.out.println("===============");
		
		
	System.out.println(AptNumber.contains(200));
	
	System.out.println(AptNumber.contains(3));
	}

}

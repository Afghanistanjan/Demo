package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


//import javax.swing.text.html.HTMLDocument.Iterator;

public class StudentList {

	public static void main(String[] args) {
		
		
		
	ArrayList<String >	StudentNames = new ArrayList<String > ();
		
		
	StudentNames.add("Ramesh");	
	StudentNames.add("Ramin");	
	StudentNames.add("Monis");	
	StudentNames.add("jawaid");	
		
//	we print the data by Iterator Loop,
	
//	Iterator names = StudentNames.iterator();
	
//	Iterator names = StudentNames.iterator();
//	
//	while (names.hasNext()) {
//		
//		System.out.println(names.next());
//	}
//		
		
		Iterator names = StudentNames.iterator();
		
		while(names.hasNext()) {
			
			System.out.println(names.next());
		}
		
		
		System.out.println("===========================");
		
//		now we print it by for loop.
//		in for loop the word of int come int for always. 
		for (int s = 0; s < StudentNames.size() ; s ++) {
			System.out.println(StudentNames.get(s));
		}
			
			
		System.out.println("==================================");

		
		
		System.out.println("traversing on list with for loop\n");
		
		
		for (String StuName : StudentNames) {
			
			
			System.out.println(StuName);
		}
		
		System.out.println("=============================");
		
// now we print out by forEach () method loop.
		

		StudentNames.forEach(stName -> {
			
			System.out.println(stName);
		});
	
		
		System.out.println("============================");
		
//		how to revrse th names in array.
		
		Collections.reverse(StudentNames);
		System.out.println(StudentNames);
		
		
		
		
	}

}

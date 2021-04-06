package com.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {

	public static void main(String[] args) {
	
//		note: iterator use to remove a data in array list, it mostly use by arrayList and HashSet.
		
		ArrayList<Integer> Numbers = new ArrayList<Integer> ();
		
		Numbers.add(10);
		Numbers.add(20);
		Numbers.add(50);
		Numbers.add(100);
		
		
		Iterator<Integer> A = Numbers.iterator();

System.out.println(A.next());
System.out.println(A.hasNext());
System.out.println(Numbers);
System.out.println();
////		
		while (A.hasNext());
		System.out.println(Numbers);
		Integer i = A.next();
//////		
		if (i <15);
//////		
		A.remove();
////		
	}

}

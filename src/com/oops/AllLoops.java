package com.oops;

public class AllLoops {

	public static void main(String[] args) {
		
		
		int aptNum [] = {22, 45, 67, 89,56, 34, 68};
		String Logistics [] = {" shah"," zamir"," nasrat"," farhad"};
 		
//		need to use for loop.
//		note: for each element of array one index is exist, that start from 0 
		for (int a =0; a< aptNum.length; a++  ) {
			
			System.out.println("Apt number are as below"+" - "+ aptNum [a] +"  "+ "correct");
			
		}
		
		System.out.println("===========\n");
for (int b =0 ; b < Logistics.length; b++ ) {
	
	System.out.println(("index" + "  "+ b) +" - "+ Logistics [b]);
}
		
		
System.out.println("===============\n");
		
//		now we use from while loop.


int numbersId = 0; 

while (numbersId <10) {
	
	System.out.println(numbersId);
	
	numbersId ++;
}
		
//		now we use do while loop.

System.out.println("=====do while loop==========");


int studentID = 30;

do {
	System.out.println(studentID);
	studentID--;
}while(studentID >=20);
		
		
		
System.out.println("=======each loop=========");
		
		String Logistcs [] = {"ahmad","ramesh","ramin","monis","kabir"};
		
	for (String printAdata:Logistcs ) {
		
	System.out.println(printAdata);
		
		
	}
		
	}
}

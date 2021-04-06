package com.arrays;

public class myArrays {

	public static void main(String[] args) {
	
//		create simple array.
//		we have three kinds of Qos 1. parenthesis (), curly bracess {}, square brakets[]
//		initialize mean when you set starting position.

		
//		 section: first formul we create simple or single arrays arrays as below.
		
		int aptApartment [] = new int [4];
		
		aptApartment [0] = 100;
		aptApartment [1] = 40;
		aptApartment [2] = 20;
		aptApartment [3] = 10;

		
//		System.out.println("aotNum = " + aptApartment [0]);
//		System.out.println("aotNum = " + aptApartment [1]);
//		System.out.println("aotNum = " + aptApartment [2]);
//		System.out.println("aotNum = " + aptApartment [3]);	
//		
		System.out.println("==================================");
		
		
		
		for (int i = 0 ;  i< aptApartment.length; i++) {
			
			System.out.println(" aprtment numbers are as follows = " + aptApartment [i]);
		}
//		 section: second formula we create simple arrays as below.
		
		System.out.println("===================================");
//		  2D array creation method.
		
		int studentId [][] = new  int [3][4];
		studentId [0][0] = 30; studentId [0][1] = 11; studentId [0][2] = 35; studentId [0][3] = 77; 
		studentId [1][0] = 40; studentId [1][1] = 12; studentId [1][2] = 32; studentId [1][3] = 90; 
		studentId [2][0] =25; studentId [2][1] = 18; studentId [2][2] = 37; studentId [1][3] = 11; 
		
//		System.out.println(studentId [0][2]);
		
	for (int i  = 0; i <studentId.length; i ++ ) 
	
	
	for (int j = 0; j <studentId[i].length; j++){
		
	System.out.println(studentId [i][j]);
		
	}
		
		
		System.out.println("=============================");
		
		
		int nootbookId [][] = { 	    {10, 20, 23, 50},                                        
										{22, 23, 45, 60},
										{15, 12, 17, 25}, 

		} ;
								    	
		System.out.println(nootbookId [2][2]);
		
		
//		mD or multi dimentional arrays.
		
		
		
		
	}

}

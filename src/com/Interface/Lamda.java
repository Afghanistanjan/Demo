package com.Interface;

public class Lamda implements myFunctional{


	
//  note: the 
	@Override
	public String showStudentInfo(String name) {

		return "the highest number of student which they had top numuber";
	}
		public static void main(String[] args) {
			
		
		Lamda thelamda = new Lamda () ;
			
		System.out.println(thelamda.showStudentInfo("Ahmad"));
	
		}
	}



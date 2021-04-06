package com.Interface;

public class Interface_by_InnerClass {

	public static void main(String[] args) {
	
		
		
		
		myFunctional Hadia = new myFunctional() {
			
			@Override
			public String showStudentInfo(String name) {
				// TODO Auto-generated method stub
				return "Hadia is my love";
			}
		};
		
		
		System.out.println(Hadia.showStudentInfo(null ));
	}

}

package com.ramesh;

public class EmployeeObject {
	
	String name;
	String lastName;
	int age;
	int employeeID;
	
	
	EmployeeObject(String name, String lastName,int age,int employeeID){

		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.employeeID=employeeID;
	}
	
	
	EmployeeObject(String name, String lastName){

		this.name=name;
		this.lastName=lastName;
		

}
	
	EmployeeObject(String name){

		this.name=name;
		
		

}
}
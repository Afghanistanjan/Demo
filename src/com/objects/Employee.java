package com.objects;

public class Employee {


	
int id;
String name;
String position;
double salary;




String workDays () {
	
	return "monday to friday";
	
}


	
//	what we want to do in this class? we want to assign value to variables. how we can do by new terms.
//  by in cupsolution (getter and setter).

// first step: right click and click setter and getter and create it.



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	public static void main(String[] args) {
//		create object of our class
//		here because of adding constructor to our object just click Ctrl + space automatically the constructor get add.
		
		Employee theEmployee = new Employee();
		
//		what does it mean below setter? by this section we assign value to variables.
		theEmployee.setId(1000);
		theEmployee.setName("Ramesh");
		theEmployee.setPosition("Mangaer");
		theEmployee.setSalary(10000.88);
//		by thes getters we print the data.
		System.out.println(theEmployee.getId());
		System.out.println(theEmployee.getName());
		System.out.println(theEmployee.getPosition());
		System.out.println(theEmployee.getSalary());
		System.out.println(theEmployee.getClass());
	
		System.out.println("====================================");
		
		Employee theEmployee1 = new Employee();
		
		theEmployee1.setId(2);
		theEmployee1.setName("Rahim");
		theEmployee1.setPosition("Team leader");
		theEmployee1.setSalary(22.88);
		
		System.out.println(theEmployee1.getId());
		System.out.println(theEmployee1.getName());
		System.out.println(theEmployee1.getPosition());
		System.out.println(theEmployee1.getSalary());
		System.out.println(theEmployee1.getClass());
		
		
	System.out.println("============================");
	
	Employee theEmployee2 = new Employee();
	
	theEmployee2.setId(9);
	theEmployee2.setName("Ramin");
	theEmployee2.setPosition("Superwiser");
	theEmployee2.setSalary(15000.00);
	
	System.out.println(theEmployee2.getId());
	System.out.println(theEmployee2.getName());
	System.out.println(theEmployee2.getPosition());
	System.out.println(theEmployee2.getSalary());
	System.out.println(theEmployee2.getClass());
	
		
	}

}

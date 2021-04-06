package com.ramesh;

public class Employee {

	
// creating properties steps
	
	public int id;
	public String name;
	public double salary;
	public String position;
	
	
	// creating constructor steps	
//	one way to assign variables is through constructor.
// 	the anther way to assign value to variables is set in .
//  constructor is a block of code use to initialize newly created object. constructor is created from clsss name.
//  formula for constructor: access modifier + class () {	}
// when inside the parenthesis without value or empty, its call no argument constructor.
//  whatever is inside the parenthesis call parameter or argument.
//	how many kinds of constructor there are.      1. 
//	steps for making object or printing objects: creating class > creating properties and behavior > making constructor > making object > calling or invoking
	public Employee () {
		
	}
	
	
	public Employee (int Employeeid, String EmployeeName, double EmployeeSalary, String EmployeePosition) {
		
		id = Employeeid;
		name = EmployeeName;
		salary = EmployeeSalary;
		position =EmployeePosition;
			
	}
	
		
	
//  creating behavior steps
	
	public double getsalary () {
		
		return 2.3;
		
	}

	public String answerToCall () {
		
		return "the telephone operators answer the phone cells";
	}
	
	
	
	public String callToCustomer () {
		
		return "most of the time operator call the customer to help them";
	}
	
	
	
	public String helpToCustomer () {
		
		return "helps to fill the application if they are not avle to fill";
		
	}
	
	
	
	
//	override toString()
//	we use override toString () when prevent from repitation of sysout.println () for each to each variables and methods.
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", position=" + position
				+ ", getsalary()=" + getsalary() + ", answerToCall()=" + answerToCall() + ", callToCustomer()="
				+ callToCustomer() + ", helpToCustomer()=" + helpToCustomer() + "]";
	
	}
	
	
	public static void main(String[] args) {
		
//	object formula: name of class + name + = + new constructor ();	
//  now we create the original object.
//  the below object shows that intead of constructor we put the value.		
		
//		Employee theEmployee = new Employee (int Employeeid, String EmployeeName, double EmployeeSalary, String EmployeePosition);
		Employee theEmployee = new Employee (10, "shabir", 10.50, "operator");
		System.out.println(theEmployee);
//		calling or invoking 
//		what is calling or invoking? it mean that we call or cover the properties and behaviors by the object word.
		
//		System.out.println("theEmployeeID:" + theEmployee.id );
//		System.out.println("theEmployeeName:" + theEmployee.name);
//		System.out.println("theEmployeeSalary:" + theEmployee.salary );
//		System.out.println("theEmployeePosition:" + theEmployee.position);
//		
////		below is behavior section print
//		
//		System.out.println("theEmployeeGetSalary:" + theEmployee.getsalary () );
//		System.out.println("theEmployeeAnswerCall:" + theEmployee.answerToCall ());
//		System.out.println("theEmployeeCallToCustomer:" + theEmployee.callToCustomer () );
//		System.out.println("theEmployeeHelpToCustomer:" + theEmployee.helpToCustomer ());
//		
		
		System.out.println("====================================================");
//		whenever we add another object we should followe these steps: copy the original object and past it > change the name of orginal object > change the place of previous objects that located in Sysout..
//		note: we can add ather objects when day have the same properteis and behaviors.
		
		
		
		Employee theEmployee1 = new Employee (12, "freiba", 20.50, "operator team lead");
		System.out.println(theEmployee1);
		
//      creating constructor steps
//		System.out.println("theEmployeeID:" + theEmployee1.id );
//		System.out.println("theEmployeeName:" + theEmployee1.name);
//		System.out.println("theEmployeeSalary:" + theEmployee1.salary );
//		System.out.println("theEmployeePosition:" + theEmployee1.position);
//		
////		below is behavior section print
//		
//		System.out.println("theEmployeeGetSalary:" + theEmployee1.getsalary () );
//		System.out.println("theEmployeeAnswerCall:" + theEmployee1.answerToCall ());
//		System.out.println("theEmployeeCallToCustomer:" + theEmployee1.callToCustomer () );
//		System.out.println("theEmployeeHelpToCustomer:" + theEmployee1.helpToCustomer ());
		
		
		
		
		
	


	
	}

}

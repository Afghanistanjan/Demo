package com.fith.session;

public class Lostics extends EmployeesDetails {
	
	String Document;
	

	public Lostics(int id, String name, String position, double salary, String document) {
		super(id, name, position, salary);
		Document = document;
	}



public String theLostics () {
	return "workingDay";
}
	



	@Override
public String toString() {
	return "Lostics [Document=" + Document + ", id=" + id + ", Name=" + Name + ", position=" + position + ", salary="
			+ salary + ", theLostics()=" + theLostics() + "]";
}



	public static void main(String[] args) {
		
	
		
		
		
		
		
		

	}

}

package com.fith.session;

public class Doctors extends EmployeesDetails {
	
//	the below thing variable mean that doctor has something that is belong to his self did not get inheritance.
//	steps for inheritance: make extend and move the parent class name to child class infront of child class > generate the constructor not the variables > create new behavior and move the method > make override by cliking toString > in ohter class make an object > sysout..print.
	
	String profession;
	
	public Doctors(int id, String name, String position, double salary, String profession) {
	super(id, name, position, salary);
	this.profession = profession;
}



public String DoctorsWorkingDay () {
	return workingDay ();
}


	@Override
public String toString() {
	return "Doctors [profession=" + profession + ", id=" + id + ", Name=" + Name + ", position=" + position
			+ ", salary=" + salary + "]";
}



	public static void main(String[] args) {
	

	}

}

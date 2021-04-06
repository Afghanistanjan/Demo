package com.objects;

public class GetterAndSeters {


	
	
		int id ;
		String name;
		String position;
		double salary;
		
		
//	behavior.
		
	public	String workDays () {
			return "sturday to friday";
		}
	
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
	
	
	
		GetterAndSeters hedayat = new GetterAndSeters();
	
		hedayat.setId(12);
		hedayat.setName("Ramesh");
		hedayat.setPosition("Logistics");
		hedayat.setSalary(100.22);
		
		System.out.println("my id is = " + hedayat.getId());
		System.out.println("my name is = " + hedayat.getName());	
		System.out.println("my Postion is = " + hedayat.getPosition());	
		System.out.println("my salary is = " + hedayat.getSalary());	
		

		
		System.out.println(hedayat);
	}

	@Override
	public String toString() {
		return "GetterAndSeters [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary
				+ ", workDays()=" + workDays() + ", getId()=" + getId() + ", getName()=" + getName()
	
				+ ", getPosition()=" + getPosition() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()

				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";

	
//	note: when there be private in variables or property section we can not use from getter and setter.
	
	
	
	}
	

	
	
	
	

}

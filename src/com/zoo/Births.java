package com.zoo;

public class Births implements All_Animals {

	String name;
	String legs;
	String food;
	
	
	public Births(String name, String legs, String food) {
		this.name = name;
		this.legs = legs;
		this.food = food;
	}

// now we call getter and setter.

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}



	@Override
	public void allAnimalDetails() {
	
	
		System.out.println(" Births are kinds of animals");
		
		
		
		

	}

	@Override
	public String toString() {
		return "Births [name=" + name + ", legs=" + legs + ", food=" + food + "]";
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

}

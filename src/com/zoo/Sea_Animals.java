package com.zoo;

public class Sea_Animals implements All_Animals {

	String name;
	String legs;
	String food;
	
//   creating of constructor.

	public Sea_Animals(String name, String legs, String food) {
		super();
		this.name = name;
		this.legs = legs;
		this.food = food;
	}



//  creating getter and setter.




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


// object created in Animals_Details.

	@Override
	public void allAnimalDetails() {
		
		
	}



	@Override
	public String toString() {
		return "Sea_Animals [name=" + name + ", legs=" + legs + ", food=" + food + "]";
	}



	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

}

package com.oops2;

public class Animals_Details {

	public static void main(String[] args) {
	
		Animal theBirths = new Births();
		theBirths.eat();
		theBirths.move();
		theBirths.animalData();
		System.out.println(theBirths.toString());
//		the unabstract method have used in above object.
		System.out.println("=================\n");
		
		Fish theFish = new Fish();
		theFish.eat();
		theFish.move();
		System.out.println(theFish.toString());
		
		System.out.println("======================\n");
		
		Lion theLion  = new Lion();
		theLion.eat();
		theLion.move();
		theLion.name();
		System.out.println(theLion.name());
		System.out.println(theLion.toString());
		
		
		

	}

}

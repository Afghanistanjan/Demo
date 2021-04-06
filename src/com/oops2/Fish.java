package com.oops2;

public class Fish extends Animal {

	@Override
	void move() {
		
		System.out.println(" moves by its wings ");
	}

	@Override
	void eat() {
		System.out.println("fishes eats sea animls");
	}

	@Override
	public String toString() {
		return "fish also has a name";
	}

	
	
	
}

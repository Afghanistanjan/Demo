package com.Inheratence;

import com.sun.tools.javac.launcher.Main;

public class Ramesh extends Father {
	
	
//	inportant note: for inheritance of constructor from parent class we need super class.
int c;
int d;
	public Ramesh(int a, int b, int c , int d) {
		super(a, b);
		this.c = c;
		this.d = d;
	}

	
	
public static void main(String[] args) {
	
	Ramesh theRamesh = new Ramesh(10, 5, 4, 7);
	
	
	System.out.println(theRamesh.d);
}	

	
	

	
	
	
	
	
	
	
	

}





package com.arrays;

import org.graalvm.compiler.replacements.nodes.arithmetic.IntegerAddExactNode;

public class WrapperClassEx {

	public static void main(String[] args) {

int i= 20;

Integer A = Integer.valueOf(i);
		
		System.out.println(A);
		
		Integer B = i;
		
		System.out.println(B);
		
		
		
		double x = 10.5;
		
		Double Y = Double.valueOf(x);
		
		Double z = x;
		
		System.out.println(z);
		
		
		
		
		char d = 'A';
		
		Character f = Character.valueOf(d);
		
		Character e = d;
		
		System.out.println(e);
		
		
	System.out.println("=============================");
		
		
		int number = 10;
		
		while (number > 100) {
			System.out.println(number);
			number++;
		}
		
		
		
		
		
		
		
		
	}

}

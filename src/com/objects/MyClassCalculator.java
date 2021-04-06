package com.objects;

import java.util.Scanner;

	public class MyClassCalculator {

	
		public static void main(String[] args) {
			
 int number1;
 int number2;
 char operator;
 int answer = 0;
 
// for making constructor we use class that already exist in java. name of the class is Scanner.
//  scanner is a class that already exist in java we use it for making a constructor.
// what does it mean built in? it mean in system already exist by company.
// what is Scanner? its a class that allow as to write something in console. without scanner class we can not write something in console.	
//	the below shows that i created scanner class as object.
 
 
Scanner MyScanner = new Scanner (System.in);


 	System.out.println("please eneter your first N");
 	
// now we provide ground for writing of number.	


 	number1	= MyScanner.nextInt();
 	
 	System.out.println( " please select an operator > +, -, /, *");
 	
 	operator = MyScanner.next().charAt(0);
 	
// 	what is nextInt() and next().charAT (): they verify the data type.
 	
 	System.out.println(" please enter second number");
	
 	number2 = MyScanner.nextInt();
 	
 	System.out.println( "please show the answer");

	
	if (operator == '+') {
		answer = number1 + number2;
	}
	
if (operator == '-') {
	answer  = number1 - number2;
}

	if (operator == '*') {
		answer =number1 * number2;
	}

if (operator == '/') {
	answer = number1 / number2;
}

System.out.println(number1 + "  "+ operator + "   "+ number2 + "  =  " + answer);














	}
		
		
}

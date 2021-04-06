package com.Interface;

public class Lamda2 {
	
	public static void main(String[] args) {
		
//		the second methods of getting data from interface into class.
//		copy past of interface name put thexpressin name then ->. its lamda sign.
//		functional interface: only by using of lamda expression we can implement method to class.
//		there are three types of getting interface.1. simple type 2. Lamda expression 3. inner class.
		myFunctional theexpression = (String name) -> "Ramesh is good boy";
		
		System.out.println(theexpression.showStudentInfo("ramesh jan"));
	}

}

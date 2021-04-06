package com.controlStatement;

public class Controlls {

	public static void main(String[] args) {
	
		
//		never a method create inside another method. otherwise it will show wrong.
//		in if statements we use from return and sysout.
//		if our method has void we use from sysout if doesnot have any void we use return boths are the same.
		
		
		
		int carPrice = 10000;
		
		if (carPrice == 10000) {
			System.out.println(" i can by it");
		}
		
		System.out.println("===============================");
		
		int MotorcyclePrice = 40000;
		String MotorcycleName = "Honda";
		
		if (MotorcyclePrice < 50000 && MotorcycleName == "Honda") {
			System.out.println(" that is honda i can afford it to buy it beacaase i have its money");
		}if (MotorcyclePrice >10000) {
			System.out.println(" i wont buy it");
		}
		
		System.out.println("==================================");
		
		
		int carprice = 2000;
		
		if (carprice == 2000) {
			System.out.println(" i can afford it to buy it");
		}else {
			System.out.println(" i can not afford to buy it");
		}
		
		
		System.out.println("==================================");
		
		
		int num = 1234;
		
		if (num < 100 && num >= 1) {
			System.out.println(" its two digit number");
		}else if (num <1000 && num >= 100) {
			System.out.println(" its three digit number");
		}else if (num < 10000 && num >= 1000) {
			System.out.println(" its four digit numver");
		}else {
			System.out.println(" it will be none");
		}
		
		
		
		
		
		
		
		
		
	}

}

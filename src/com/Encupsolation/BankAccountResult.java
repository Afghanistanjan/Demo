package com.Encupsolation;

public class BankAccountResult {

	public static void main(String[] args) {
//		this object made on the base of BankAccountNumber class, becuase the when data type of variable be private how to get its data by other class.
		
		
		BankAccount Result = new BankAccount ();
		
		Result.setAccountNumber(2334444);
		System.out.println(Result.getAccountNumber());
		
		
		Result.setAccountBalance(2334.44);
		
		System.out.println(Result.getAccountBalance());
		
	}

}

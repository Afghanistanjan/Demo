package com.polymarphysm;

public class Family_OverLoading {
//	polymarphysm mean methods by same name do the different action.
//	here are the same name method.
//	overload methods are those that have same name method and all of them call in one main methods.
	void study () {
		System.out.println("every one study in the family");
	}
	
	
	void study (String subject) {
		System.out.println("everybody study om the family "+subject+" language for the first time" );
	}
	
	
	void sudty (String subject , int grade) {
		System.out.println("everyonbe study "+ subject + grade + "   base on thier age ");
	}
	
	


	public static void main(String[] args) {
	
		Family_OverLoading theFamily_OverLoading = new Family_OverLoading();
		theFamily_OverLoading.study();
		theFamily_OverLoading.study("english");
		theFamily_OverLoading.sudty("english", 20);
	}

}

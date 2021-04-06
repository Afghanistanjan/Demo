package com.zoo;

import java.util.LinkedList;

public class Animals_Details {
	
	public static void main(String[] args) {
		
//	create objects of births class.
//		why we make objects in this class? because we didn't create it in its own class.
		
		Births theBirths1 = new Births("Totis", "two legs", "beeds");
		Births theBirths2 = new Births("Eagle", "two legs", "beeds");
		Births theBirths3 = new Births("Turkey", "two legs", "beeds");
		Births theBirths4 = new Births("Kanary", "two legs", "beeds");
		Births theBirths5 = new Births("Mina", "two legs", "beeds");

//		why in below list we added Births class instead of data type because we make a list for Births class. and we use original objects inside it.
		LinkedList<Births> theBirthsList = new LinkedList<Births>();

//		theBirthsList.addAll(theBirthsList); for moving data from objdects to list we could use from the mentioned formula but for better understanding we use separately manually.
		
//		now we soured all objects inside the list.
		theBirthsList.add(theBirths1);
		theBirthsList.add(theBirths2);
		theBirthsList.add(theBirths3);
		theBirthsList.add(theBirths4);
		theBirthsList.add(theBirths5);
		
		
		System.out.println("===============================================");
//		now we make object of Sea_Animals class.
		
		Sea_Animals theAnimals1 = new Sea_Animals("Fish", "no leg", "see food");
		Sea_Animals theAnimals2 = new Sea_Animals("Shark", "no leg", "fish");
		Sea_Animals theAnimals3 = new Sea_Animals("whale", "no leg", "sea animals");
		Sea_Animals theAnimals4 = new Sea_Animals("sea lion", "no leg", "see food");
		Sea_Animals theAnimals5 = new Sea_Animals("Dolfin", "no leg", "see food");
		
		LinkedList<Sea_Animals> theSeaAnimals = new LinkedList<Sea_Animals>();
		
		theSeaAnimals.add(theAnimals1);
		theSeaAnimals.add(theAnimals2);
		theSeaAnimals.add(theAnimals3);
		theSeaAnimals.add(theAnimals5);
		theSeaAnimals.add(theAnimals5);
		
		System.out.println("==========================================");
		
//		we can use from this formula too.theSeaAnimals.addAll(theSeaAnimals);
		
//		now we want to make a list for both two lists (Births and Sea_Animals).
//		in bewlow list only only only we make a new list to source both (Births and Sea_Animals). it provide only this purpose not any of other purpose.
		
		LinkedList<All_Animals> AllzooAnimlas = new LinkedList<All_Animals>();
		
//		now we add boths two (Births and Sea_Animals) list inside one new list (AllzooAnimlas).
		
		
//		AllzooAnimlas.add(theSeaAnimals);
//		theSeaAnimals.add(theBirthsList);
		
		AllzooAnimlas.addAll(theBirthsList);
		AllzooAnimlas.addAll(theSeaAnimals);
		
//		now we want to print the all data (Births and Sea_Animals) classes.
//		the below eachLoop created on the base of this original formula that we have it already. LinkedList <data type.. like String or etc > name by ourselves create = new LinkedList <data type.. like String or etc >();
//	each loop formula for is like this  (data type + name by ourselves : list name ){}.
		
//		what does it mean the below eachloop. it mean we store the (AllzooAnimlas) info inside the ListofAnimals.
	for (All_Animals ListofAnimals: AllzooAnimlas) {
		
		System.out.println(ListofAnimals);
		
		
		
	}
	
	}

}

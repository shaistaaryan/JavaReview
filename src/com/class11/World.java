package com.class11;

public class World {

	public static void main(String[] args) {
		Baby baby1;
		baby1= new Baby();
        
		System.out.println(baby1.cry());
		
		//assign value
		baby1.firstName = "jhone";
		baby1.LastName ="Smith";
		baby1.gender = 'M';
		baby1.wight = 7;
		baby1.hairColore="Yellow";
		
		//reassign value
		baby1.wight=8;
		
		System.out.println("baby1 firstname is " + baby1.firstName);
		
		String variable = baby1.cry();
		System.out.println("baby lastName " + variable);
		
		String cryVariable = baby1.cry();
		System.out.println(cryVariable);
		baby1.waik();
		baby1.taik(3);
		
		
		System.out.println("/n-----Done with baby1------");
		
		Baby baby2= new Baby();
		
		System.out.println(baby2.cry());
		
		baby2.firstName = "Selin";
		baby2.LastName = "Atasoy";
		baby2.gender ='F';
		baby2.hairColore ="Black";
		baby2.wight = 6;
		
		System.out.println("----------------------");
		baby1.displayBabyInfo();
		System.out.println("----------------------");
		baby2.displayBabyInfo();
		
	}

}

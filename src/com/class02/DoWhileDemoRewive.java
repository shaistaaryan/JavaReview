package com.class02;

public class DoWhileDemoRewive {

	public static void main(String[] args) {
  
		int age = 0; // just born
		 
		while (age<10) {
			age++;
			System.out.println("Happy brithday ! you are " + age +"yrars old");
		}
	 System.out.println("Happy brithday ! you are " + age +"yrars old");
	
	 int age2 =0;//just born my second son
	 do {
		 age2++;
	    System.out.println("Happy brithday ! you are " + age2 +"yrars old");
	 }while(age2<10);
	 System.out.println("Happy brithday ! you are " +age2 +"yrars old");
	
	
	          //Differnce between while && do while 
	 String greeting = "Hi";
	 boolean happy = false;
	 while (happy) {
		 System.out.println(greeting+"inside while");
	 }
	do {
		System.out.println(greeting +"inside do-while");
	}while (false);
	
	}

}

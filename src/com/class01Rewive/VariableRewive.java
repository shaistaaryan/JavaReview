package com.class01Rewive;

public class VariableRewive {
	
	public static void main(String[] args) {
	 //declare the variable 
		String firstName;
    //Assign a value
		firstName ="John";
	//declare the variable ans assign a value
		String lastName = "Smith";
	int age = 29;
		
		System.out.println(firstName + " " +lastName + " is " + age +" years old");
		
		//re-assign anew value
		lastName = "Brown";
		age = 32;
		System.out.println("after getting married");
		
		System.out.println(firstName + " " + lastName + " is " + age + " years old");
	
	
	}

}

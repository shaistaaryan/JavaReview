package com.class11;

public class JamesMember {

	String firstName; // belong to the instance		
	static String lastname; // static beliong to the calss
	int age;  //belong to the object
	
	void memberInfo() {
		System.out.println("full name is " + firstName + " " + lastname);
	}
}

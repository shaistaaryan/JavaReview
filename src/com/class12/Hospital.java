package com.class12;

public class Hospital {

	public static void main(String[] args) {

		Doctor doc1;
		doc1 = new Doctor("John smith","1234","15000");
		
//		doc1.name = "John smith";
//		doc1.licenceId = "12345";
//		doc1.salary = 15000;
//       
		System.out.println("Doctors name is " + doctor1);
		
		doc1.displayInfo();
        doc1.teratPatient("Adam smith");
		

	}

}

package com.class12;

public class Doctor {
	String name;
	String licenceId;
	int salary;

	public Doctor(String doctorName, String doctorlicenceId, String string) {
		this.name = doctorName;
		this.licenceId = doctorlicenceId;
		this.salary = string;

	}

	public void checkkUp() {
		System.out.println("Doctor " +this.name + " has ordered blood test");
	}

	public void teratPatient(String patientName) {
		System.out.println("Doctor " + name + " give prescriptiom to " + patientName);
	    this.chargePatient();
	}

	public void chargePatient() {
		System.out.println("Let me charge $100.");
	}

	public void displayInfo() {
		System.out.println("Doctor " + name + "with licencedId" + licenceId);
	}

}

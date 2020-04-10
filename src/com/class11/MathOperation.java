package com.class11;

public class MathOperation {

	//can be accessed frpm everywhere
	public int add(int num1, int num2) {
		int addition = num1 + num2;
		return addition;
	}
//can be accessed from insde package,and inheri
	protected void add2(int num1, int num2) {
		int addition = num1 + num2;
		System.out.println("Printing the result is"+ "inside the method " + addition);
	}
// can be accessed only within this class
	int multiply (int num1, int num2) {
		return num1*num2;
	}
	//can be accessed only witin this class
	private void smth() {
		
	}
}


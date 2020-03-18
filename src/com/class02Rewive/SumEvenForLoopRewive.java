package com.class02Rewive;

public class SumEvenForLoopRewive {

	// Add even numbers
	// also add odd numbers
	// alos add all numbers
	// between 1 && 50
	// Using for loop
	
	public static void main(String[] args) {
		
		// in this loop we do three condition in one loop

		int totalOdd = 0, totalEven = 0, greeting = 0;

		for (int count = 1; count <= 50; count++) {
			if (count % 2 == 0) {
				totalEven += count;
			} else {
				totalOdd += count;
				// 2nd way to calcul
			}
			System.out.println("totalEven is = " + totalEven);
			System.out.println("totalOdd is =" + totalOdd);

			// 1st way
			// greeting
			System.out.println("greeting is = " + greeting);

		}

	}

}

package com.class04;

public class TwoDarraySumMinMax {

	public static void main(String[] args) {
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8, }, { 3, 0, 8, 5 } };

		int rows = num.length;
		for (int row = 0; row < rows; row++) {

			int Length = num[row].length;
			for (int col = 0; col < Length; col++) {
				int element = num[row][col];
				System.out.print(element + " ");
			}
			System.out.println();

		}
	//Sum a all element in a 2D array 
		int sum =0; 
		// Iterating rows 
		for(int row = 0; row < num.length; row++) {
			//Iterating element in a row
			for (int col = 0; col < num[row].length; col++){
				sum += num[row][col];
			}
		}
	System.out.println("The sum of all number is " + sum);
	
	int min = num[0][0];
	int max = num [0][0];
	for(int i = 0; i < num.length; i++) {
		for ( int j = 0; j< num[i].length; j++){
			int element = num[i][j];
			if(element < min) {
				min = element;
			}
		}
	}
	
	System.out.println("The maxium is " + max);
	System.out.println("The minimum is " + min);
	
	}

}

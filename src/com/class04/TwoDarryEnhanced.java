package com.class04;

public class TwoDarryEnhanced {

	public static void main(String[] args) {

		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8, }, { 3, 0, 8, 5 } };

		// Iterating rows of a 2D array
		for (int[] row : num) {

			System.out.println(row);
//	  //Iterating elements of a row 
			for (int element : row) {
				System.out.print(element + " ");
			     
			}

			System.out.println();
		}

		
		
		
	}

}

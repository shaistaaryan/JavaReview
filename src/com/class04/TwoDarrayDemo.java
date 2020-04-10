package com.class04;

public class TwoDarrayDemo {

	public static void main(String[] args) {
		// 1st way to initonlize
		int[][] numbers = new int[3][4];

		// Lets print third element in second roe
		System.out.println("thid element in secound row is " + numbers[1][2]);

		// let us initialize some values
		numbers[1][0] = 9;
		numbers[1][1] = 6;
		numbers[1][2] = 2;
		numbers[1][3] = 8;

		// lets print third element in firdt row= row index 0
		System.out.println("thid element in secound row is " + numbers[1][2]);
		numbers[0][0] = 7;
		numbers[0][1] = 1;
		numbers[0][2] = 6;
		numbers[0][3] = 12;

		// Lets us initialize values for third row = row index 2
		numbers[2][0] = 3;
		numbers[2][1] = 0;
		numbers[2][2] = 8;
		numbers[2][3] = 5;

		// 2nd way
		int[][] numbers2 = {{ 7, 1, 6, 12 },{ 9, 6, 2, 8 }, { 3, 0, 8, 5, } };
		// lets print fourth element in first row
		System.out.println("fourth element in first row " + numbers2[0][3]);

		//3rd way , The coolest way :)
		int [][]numbers3 = new int[3][];
		numbers3[0] =new int[4];
		numbers3[1] =new int [4];
		numbers3[2] =new int [4];
		
		System.out.println();
	
	}

}

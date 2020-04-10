package com.class10;

import java.util.Scanner;

public class JavaUtilScanner {

	public static void main(String[] args) {
		//use scsnner to ask for the size of the array 
		//then, read numbers from the scanner into the array
		//then print the whloe array
		
		Scanner scan =new Scanner(System.in);
		System.out.println("How to element do you want to store , body?");
		int size = scan.nextInt();
		
		
		// i am creating an array with size = whatere he/she gave us
		int[] nums = new int[size];

		//This for loop inserts numbers into array
		for(int i= 0; i < size; i++) {
			System.out.println("Give me a number t stroe int the array!");
			nums[i] =scan.nextInt();
		}
      System.out.println("Lets see what you gave me:");
	//This is enhanced for loop  read numbers form the array
      for (int n : nums) {
    	  System.out.println(n);
      }
	}

}

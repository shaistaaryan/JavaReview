package com.class04;

import java.util.Arrays;

public class Q7 {

	public static void main(String[] args) {
		// writ a java progarm to finsd the second larhest number in the array?
		//maxium and minimum number un the array
		
		int[] numbers = {32, 61, 16, 89, 74, 25,};
		
		//1st way
		Arrays.sort(numbers);
		System.out.println("Smallest " + numbers[0]);
		System.out.println("biggest " + numbers[numbers.length -1]);
		System.out.println("Secund Largest " + numbers[numbers.length -2]);
		
		System.out.println("---2nd way----");
		//2nd way
		int[] numbers2 = { 32, 61, 16, 89, 74, 25,};
		
		int smallest = numbers2[0];
		int largest = numbers2[0];
		int largest2= numbers2[0];
		
		for (int i =0; i<numbers2.length; i++) {
		  int element =numbers2[i];
		//check if it is bigger thsn the largest
		  if(element > largest) {
			  largest2 = largest;
			  largest = element;
		}else if (element > largest2) {
			largest2 = element;
		}
		if ( element < smallest) {
			smallest = element;
		}
		}
		System.out.println("Smallest " + smallest);
		System.out.println("Bigest " + largest);
		System.out.println("Second Largest " + largest2);
		
				
				
				
				
				
		
	}

}

package com.class010;

public class ArrayMaxMin {

	public static void main(String[] args) {
		
		int[] numbers = {34, 67, 3, 93, 56, 72, 17, 33};
		int largest =numbers[0];
		int samllest=numbers[0];
		int sum = 0;
		
		for (int num : numbers) {
			if (num > largest) {
				largest = num;
			}
		if (num < samllest) {
			samllest = num;	
		}
		
		sum += num;
		
}
       System.out.println("The largest number is: " + largest);
       System.out.println("The samllest number is: " + samllest);
       System.out.println("The sum number is: " + sum);
	
	
	}

	}



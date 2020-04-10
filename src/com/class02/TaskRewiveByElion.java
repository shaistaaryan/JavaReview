package com.class02;

public class TaskRewiveByElion {
   //add even number
	//also add odd number
	//between 1 &&50
	//using while loop
	//you can use while or do-while
	//you can m use mod operator or add by 2
	public static void main(String[] args) {
	
		int count =1;
		int totalOdd=0, totalEven = 0;
		
		// 1st way
		while(count<= 50) {
			if (count % 2 == 0) {
				totalEven += count;
			}else {
				totalOdd += count;
			}
		  count++;
		}
		System.out.println("totalEven is =" +totalEven);
		System.out.println("totalOdd is = " + totalOdd);
		
		System.out.println("Using do-while");
		//2nd way this adds only odd
		
		count =1;
		do {
			totalOdd += count;
			count +=2;
		}while (count <= 50);
		System.out.println("totalOdd is = " + totalOdd);
			
		}
			
			

		
		
			
	{	
		
	}
}

package com.class02Rewive;

public class WhileDemo {

	public static void main(String[] args) {

		String greeting = "Hello";
		int count = 1;
	//	boolean condition = (count <=5)
		while (count <= 5) {    //this one way 
			// count = count +1;------>these both are same we can use each one 
			// count += 1;----------->
			count++;
			System.out.println(greeting);
		}
  System.out.println("--------------------------");
		// reassigning count to 1
		count =1;
		
		while (true) {
			count++; //it doesn't mean to put this in the beging or in the end .
			System.out.println(greeting);
         if (count == 6) {
        	 break;
         }
         count++;// or rihgt here its same meaning;
		
	}
		
   }

}

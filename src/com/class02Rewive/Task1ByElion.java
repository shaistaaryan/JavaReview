package com.class02Rewive;

public class Task1ByElion {
 //print number from 15 to 35
//but dont print numbers that are divisible by both 2 and 3
	
	//Dont print numbers that are divisible bt 2 and numbers that are divisible by 3
	
	public static void main(String[] args) {

    	for (int i = 15; i <= 35; i++) {
//			
//			//1st way divisisable by 6
//			if(i % 6 == 0) {
//				continue;
//			}
//		System.out.println(i);
		
		//2nd way , using && 
		if (i %2 == 0 && i % 3== 0) {
			continue;
		}
		System.out.println(i);
		
	   if (i % 2!=0 || i%3!=0) {
		   System.out.println(i);
	
	   }
	}
  }
}

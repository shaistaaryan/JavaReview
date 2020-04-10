package com.class01;

import java.util.Scanner;

public class ScannerClassTASK {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter youre age");
		int age = scan.nextInt();
		System.out.println("the age is " +age );
		
		if (age<=10)
        System.out.println("youre too young my brother!");
		else if (age<=20)
			System.out.println("youre growing body!");
		else if (age<=50)
			System.out.println("youre the man!");
		else 
			System.out.println("Man, youre dying!");
		
		
		
		
		
	}
	
	
	
	
	
}




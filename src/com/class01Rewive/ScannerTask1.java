package com.class01Rewive;

import java.util.Scanner;

public class ScannerTask1 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
    
	String firstLine= input.nextLine();
	System.out.println("firstLine was" + firstLine);
	
	String firstWord = input.next();
	System.out.println("firstWord was:" + firstWord);
	
	String secondWord = input.nextLine();
	System.out.println("secondWord was " + secondWord);
	
	String thirdWord = input.nextLine();
	System.out.println("thirWord was " + thirdWord);
	
	
	
}
}

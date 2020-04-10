package com.class04;

public class q6 {

	public static void main(String[] args) {
		//write a java program to fimd whether astring is palindrom or not?
		String str = "kayak";
		
		//1st way
		char[] charArray=str.toCharArray();
		
		String revers ="";
		System.out.println(revers.isEmpty());
		
		for(int i = charArray.length -1; i>=0; i--) {
        revers+= charArray[i];
			
		}
	System.out.println("word is=" + revers);
	System.out.println("revers is="+ revers);
	
	if(str.equals(revers)) {
		System.out.println("Yes it is a palindrome");
	}else {
		System.out.println("No, it is not a palindrom");
	}
	
	
	}

}

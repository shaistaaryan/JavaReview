package com.class04;

public class StringManiPulation {

	public static void main(String[] args) {
		String str = "Hello2! ";

		System.out.println(str.length());
		System.out.println(str.toUpperCase());

		// str has not changes
		System.out.println(str);
        System.out.println(str.toLowerCase());
	
	System.out.println(str.equals("Hello2! "));
	System.out.println(str.equalsIgnoreCase("hello2! "));
	
	boolean starts =str.startsWith("he");
	System.out.println("str.startsWith(he)->" + starts);
	System.out.println(str.endsWith("2! "));
	
	//
	
	
	
	
	String revers ="";
	char[] charArray =str.toCharArray();
	for(int i =charArray.length -1; i>=0; i--) {
		System.out.println(charArray[i]);
		revers += charArray[i];
	}
	
	System.out.print("revers is ->" + revers);
	
	int index=str.indexOf("llo");
	System.out.println(index);
	
	String exmple
	}

}

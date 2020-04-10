package com.class02;

import java.util.Scanner;

public class ScannerLoopRewive {
//ask user to enter a positive number and add it to the total
//he should enter -1 to stop

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int total = 0;
		int number = 0;

		// 1st way, using while
//	System.out.println("Enter a number. To stop enter -1");
//	number = input.nextInt();
//
//	while (number != -1) {
//		total += number;
//		
//		System.out.println("Enter a number. To stop enter -1");
//		number = input.nextInt();
//	}
//	System.out.println("The total is = " + total);

		// 2nd way, using do-while
//	do {
//		System.out.println("Enter a number. To stop enter -1");
//		number = input.nextInt();
//		// a version, to check for -1
////		if (number == -1) {
////			break;
////		} else {
////			total += number;
////		}
//
//		// b version, to check for -1
//		if (number != -1) {
//			total += number;
//		}
//	} while (number != -1);
//	System.out.println("The total is = " + total);

		// 3rd way, using for
		for (; number != -1;) {
			System.out.println("Enter a number. To stop enter -1");
			number = input.nextInt();
			if (number != -1) {
				total += number;
			}
		}

		System.out.println("The total is = " + total);
		
		input.close();
	}
}

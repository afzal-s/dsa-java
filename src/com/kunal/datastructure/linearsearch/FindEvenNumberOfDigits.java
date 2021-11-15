package com.kunal.datastructure.linearsearch;

/**
 * Given an array nums of integers, return how many of them contain an even
 * number of digits.
 * 
 * Input: nums = [12,345,2,6,7896] 
 * Output: 2 
 * 
 * Explanation: 
 * 12 contains 2 digits (even number of digits). 
 * 345 contains 3 digits (odd number of digits). 
 * 2 contains 1 digit (odd number of digits). 
 * 6 contains 1 digit (odd number of digits). 
 * 7896 contains 4 digits (even number of digits). 
 * Therefore only 12 and 7896 contain an even number of digits.
 */

public class FindEvenNumberOfDigits {

	public static void main(String[] args) {
		int[] arrNumbers = {12, 345, 2, 6, 7896};
		
		int findEvenNumbersSolutions = findNumbers(arrNumbers);
		System.out.println(findEvenNumbersSolutions);
	}

	private static int findNumbers(int[] arrNumbers) {
		int count = 0;
		
		for (int number : arrNumbers) {
			if (even(number)) {
				count++;
			}
		}
		
		return count;
	}

	private static boolean even(int number) {
		int numberOfDigits = digits(number);
		
		if (numberOfDigits % 2 == 0) {
			return true;
		}
		
		return false;
	}

	private static int digits(int number) {
		int count = 0;
		
		while (number > 0) {
			count++;
			number = number / 10;
		}
		
		return count;
	}

}

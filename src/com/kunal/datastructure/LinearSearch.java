package com.kunal.datastructure;

public class LinearSearch {
	public static void main(String[] args) {
		int[] numberArray = {23, 43, 53, 67, 43, 3, 9, 87, -21, 26};
		int targetForGettingIndex = -21;
		int targetForGettingElement = 67;

		int linearSearchForIndex = linearSearchForGettingIndex(numberArray, targetForGettingIndex);
		System.out.println(linearSearchForIndex);
		
		int linearSearchForElement = linearSearchForGettingElement(numberArray, targetForGettingElement);
		System.out.println(linearSearchForElement);
	}

	private static int linearSearchForGettingIndex(int[] numberArray, int target) {
		if (numberArray.length == 0) {
			return -1;
		}
		
		for (int index = 0; index < numberArray.length; index++) {
			int element = numberArray[index];
			if (element == target) {
				return index;
			}
		}
		
		return -1;
	}
	
	private static int linearSearchForGettingElement(int[] numberArray, int target) {
		if (numberArray.length == 0) {
			return -1;
		}
		
		for (int element : numberArray) {
			if (element == target) {
				return element;
			}
		}
		
		return -1;
	}

}
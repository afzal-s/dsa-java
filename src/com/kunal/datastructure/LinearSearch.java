package com.kunal.datastructure;

public class LinearSearch {
	public static void main(String[] args) {
		int[] numberArray = {23, 43, 53, 67, 43, 3, 9, 87, -21, 26};
		int targetForGettingIndex = -21;
		int targetForGettingElement = 67;
		int targetForGettingBoolean = 43;

		int linearSearchForIndex = linearSearchForGettingIndex(numberArray, targetForGettingIndex);
		System.out.println(linearSearchForIndex);
		
		int linearSearchForElement = linearSearchForGettingElement(numberArray, targetForGettingElement);
		System.out.println(linearSearchForElement);
		
		boolean isExist = linearSearchForGettingBoolean(numberArray, targetForGettingBoolean);
		System.out.println(isExist);
		
		String name = "Sohail";
		char targetForForLoop = 'a';
		boolean isExistInString = linearSearchInStringToGetBoolean(name, targetForForLoop);
		System.out.println(isExistInString);
		
		char targetForForEachLoop = 'l';
		boolean isExistInStringWithForEachLoop = linearSearchInStringToGetBooleanWithForEachLoop(name, targetForForEachLoop);
		System.out.println(isExistInStringWithForEachLoop);
		
		int[] array = {12, 43, -42, 45, 2, 1, 5, 67};
		int target = 45;
		int checkInRange = linearSearchInRange(array, target, 1, 4);
		System.out.println(checkInRange);
	}

	private static int linearSearchInRange(int[] array, int target, int start, int end) {
		if (array.length == 0) {
			return -1;
		}
		
		for (int index = start; index <= end; index++) {
			int element = array[index];
			if (element == target) {
				return index;
			}
		}
		
		return -1;
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
	
	private static boolean linearSearchForGettingBoolean(int[] numberArray, int target) {
		if (numberArray.length == 0) {
			return false;
		}
		
		for (int index = 0; index < numberArray.length; index++) {
			int element = numberArray[index];
			if (element == target) {
				return true;
			}
		}
		
		return false;
	}

	private static boolean linearSearchInStringToGetBoolean(String name, char target) {
		if (name.length() == 0) {
			return false;
		}
		
		for (int index = 0; index < name.length(); index++) {
			if (target == name.charAt(index)) {
				return true;
			}
		}
		
		return false;
	}
	
	private static boolean linearSearchInStringToGetBooleanWithForEachLoop(String name, char target) {
		if (name.length() == 0) {
			return false;
		}
		
		for (char character : name.toCharArray()) {
			if (character == target) {
				return true;
			}
		}
		
		return false;
	}

}
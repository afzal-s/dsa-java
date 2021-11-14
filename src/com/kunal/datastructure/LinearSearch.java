package com.kunal.datastructure;

public class LinearSearch {
	public static void main(String[] args) {
		int[] numberArray = {23, 43, 53, 67, 43, 3, 9, 87, -21, 26};
		int target = -21;
		int linearSearch = linearSearch(numberArray, target);
		System.out.println(linearSearch);
	}

	private static int linearSearch(int[] numberArray, int target) {
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

}
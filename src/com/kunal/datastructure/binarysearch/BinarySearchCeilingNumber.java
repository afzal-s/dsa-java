package com.kunal.datastructure.binarysearch;

public class BinarySearchCeilingNumber {
	
	public static void main(String[] args) {
		int[] array = {2, 3, 5, 9, 14, 16, 18};
		int target = 15;
		int answerForCeiling = toGetCeilingNumber(array, target);
		System.out.println(answerForCeiling);
	}

	private static int toGetCeilingNumber(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		
		while (start <= end) {
			int middle = start + (end - start) / 2;
			
			if (target < array[middle]) {
				end = middle - 1; 
			} else if (target > array[middle]) {
				start = middle + 1;
			} else {
				return middle;
			}
		}
		
		return start;
	}

}

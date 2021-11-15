package com.kunal.datastructure.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arrayInSortedOrder = {-18, -12, -4, 0, 2, 5, 7, 8, 13, 15, 18, 22, 24}; 
		int target = 15;
		int answer = binarySearch(arrayInSortedOrder, target);
		System.out.println(answer);
	}

	private static int binarySearch(int[] arrayInSortedOrder, int target) {
		int start = 0;
		int end = arrayInSortedOrder.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (target < arrayInSortedOrder[mid]) {
				end = mid - 1;
			} else if (target > arrayInSortedOrder[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}

}

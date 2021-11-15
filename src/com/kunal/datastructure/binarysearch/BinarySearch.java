package com.kunal.datastructure.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arrayInSortedInAscendingOrder = {-18, -12, -4, 0, 2, 5, 7, 8, 13, 15, 18, 22, 24}; 
		int targetOfAscendingOrder = 15;
		int answerOfAscendingOrder = binarySearchForAscendingOrder(arrayInSortedInAscendingOrder, targetOfAscendingOrder);
		System.out.println(answerOfAscendingOrder);
		
		int[] arrayInSortedInDescendingOrder = {24, 22, 18, 15, 13, 8, 7, 5, 2, 0, -4, -12, -18}; 
		int targetOfDescendingOrder = 13;
		int answerOfDescendingOrder = binarySearchForDescendingOrder(arrayInSortedInDescendingOrder, targetOfDescendingOrder);
		System.out.println(answerOfDescendingOrder);
	}

	private static int binarySearchForAscendingOrder(int[] arrayInSortedInAscendingOrder, int target) {
		int start = 0;
		int end = arrayInSortedInAscendingOrder.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (target < arrayInSortedInAscendingOrder[mid]) {
				end = mid - 1;
			} else if (target > arrayInSortedInAscendingOrder[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}

	private static int binarySearchForDescendingOrder(int[] arrayInSortedInDescendingOrder,
			int targetOfDescendingOrder) {
		int start = 0;
		int end = arrayInSortedInDescendingOrder.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (targetOfDescendingOrder > arrayInSortedInDescendingOrder[mid]) {
				end = mid - 1;
			} else if (targetOfDescendingOrder < arrayInSortedInDescendingOrder[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}

package com.kunal.datastructure.binarysearch;

public class OrderAgnosticBinarySearch {
	public static void main(String[] args) {
		int[] arr = {-18, -16, -4, 0, 2, 3, 6, 8, 14, 20, 24};
		int target = 14;
		int answer = OrderAgnosticBinarySearch(arr, target);
		System.out.println(answer);
	}

	private static int OrderAgnosticBinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		boolean isAscending = arr[start] < arr[end];
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (arr[mid] == target) {
				return mid;
			}
			
			if (isAscending) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1; 
				} else {
					start = mid + 1;
				}
			}
		}
		
		return -1;
	}
}

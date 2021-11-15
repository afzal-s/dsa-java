package com.kunal.datastructure.linearsearch;

public class LinearSearchFindMinimumAndMaximum {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 3, 5, 8};
		
		int minimumNumberFromArray = minimum(arr);
		System.out.println(minimumNumberFromArray);
		
		int maximumNumberFromArray = maximum(arr);
		System.out.println(maximumNumberFromArray);
	}

	private static int minimum(int[] arr) {
		int minimumNumber = arr[0];
		
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < minimumNumber) {
				minimumNumber = arr[index];
			}
		}
		
		return minimumNumber;
	}
	
	private static int maximum(int[] arr) {
		int maximumNumber = arr[0];
		
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maximumNumber) {
				maximumNumber = arr[index];
			}
		}
		
		return maximumNumber;
	}
	
}

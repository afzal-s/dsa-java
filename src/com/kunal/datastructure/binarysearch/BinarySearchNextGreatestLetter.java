package com.kunal.datastructure.binarysearch;

public class BinarySearchNextGreatestLetter {
	public static void main(String[] args) {
		char[] inputs = {'c', 'f', 'j'};
		char target = 'a';
		char answerNextGreaterLetter = nextGreatestLetter(inputs, target); 
		System.out.println(answerNextGreaterLetter);
	}

	private static char nextGreatestLetter(char[] inputs, char target) {
		int start = 0;
		int end = inputs.length - 1;
		
		while (start <= end) {
			int middle = start + (end - start) / 2;
			
			if (target < inputs[middle]) {
				end = middle - 1;
			} else {
				start = middle + 1;
			}
		}
		return inputs[start % inputs.length];
	}
}

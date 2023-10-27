package com.sunbeam;

//Implement linear search algorithm to find the nth occurrence of the given element. If nth occurrence is not found, return -1.
public class LinearSearchOccurrenceTest {

	public static void occurrenceEle(int arr[], int key) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (key == arr[i]) {
				count++;	
			}
		}
		System.out.println("occurrence of element = "+count);
	}

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 90, 70, 80, 10, 60, 10 };
		int key = 40;
		occurrenceEle(arr, key);

	}

}

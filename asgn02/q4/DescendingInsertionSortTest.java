package com.sunbeam;

import java.util.Arrays;

public class DescendingInsertionSortTest {

	public static void descendingInsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 10, 60, 40, 30, 75, 85, 90, 20, 35};

		descendingInsertionSort(arr);
		System.out.println("SORTED : " + Arrays.toString(arr));
	}

}

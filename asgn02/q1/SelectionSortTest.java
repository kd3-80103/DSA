package com.sunbeam;

import java.util.Arrays;

//Write a selection sort function to sort array and returns no of comparisons.

public class SelectionSortTest {
	public static int selectionSort(int[] a) {
		int count = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				count++;
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int arr[] = { 15, 45, 10, 65, 75, 35, 80, 40, 50, 55 };

		System.out.println("BEFORE SORT : " + Arrays.toString(arr));

		System.out.println("\n---------------------------------------\n");

		int cnt = selectionSort(arr);

		System.out.println("AFTER SORT : " + Arrays.toString(arr));

		System.out.println("\n" + "comparisons = " + cnt);
	}

}

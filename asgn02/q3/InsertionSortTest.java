package com.sunbeam;

import java.util.Arrays;

public class InsertionSortTest {

	public static int insertionSort(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > temp) {
				count++;
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = temp;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 40, 20, 60, 30, 75, 25 };
		
		System.out.println("BEFORE SORT : " + Arrays.toString(arr));
		
		System.out.println("---------------------------------------");
		
		int countComparisions = insertionSort(arr);

		System.out.println("AFTER SORT : " + Arrays.toString(arr));
		
		System.out.println("COMPARISONS = "+countComparisions);

	}

}

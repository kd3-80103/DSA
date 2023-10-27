package com.sunbeam;

import java.util.Scanner;

public class BinarySearchCountTest {
	public static int[] createArray(Scanner scanner, int size) {

		int[] arr = new int[size];
		System.out.println("Enter values of array = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
	}

	public static int comparisonCount(int[] a, int ele, int size) {
		int left = 0;
		int right = size - 1;
		int mid;
		int count = 1;
		while (left <= right) {
			mid = (left + right) / 2;
			if (ele == a[mid]) {
				count++;
				break;
			} else if (ele < a[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
//			count++;
		}
		System.out.println("comparisons = "+count);
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array = ");
		int size = scanner.nextInt();

		int[] a= createArray(scanner, size);

//		int[] a = { 10, 20, 30, 40, 50, 60};

		System.out.println("Enter element to be searched = ");
		int element = scanner.nextInt();

		comparisonCount(a, element, 6);

	}
}

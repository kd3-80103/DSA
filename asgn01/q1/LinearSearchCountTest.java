package com.sunbeam;

import java.util.Scanner;

public class LinearSearchCountTest {

	public static void countComparisons(int a[], Scanner scanner) {
		System.out.println("Enter element to be searched : ");
		int ele = scanner.nextInt();
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				++i;
				System.out.println("Number of comparisons : " + i);
			}
		}
	}

	public static void createArray(int size, Scanner scanner) {
		int arr[] = new int[size];
		System.out.println("Enter values of array : ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		countComparisons(arr, scanner);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size;
		System.out.println("Enter size of an array = ");
		size = scanner.nextInt();

		createArray(size, scanner);

	}

}

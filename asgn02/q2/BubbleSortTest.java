package com.sunbeam;

import java.util.Arrays;

//Write a bubble sort function to sort array and returns no of comparisons.

public class BubbleSortTest {
	
	public static int bubbleSort(int[] a) {
//		int pass = 0;
		int count = 0;
		boolean flag;
		for(int i=1; i<a.length; i++) {
//			pass++;
			flag = false;
			for(int j=0; j<a.length-i; j++) {
				count++;
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false) {
				break;
			}
		}
//		System.out.println("passes = "+pass);
		return count;
	}

	public static void main(String[] args) {
		
		int arr[] = {33, 22, 66, 55, 44, 11};
		
		System.out.println("BEFORE SORT : "+Arrays.toString(arr));
		
		System.out.println("\n------------------------------------\n");
		
		int count = bubbleSort(arr);
		
		System.out.println("AFTER SORT : "+Arrays.toString(arr));
		
		System.out.println("comparisons = "+count);
	}

}

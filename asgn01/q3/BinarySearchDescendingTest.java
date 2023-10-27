package com.sunbeam;

public class BinarySearchDescendingTest {

	public static int binaryDescending(int[] a, int size, int key) {
		int left = 0;
		int right = size-1;
		int mid;
		while(left <= right) {
			mid = (left+right)/2;
			if(key == a[mid]) {
				System.out.println("FOUND = "+a[mid]+" at index = "+mid);
				break;
			}else if(key > a[mid]) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		} return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {60,50,40,30,20,10};
		int key = 20; 
		binaryDescending(arr, 6, key);
	}

}

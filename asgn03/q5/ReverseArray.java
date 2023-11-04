package com.sunbeam;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
	public static void main(String[] args) {
		Stack st = new Stack(5);
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println("Before reversing:" + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			st.push(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = st.pop();
		}
		System.out.println("After reversing:" + Arrays.toString(arr));

	}
}

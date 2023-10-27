package com.sunbeam;

public class NonRepeatElementTest {

	public static int firstNonRepeatEle(int[] a) {
		int count=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(i!=j) {
					if(a[i]==a[j])
						count++;
				}
			}
			if(count == 0) {
				return a[i];
			}
			count=0;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= { 1, 2, 3,3,0 ,-1, 2, 1, 0,4, 4,14, -1, 7, 8 };
		
//		int res = firstNonRepeatEle(arr);
		
		System.out.println(firstNonRepeatEle(arr));

	}

}

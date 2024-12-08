package com.cloudtech;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {3,5,9,7};
		int arr2[] = {5,3,7,9,1};
		
		if (arrayCompare(arr1, arr2)) {
			System.out.println("Array element areequals");
		}else
			System.out.println("Array Emelmentsare not equals");
		
		
	}
	public static boolean arrayCompare(int[] arr1,int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		if (n != m) {
			return false;
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < n; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		
		
		
		return true;
	}
	
	

}

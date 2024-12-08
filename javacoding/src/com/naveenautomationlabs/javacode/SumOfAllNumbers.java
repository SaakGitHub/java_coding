package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(3,4,89,6,1,15,23,8,5,26,48,9);
		
		int sum = list.stream().reduce((a,b) -> a+b).get();
		System.out.println(sum);

	}

}

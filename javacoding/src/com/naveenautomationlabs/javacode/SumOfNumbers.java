package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,4,5,6,22,3,90,89,2,1,3,4,55,6);
		
		//sum of all numbers
		int sum= l.stream().reduce((a,b)-> a+b).get();
		System.out.println(sum);
		
		
	}
	

}

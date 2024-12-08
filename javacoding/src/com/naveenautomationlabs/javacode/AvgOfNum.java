package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.List;

public class AvgOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3,4,6,1,8,5);
		
		double avg =	list.stream().mapToInt(e ->e).average().getAsDouble();
		System.out.println(avg);

	}

}

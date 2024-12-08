package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.List;

public class AngOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		double avg = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		
	}

}

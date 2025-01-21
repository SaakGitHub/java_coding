package com.java_guide;

import java.util.Arrays;
import java.util.List;

public class FindAverage {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(20,10,15,30,25,40);
		
		double asDouble = list.stream().mapToInt(num->num.intValue()).average().getAsDouble();
		System.out.println(asDouble);
		
		
	}

}

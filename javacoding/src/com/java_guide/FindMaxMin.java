package com.java_guide;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindMaxMin {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,12,15,16,17,18,20,21,19);
		Stream<Integer> stream = list.stream();
		int max = stream.mapToInt(num->num.intValue()).max().getAsInt();
		System.out.println(max);
		/***or***/
		int max1 = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		System.out.println(max1);
		
		/*------------------------------------------------*/
		
		Stream<Integer> stream1 = list.stream();
		int min = stream1.mapToInt(num->num.intValue()).min().getAsInt();
		System.out.println(min);

		/*****or******/
		int min1 = list.stream().mapToInt(Integer::intValue).min().getAsInt();
		System.out.println(min1);
	}

}

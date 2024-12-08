package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3,4,89,1,4,6,1,15,23,8,5,26,48,9);

		List<Integer> sortedList =	list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> sretedDescList =	list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sretedDescList);
	}

}

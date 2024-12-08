package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddAndEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3,4,89,6,1,15,23,8,5,11,21,26,48,9);

		List<Integer> even =list.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> odd = list.stream().filter(n -> n%2!=0).collect(Collectors.toList());
		System.out.println(odd);
	}

}

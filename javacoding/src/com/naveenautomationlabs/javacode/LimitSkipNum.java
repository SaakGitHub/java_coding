package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkipNum {

	public static void main(String[] args) {
		
		//-----Limit()
		List<Integer> list = Arrays.asList(3,4,89,1,4,6,1,15,23,8,5,26,48,9);

		List<Integer> limitlist= list.stream().limit(5).collect(Collectors.toList());
		System.out.println(limitlist);
		
		int sumOfLimitList= list.stream().limit(5).reduce((a,b)->a+b).get();
		System.out.println(sumOfLimitList);
		
		
		//----skip()
		List<Integer> skiplist=list.stream().skip(5).collect(Collectors.toList());
		System.out.println(skiplist);
		
		int skipListSum = list.stream().skip(5).reduce((a, b)->a+b).get();
		System.out.println(skipListSum);
	}
	
}

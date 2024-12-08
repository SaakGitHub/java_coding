package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighestLowestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3,4,89,1,4,6,1,15,23,8,5,26,48,9);

		List<Integer> sortList = list.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(sortList);
		
		int secH = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secH);
		
		List<Integer> sortedDescList=list.stream().sorted(Collections.reverseOrder()).distinct().toList();
		System.out.println(sortedDescList);
		
		int secLowest=list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secLowest);
	}

}

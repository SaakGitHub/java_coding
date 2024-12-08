package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxMinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3,4,89,6,1,15,23,8,5,26,48,9);
		
		int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		
		System.out.println(max);
		System.out.println(min);
		
		List<String> slist = Arrays.asList("1","5","10");
		String smax = slist.stream().map(e->String.valueOf(e)).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(smax);
		
		String smin = slist.stream().map(e->String.valueOf(e)).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(smin);
	}

}

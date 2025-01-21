package com.java_guide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,2,3,3,4,5,6,6);
		
		Set<Integer> collect = num.stream().collect(Collectors.toSet());
		System.out.println(collect);
		
		List<Integer> collect2 = num.stream().distinct().toList();
		System.out.println(collect2);
		
		List<String> str = Arrays.asList("apple","apple","banana","cherry","cherry");
		List<String> collect3 = str.stream().distinct().toList();
		System.out.println(collect3);
		
		Set<String> collect4 = str.stream().collect(Collectors.toSet());
		System.out.println(collect4);

	}

}

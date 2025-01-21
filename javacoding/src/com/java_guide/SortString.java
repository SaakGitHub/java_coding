package com.java_guide;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Pinapple","Banana","Cherry","Apple");
		
		List<String> ascSort = list.stream().sorted().toList();
		System.out.println(ascSort);
		
		List<String> descSort = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(descSort);

	}

}

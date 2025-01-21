package com.java_guide;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10,15,25,40,65,70,85);
		
		int secondHigh = num.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHigh);
	}

}

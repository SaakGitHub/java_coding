package com.java_guide;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		String input = "hello world";
		
		IntStream stream = input.chars();	//this will convert string to char stream with ascii value of each charector
		Map<Character, Long> charLongMap = stream.mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(charLongMap);
	}

}

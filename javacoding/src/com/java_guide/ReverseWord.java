package com.java_guide;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord {

	public static void main(String[] args) {
		String input = "Hello Java World";

		Stream<String> stream = Stream.of(input.split(" "));

		String result = stream.map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(result);
	}

}

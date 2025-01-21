package com.java_guide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCase {

	public static void main(String[] args) {

		List<String> list= Arrays.asList("PinApple","Banana","Apple","Cherry");
		
		List<String> UpperList = list.stream().map(str -> str.toUpperCase()).toList();
		System.out.println(UpperList);
		
		List<String> lowerList = list.stream().map(str->str.toLowerCase()).toList();
		System.out.println(lowerList);
	}

}

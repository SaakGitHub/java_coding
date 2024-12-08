package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(234,22,456,456,34,267,789,234,256,222,777,734,3222,888,999);
		
		List<Integer> numStartsWith = list.stream()
						.map(e-> String.valueOf(e))
						.filter(e->e.startsWith("7"))
						.map(Integer::valueOf)
						.collect(Collectors.toList());
		System.out.println(numStartsWith);

	}

}

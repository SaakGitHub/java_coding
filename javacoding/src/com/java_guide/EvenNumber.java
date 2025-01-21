package com.java_guide;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,12,15,16,17,18,20,21,19);
		List<Integer> evenList = list.stream().filter(i->i%2==0).toList();
		System.out.println(evenList);
		
		List<Integer> oddList = list.stream().filter(i->i%2!=0).toList();
		System.out.println(oddList);

	}

}

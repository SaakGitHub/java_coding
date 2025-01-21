package com.java_guide;

import java.util.Arrays;
import java.util.List;

public class FindSquare {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,12,15,16,17,18,20,21,19);
		List<Integer> numSqureList = list.stream().filter(i->i%2==0).limit(3).map(num->num*num).toList();
		System.out.println(numSqureList);
		
		/***or*****/
		
		list.stream().filter(i->i%2==0).limit(3).map(num->num*num).forEach(num->System.out.println(num));
	}

}

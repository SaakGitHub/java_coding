package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,15,5,48,3,4,89,6,1,15,23,8,5,26,48,9);
		Set<Integer> duplicate = list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(duplicate);
	}

}

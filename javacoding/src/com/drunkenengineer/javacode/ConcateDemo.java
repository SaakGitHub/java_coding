package com.drunkenengineer.javacode;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcateDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);
		
		Stream<Integer> conList= Stream.concat(list1.stream(), list2.stream());
		
		List<Integer> mergeList = conList.toList();
		System.out.println(mergeList);
		
		Set<Integer> uniqueList = mergeList.stream().collect(Collectors.toSet());
		System.out.println(uniqueList);
		
		Integer min = uniqueList.stream().min((n1,n2) -> n1-n2).get();
		System.out.println("Minimum Number :"+min);
		
		Integer max = uniqueList.stream().max((n1,n2) -> n1-n2).get();
		System.out.println("Minimum Number :"+max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Stream<Integer> fullList = Stream.concat(list1.stream(), list2.stream());
		 * 
		 * List<Integer> allElem = fullList.collect(Collectors.toList());
		 * System.out.println(allElem);
		 * 
		 * Set<Integer> uniqElem = allElem.stream().collect(Collectors.toSet());
		 * System.out.println(uniqElem);
		 * 
		 * Integer min= uniqElem.stream().min((i1,i2) -> i1 -i2).get();
		 * System.out.println("Minimum Elements"); System.out.println(min);
		 * 
		 * Integer max= uniqElem.stream().max((i1,i2) -> i1 -i2).get();
		 * System.out.println("Maximum Element"); System.out.println(max);
		 */
	}

}

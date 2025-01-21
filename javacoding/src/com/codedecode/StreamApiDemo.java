package com.codedecode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		/******* Intermediate Operation ************/
		
		// filter()
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,10,12);
		
		List<Integer> collect = numbers.stream().filter(n -> n>5).collect(Collectors.toList());
		System.out.println(collect);
		
		// map()
		List<String> words = Arrays.asList("banana","apple","cherry","apple","berry");
		
		List<String> collect2 = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect2);
		
		Set<String> collect3 = words.stream().map(String::toUpperCase).collect(Collectors.toSet());
		System.out.println(collect3);
		
		// distinct()
		List<String> collect4 = words.stream().distinct().collect(Collectors.toList());
		System.out.println(collect4);
		
		//flatmap()
		
		//sort()
		//default sorting
		List<String> collect5 = words.stream().sorted().collect(Collectors.toList());
		System.out.println(collect5);
		
		//customize sorting
		List<String> collect6 = words.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		System.out.println(collect6);
		
		//peek() -- used for debugging purpose to check original stream data and data after intermediate operations
		
		List<String> collect7 = words.stream().peek(word -> System.out.println("Original : "+ word)).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect7);
		
		// limit()
		List<Integer> collect8 = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(collect8);
		
		// skip()
		List<Integer> collect9 = numbers.stream().skip(3).collect(Collectors.toList());
		System.out.println(collect9);
		
		/******* Terminal Operation ************/
		
		// forEach()
		words.stream().forEach(word -> System.out.println(" Items : " + word));
		
		//collect()
		
		//reduce()
		Optional<Integer> result = numbers.stream().reduce((a,b)-> a*b);
		System.out.println(result);
		System.out.println(result.get());
		
		// allMatch()
		boolean allMatch = numbers.stream().allMatch(n -> n>0);
		System.out.println(allMatch);
		
		// anyMatch()
		boolean anyMatch = numbers.stream().anyMatch(n -> n>8);
		System.out.println(anyMatch);
		
		// noneMatch()
		boolean noneMatch = numbers.stream().noneMatch(n-> n<0);
		System.out.println(noneMatch);
		
		// findFirst()
		Optional<String> findFirst = words.stream().filter(w -> w.startsWith("b")).findFirst();
		System.out.println(findFirst);
		System.out.println(findFirst.get());
		
		// findAny
		Optional<String> findAny = words.stream().filter(w -> w.startsWith("c")).findAny();
		System.out.println(findAny);
		System.out.println(findAny.get());
		
		// max() and min()
		//max()
		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
		System.out.println(max);
		System.out.println(max.get());
		//min()
		Optional<Integer> min = numbers.stream().min(Integer::compareTo);
		System.out.println(min);
		System.out.println(min.get());
		
		//toArray()
		String[] array = words.stream().toArray(String[]::new);
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		
					//or
		for (String str : array) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		// joining()
		
		String j1 = words.stream().collect(Collectors.joining(","));
		System.out.println(j1);
		
		String j2 = words.stream().collect(Collectors.joining(",", "{", "}"));
		System.out.println(j2);
		
		// groupBy()
		List<Person> people = Arrays.asList(new Person("John","New York"),
				new Person("Jacob","London"),
				new Person("Smith","New York"));
		
		Map<String, List<Person>> gp = people.stream().collect(Collectors.groupingBy(Person::getCity));
		System.out.println(gp);
		
		
	}

}

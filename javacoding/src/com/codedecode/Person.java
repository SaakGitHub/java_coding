package com.codedecode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Person {
	
	private String name;
	private String city;
	
	public Person(String name, String city) {
	    this.name = name;
	    this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return city;
	}
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("John","New York"),
				new Person("Jacob","London"),
				new Person("Smith","New York"));
		
		Map<String, List<Person>> gp = people.stream().collect(Collectors.groupingBy(Person::getCity));
		System.out.println(gp);
		
		//extract name of person
		List<String> nameList =	people.stream().map(emp -> emp.name).collect(Collectors.toList());
		System.out.println(nameList);
		
		//distinct()
		
		List<Person> collect = people.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		
	}
}
 
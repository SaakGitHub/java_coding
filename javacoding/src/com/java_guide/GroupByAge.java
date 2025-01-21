package com.java_guide;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupByAge {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
				new Employee(1, "john", 25),
				new Employee(2, "Smith", 28),
				new Employee(3, "Jacob", 35),
				new Employee(4, "Paul", 45),
				new Employee(5, "Lana", 25),
				new Employee(6, "Mia", 28),
				new Employee(7, "Sophia", 35),
				new Employee(8, "Eilesh", 30)				
				);
		
		Map<Integer,List<Employee>> collect = emp.stream().collect(Collectors.groupingBy(Employee::getAge));
		
		collect.forEach((key, value)-> {
			System.out.println("Age : "+key);
			System.out.println("List of Employee :"+value);
			});

	}

}

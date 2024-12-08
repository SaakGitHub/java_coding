package com.drunkenengineer.javacode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();

		createEmployee(empList);

		Map<String, List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getCity));

		//empMap.forEach((key, value) -> System.out.println("City : " + key + " Employee : " + value));
		
		empMap.forEach((key, value) -> {
		    System.out.println("City : " + key + " Employees : ");
		    value.forEach(employee -> {
		        System.out.println("Name: " + employee.getName() + ", ID: " + employee.getId() + ", City: " + employee.getCity());
		    });
		});

	}

	private static void createEmployee(List<Employee> empList) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee();
		e1.setName("Kapil");
		e1.setId(101);
		e1.setCity("Banglore");

		Employee e2 = new Employee();
		e2.setName("Arun");
		e2.setId(104);
		e2.setCity("Pune");

		Employee e3 = new Employee();
		e3.setName("John");
		e3.setId(111);
		e3.setCity("Banglore");

		Employee e4 = new Employee();
		e4.setName("Peter");
		e4.setId(123);
		e4.setCity("Mumbai");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);

	}

}

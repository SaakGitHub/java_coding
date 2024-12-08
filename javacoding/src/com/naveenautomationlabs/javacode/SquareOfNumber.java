package com.naveenautomationlabs.javacode;

import java.util.Arrays;
import java.util.List;

public class SquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,5,9,8,10,20,30,15);
		
		double avg = list.stream()
						.map(e -> e*e)
							.peek(System.out::println)
								.filter(e -> e>100)
									.mapToInt(e->e)
										.average()
											.getAsDouble();
	
		System.out.println(avg);
	}

}

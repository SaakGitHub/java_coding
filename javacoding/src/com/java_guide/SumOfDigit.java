package com.java_guide;

import java.util.stream.Stream;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int number = 12345;
		
		int sum = String.valueOf(number)	//converting number to string
					.chars()			//convert string to chars array which have ascii value of each char 
						.map(ch-> Character.getNumericValue(ch))	//get numeric value(int value) for every ascii value
							.sum();		//sum every numeric digit
		System.out.println(sum);
		
		/****************   or    *********/
		
		int sum2 = Stream.of(String.valueOf(number).split(""))
						.mapToInt(Integer::parseInt)
							.sum();
		System.out.println(sum2);

	}

}

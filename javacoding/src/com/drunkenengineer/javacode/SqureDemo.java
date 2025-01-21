package com.drunkenengineer.javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SqureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l= Arrays.asList(4,5,8,9,10,7,6);
		
		//getting square of each value
		List<Integer> newList = l.stream().map(n -> n*n).toList();
		
		System.out.println(newList);
		
		//after square filter to get number greater than 50
		/*
		 * List<Integer> fewList = newList.stream().filter(n -> n>=50).toList();
		 * System.out.println(fewList);
		 */
		
		//after square filter to get number greater than 50 and generate vagerage for that
		/*
		 * OptionalDouble op = l.stream().mapToInt(n -> n*n).filter(n -> n > 25);
		 * System.out.println(op.getAsDouble());
		 */
		

	}

}

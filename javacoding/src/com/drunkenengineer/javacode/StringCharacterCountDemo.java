package com.drunkenengineer.javacode;

public class StringCharacterCountDemo {

	public static void main(String[] args) {
		
		String str = "ab, cd, xyz";
		int count =0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!= ' ' && str.charAt(i)!= ',') {
				count++;
				
			}
		}
		System.out.println("Total number of character is : "+count);
	}
}

package com.cloudtech;
/*
 *Program to remove particular charecter from a string 
 */

public class Program1 {

	public static void main(String[] args) {
		String str1 = "CLOUDTECH";		
		System.out.println(str1.replaceAll("C",""));
		
		String str= "CloudTech";
		int slength= str.length();
		System.out.println(slength);
		
		String finalString = "";
		for (int i = 0; i < slength; i++) {
			if (str.charAt(i) != 'C' && str.charAt(i) != 'c') {
				finalString = finalString + str.charAt(i);
				
			}
		}
		System.out.println(finalString);

	}

}

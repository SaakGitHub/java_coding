package com.durgasoft;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isEmpty()
		String s="";//true
		//String s = " ";//false
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		
		System.out.println(s.length());
		//length() method applicable for string
		//length variable applicable for array
		
		String s1 = "ababab";
		System.out.println(s1.replace("ab", "cd"));
		
		String s2= "abcdefgh";
		System.out.println(s2.substring(2));
		System.out.println(s2.substring(1, 3));
		System.out.println(s1.subSequence(2, 3));
		
		System.out.println(s2.indexOf('z'));
		System.out.println(s1.indexOf('b'));
		System.out.println(s2.indexOf("cd", 1));
		System.out.println(s1.lastIndexOf('a'));
		
		
		Scanner scan =new Scanner(System.in);
		String name = scan.next().toLowerCase().trim();
		
		if(name.equals("hydrabad"))
			System.out.println("Hello Hydrabadiates");
		else if(name.equals("buldana"))
			System.out.println("Hello Buldanaites");
		else
			System.out.println("Enter valid city name");
	}

}

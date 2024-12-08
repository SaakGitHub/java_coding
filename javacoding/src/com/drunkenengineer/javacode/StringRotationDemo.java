package com.drunkenengineer.javacode;

public class StringRotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "cloudtech";
		//String s2 = "techcloud";
		String s2 = "cloudcloud";
		
		if (s1.length() != s2.length()) {
			System.out.println("s2 is not rotation of s1");
		} else {
			s1 = s1 + s1;
			if (s1.indexOf(s2) != -1) {
				System.out.println("s2 is rotatio of s1");
			} else {
				System.out.println("s2 is not rotation of s1");
			}

		}

	}

}

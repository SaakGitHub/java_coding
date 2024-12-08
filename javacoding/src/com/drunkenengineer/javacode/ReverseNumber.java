package com.drunkenengineer.javacode;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1234;
		int num2 = 1234;
		int d , rev=0;
		while (num!=0) {
			d= num %10;
			rev = rev *10 +d;
			num = num/10;
		}
		
		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer(String.valueOf(num2));
		int rev2 = Integer.valueOf(sb.reverse().toString());
		System.out.println(rev2);
		
		

	}

}

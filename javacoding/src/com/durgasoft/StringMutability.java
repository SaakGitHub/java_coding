package com.durgasoft;

public class StringMutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= new String("saakib");
		s.concat(" minhaj");
		System.out.println(s);
		
		
		StringBuffer sb = new StringBuffer("saakib");
		sb.append(" Minhaj");
		System.out.println(sb);
	}

}

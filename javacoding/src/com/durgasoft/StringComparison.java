package com.durgasoft;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("durga");
		String s2=new String("durga");
		System.out.println("String comparison w.r.t. == && .equals()");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("======================================");
		
		StringBuffer sb1=new StringBuffer("durga");
		StringBuffer sb2=new StringBuffer("durga");
		System.out.println("StringBuffer comparison w.r.t. == && .equals()");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));

	}

}

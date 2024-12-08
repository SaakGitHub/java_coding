package com.drunkenengineer.javacode;

import java.lang.reflect.Method;

class Student {

	public String getName() {
		return null;
	}

	public int getMarks() {
		return 10;
	}

}

class Test {
	public static void main(String[] args) throws Exception {

		int count = 0;
		Class c = Class.forName("Student");
		Method[] m = c.getDeclaredMethods();
		for (Method m1 : m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Number of methods are : " + count);

		Student s1 = new Student();
		Class c1 = s1.getClass();
		Student s2 = new Student();
		Class c2 = s2.getClass();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
	}
}

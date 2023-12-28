package com.javaProgram;

public class Normal {

	public static void main(String[] args) {
		
		String s="Hello";
		String s2="Hello";
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		String str=new String("Hello");
		System.out.println(s==str);
		System.out.println(s.equals(str));
		StringBuffer sBuffer=new StringBuffer("Hello");
		
		System.out.println(s.equals(sBuffer));
	}

}

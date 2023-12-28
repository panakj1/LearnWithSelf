package com.javaProgram;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="abcdefg";
		String xyz="";
		IntStream.range(0, str.length())
		.mapToObj(i->
			str.charAt(i)+"Z")		
		.collect(Collectors.toList()).forEach(System.out::print);
			String n="";
			for(int i=0;i<str.length();i++) {
				n=str.charAt(i)+n;
			}
			System.out.println("Reverse String---"+n);
	}

}

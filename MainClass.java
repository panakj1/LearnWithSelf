package com.javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		String[] str= {"24","52","62","72"};
		
		List<Integer> list=Arrays.stream(str).map(a->Integer.parseInt(a)+10).collect(Collectors.toList());
		System.out.println(list);
		String value="pankaj";
		String reversedStr="";
		List<String> result=Arrays.stream(value.split("")).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		for (int i = 0; i < value.length(); i++) {
			  reversedStr = value.charAt(i) + reversedStr;
			  
			}
		System.out.println(reversedStr);
	}

}

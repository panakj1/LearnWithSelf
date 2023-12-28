package com.javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question {

	public static void main(String[] args) {
		
		String s="sac d saser";
		String result="";
		List<String> value=Arrays.stream(s.split(" ")).map(a->a).collect(Collectors.toList());
		value.stream().map(a->a.charAt(0)).map(a->a.toUpperCase(a)).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println(value);
		for(int i=0;i<value.size();i++) {
        	result =result+value.get(i).charAt(0);
        }
        System.out.println(result.toUpperCase());
	}

}

package com.issue;

import java.util.Arrays;

public class Que {

	public static void main(String[] args) {
		String[] arr= {"3","30","34","5","9","10"};
		System.out.println(record(arr));

	}
	
	public static String record(String[] arr) {
		
		Arrays.sort(arr, (num1,num2)->(num2+num1).compareTo(num1+num2));
		String str="";
		for(String value:arr) {
			str=str+value;
		}
		return str;
	}

}

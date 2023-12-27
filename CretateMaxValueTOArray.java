package com.issue;

import java.util.Arrays;

public class CretateMaxValueTOArray {

	public static void main(String[] args) {
		
		String[] arr= {"1","4","2","3"};
		Arrays.sort(arr, (a,b)->(b+a).compareTo(a+b));
		String value="";
		for(String result:arr) {
			value=value+result;
		}
      System.out.println(value);
	}

}

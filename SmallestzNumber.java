package com.issue;

import java.util.Arrays;

public class SmallestzNumber {

	public static void main(String[] args) {
		String[] arr= {"1","4","2","3","0"};
//		Arrays.sort(arr, (a,b)->(a+b).compareTo(b+a));//create min value
		Arrays.sort(arr, (a,b)->(b+a).compareTo(a+b));//create max value
		String value="";
		for(String result:arr) {
			value=value+result;
		}
      System.out.println(value);
	}

	}



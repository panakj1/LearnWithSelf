package com.javaProgram;

import java.util.Arrays;

public class SumOfList {

	public static void main(String[] args) {
		
		Integer[] result= {2,4,1,5,6,9};
		Integer value=Arrays.stream(result).sorted().limit(3).reduce(0,Integer::sum);
		System.out.println(value);
	}

}

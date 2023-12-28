package com.javaProgram;

import java.util.Arrays;

public class OtherPro {
//output 1,11,14,17,101
	public static void main(String[] args) {
		
		int[] result={56, 23, 78, 14, 98, 11, 876, 45, 234, 101, 9876, 17, 87, 1,12};
		Arrays.stream(result).boxed().map(a->a+"").filter(a->a.startsWith("1")).map(a->Integer.parseInt(a))
		.sorted().forEach(System.out::println);
          
         
	}

}
//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//Input : {56, 23, 78, 14, 98, 11, 876, 45, 234, 101, 9876, 17, 87, 1,12}
//Output : {1, 11, 14, 17, 101}
package com.javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckQuestion {

	public static void main(String[] args) {
		
		String s="Pankaj";
		Map<String, Long> map=Arrays.stream(s.split(""))
				.collect(Collectors
						.groupingBy(a->a.toString(),
								Collectors.counting()));
		System.out.println(map);
		

	}

}

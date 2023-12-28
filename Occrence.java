package com.javaProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Occrence {

	public static void main(String[] args) {
		
		String input ="sssooooowwjjjiiiiq";
		Map<String,Long> map=Arrays.stream(input.split("")).collect(Collectors.groupingBy(a->a,Collectors.counting()));
		List<String> result=map.entrySet().stream().filter(a->a.getValue()==1).map(a->a.getKey()).collect(Collectors.toList());
		List<Long> record=map.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList());
		map.entrySet().stream().forEach(a->System.out.println(a));
		String  maxEntry=Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
		System.out.println(maxEntry);
		map.entrySet().stream().sorted((a,b)->b.getValue().intValue()-a.getValue().intValue()).map(a->a.getKey()).limit(1).collect(Collectors.toList()).forEach(System.out::println);
		Integer[] gg= {1,2,3,4};
		int n=Arrays.stream(gg).limit(3).reduce(0, Integer::sum);
	}

}

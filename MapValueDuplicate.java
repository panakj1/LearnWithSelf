package com.javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapValueDuplicate {

	public static void main(String[] args) {
		String[] str= {"abc","abc","xyz"};
		Map<String,Long> map=Arrays.stream(str).collect(Collectors.groupingBy(a->a,Collectors.counting()));
        List<String> abc=map.entrySet().stream().filter(a->a.getValue()>1).map(a->a.getKey()).collect(Collectors.toList());
	}

}

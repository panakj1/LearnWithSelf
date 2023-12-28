package com.test.in;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfHighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list=Arrays.asList(1,1,3,4,4,5,6,4,4,1);
    // List<Integer> set=list.stream().filter(n->list.stream().filter(a->a==n).count()>1).collect(Collectors.toList());
     Map<Object, Long> map=list.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
     Object maxEntry = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();      
     System.out.println("maxEntry = " + maxEntry);
     map.entrySet().forEach(a->System.out.println(a.getKey()+""+a.getValue()));
	}
}

package com.issue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		
		Integer[] arr= {8,2,1,3,4,5,5,4,3,7};
		Set<Integer> set=new HashSet<Integer>();
		List<Integer> list=Arrays.stream(arr).filter(i->!set.add(i)).collect(Collectors.toList());
         System.out.println(list);
	}

}

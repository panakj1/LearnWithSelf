package com.test.in;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list=Arrays.asList(1,1,3,4,4,5,6);
     List<Integer> set=list.stream().filter(n->list.stream().filter(a->a==n).count()>1).collect(Collectors.toList());
     List<Integer> uni=list.stream().filter(n->list.stream().filter(a->a==n).count()==1).collect(Collectors.toList());
     Set<Integer> sets=list.stream().filter(n->list.stream().filter(a->a==n).count()>1).collect(Collectors.toSet());
     System.out.println(set);
     System.out.println(uni);
     System.out.println(sets);
	}

}

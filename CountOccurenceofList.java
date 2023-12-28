package com.test.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurenceofList {

	public static void main(String args[]) {
	AssignDisputeVO data=new AssignDisputeVO();
	List<AssignDisputeVO> recordValue=data.getAssignDisputeDetails();
	Map<String, Long> record=recordValue.stream().collect(Collectors.groupingBy(AssignDisputeVO::getcompany,Collectors.counting()));
	System.out.println(record);
	String str="Pankaj Tyya g i";
	List<Character> list=new ArrayList<Character>();
	for(int a=0;a<str.length();a++) {
		list.add(str.charAt(a));
	}
	//list=list.stream().filter(a->a!=' ').collect(Collectors.toList());
	Map<Character, Long> map=list.stream().filter(a->a!=' ').collect(Collectors.groupingBy(a->a,Collectors.counting()));
	System.out.println(map);
	
}
}

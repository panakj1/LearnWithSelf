package com.test.in;

import java.util.ArrayList;
import java.util.List;

public class MoreThenOneThousandRecord {
	
	public static void main(String args[]) {
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("12");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("8");
		list.add("10");
		list.add("11");
		list.add("9");
		list.add("91");
		list.add("20");
		list.add("1003");
		list.add("001");
		list.add("202");
		list.add("3");
		list.add("4");
		list.add("1");
		int partition=5;
		List<List<String>> getRecord=new ArrayList<>();
		for(int i=0;i<list.size();i+=partition) {
			getRecord.add(list.subList(i, Math.min(i+partition,list.size())));
		}
		for(List<String> l :getRecord) {
			System.out.println(l);
		}
		
	}
	//https://www.youtube.com/watch?v=qVeXKiPGEhU&list=PLZqV_M3p_p13nnXwJHUF-Ii3Bvd9t_Dgt&index=4

}

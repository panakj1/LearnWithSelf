package com.javaProgram;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapRecord {

	public static void main(String[] args) {
		
		
		TreeMap<String,Integer> mapResult=new TreeMap<String,Integer>();
		mapResult.put("1", 25);
		mapResult.put("6", 3);
		mapResult.put("12", 6);
		mapResult.put("1", 10);
		System.out.println(mapResult);

	}

}

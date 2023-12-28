package com.javaProgram;

import java.util.HashMap;
import java.util.TreeMap;

public class MapResult {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(2, "XYZ");
		map.put(10, "XYZ");
		map.put(2, "ABC");
		map.put(null, "XYZ");
		map.put(9, "TEST");
		map.put(2, "GURU");
		//map.entrySet().stream().forEach(System.out::println);
	
	TreeMap<Integer,String> linkMap=new TreeMap<Integer,String>();
	linkMap.put(2, "XYZ");
	linkMap.put(10, "XYZ");
	linkMap.put(2, "ABC");
	//linkMap.put(null, "XYZ");
	linkMap.put(9, "TEST");
	linkMap.put(2, "GURU");
	linkMap.entrySet().stream().forEach(System.out::println);

}
}
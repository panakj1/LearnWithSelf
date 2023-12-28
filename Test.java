package com.javaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.javaProgram.Model.Emp;

public class Test {

	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "GURU");
		map.put(3, "Tyagi");
		map.put(2, "Kumar");
		list.add(new Emp("Pankaj","Depart",1,map));
		list.add(new Emp("Tyagi","Public",8,map));
		list.add(new Emp("Kumar","Private",2,map));
		//list.stream().map(a->a.getMap()).sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
			//	(oldValue, newValue) -> oldValue, LinkedHashMap::new));
		

	}

}

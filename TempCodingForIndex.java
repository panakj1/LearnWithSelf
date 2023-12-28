package com.javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TempCodingForIndex {

	public static void main(String[] args) {
		
		Integer[] result= {21,31,15,17,101,110,45,63,89,76};
		
		List<String> value=IntStream.range(1, result.length).filter(i->i%2==0).mapToObj(i->i+"-"+result[i]).collect(Collectors.toList());
        //System.out.println(value);
        
        String dcString="A";
        //IntStream.range(0, dcString.toCharArray().length).mapToObj(a->dcString.toCharArray()[++a]).collect(Collectors.toList()).forEach(System.out::print);
        
	}

}

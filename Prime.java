package com.test.in;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prime {

	public static void main(String[] args) {
		
		IntStream stream = IntStream.range(1, 100); 
		List<Integer> primes = stream.filter(Prime::isPrime)
					.boxed()
					.collect(Collectors.toList());
		System.out.println(primes);
		
		System.out.println("*********************************");
		int[] value= {1,3,4,5,6,2,7,8,9};
		Arrays.stream(value).filter(Prime::isPrime).boxed().collect(Collectors.toList())
		.forEach(System.out::println);
		System.out.println("*********************************");
	}
	public static boolean isPrime(int i)
	{
	    IntPredicate isDivisible = index -> i % index == 0;
	    return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
	}

}

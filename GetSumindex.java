package com.javaProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.javaProgram.Model.Student;
import com.javaProgram.Model.StudentAddRecord;

public class GetSumindex {

	public static void main(String[] args) {
		StudentAddRecord stu=new StudentAddRecord();
		List<Student> list=stu.getDetails();
		Map<String, Double> sumFees=list.stream().collect(Collectors.groupingBy(a->a.getDeprtment(),Collectors.summingDouble(x->x.getFees())));
		System.out.println(sumFees);
		List<String> name=list.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(name);
		List<String> indexwithvalue=IntStream.range(0, list.size()).mapToObj(index->index+"---"+list.get(index)).collect(Collectors.toList());
		System.out.print(indexwithvalue);
		
		List<Integer> onlyIndex=IntStream.range(0, list.size()).mapToObj(index->index).collect(Collectors.toList());		
		System.out.println("index--"+onlyIndex);
		int[] record= {2,3,7};
		int sumValue=Arrays.stream(record).boxed().reduce(0, Integer::sum);
		System.out.println("Sum--"+sumValue);

	}

}

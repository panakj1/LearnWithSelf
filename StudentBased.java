package com.javaProgram;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.javaProgram.Model.Student;
import com.javaProgram.Model.StudentAddRecord;

public class StudentBased {

	public static void main(String[] args) {
		StudentAddRecord stu=new StudentAddRecord();
		List<Student> list=stu.getDetails();
		List<Student> result=list.stream()
				.sorted(Comparator.comparingDouble(a->a.getFees()))
				.collect(Collectors.toList());
		List<Student> result1=list.stream()
				.sorted((a,b)->b.getRollNumber()-a.getRollNumber())
				.collect(Collectors.toList());
		System.out.println(result1);

	}

}

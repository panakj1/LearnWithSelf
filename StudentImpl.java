package com.test.in;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentImpl {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(102,1,"Panakj","Tyagi"));
		list.add(new Student(102,3,"Panakj","Tyagi"));
		list.add(new Student(102,4,"Panakj","Tyagi"));
		list.add(new Student(88,3,"Panakj","Tyagi"));
		list.add(new Student(101,2,"kumar","Tyagi"));
		list.add(new Student(101,4,"Panakj","Tyagi"));
		list.add(new Student(99,1,"Panakj","Tyagi"));
		list.add(new Student(100,1,"Panakj",(String) "Tyagi"));
		List<Student> sorted = 
			    list.stream()
			        .sorted(Comparator.comparingLong(Student::getStudentVersion).reversed()).collect(Collectors.toList());
		System.out.println(sorted);
		Optional<Student> abc = sorted.stream()
				.filter(Student -> Student.getStudentId() != 0 && Student.getStudentVersion() != 0)
				.max(Comparator.comparingLong(Student -> Student.getStudentId()));
	System.out.println(abc);
		
	}

}

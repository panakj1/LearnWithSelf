package com.javaProgram.Model;

import java.util.ArrayList;
import java.util.List;

public class StudentAddRecord {
	
	
	public List<Student> getDetails(){
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("Pankaj","Beanch",20.00,1));
		list.add(new Student("Govind","HP",200.10,6));
		list.add(new Student("Amresh","Backend",20.05,10));
		list.add(new Student("Ashish","Backend",2.01,9));
		list.add(new Student("Sashi","Backend",19.00,1));
		list.add(new Student("Kaviraj","TypeSeting",23.00,1));
		list.add(new Student("Deenanath","Backend",20.00,18));
		list.add(new Student("Sunny","UI",20.00,21));
		list.add(new Student("Vikash","Testing",27.05,11));
		list.add(new Student("Sandeep","Backend",200.03,9));
		return list;
	}

}

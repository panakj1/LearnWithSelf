package com.test.in;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MultipleSort {
	
	public static void main(String args[]) {
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp("Pankaj",1,"MBA",10.00,100));
		list.add(new Emp("Amit",2,"MCA",10.00,100));
		list.add(new Emp("Kumar",1,"BCA",10.00,100));
		list.add(new Emp("Deepa",1,"PGDM",10.00,300));
		list.add(new Emp("Aayansh",3,"MBA",10.00,400));
		list.add(new Emp("Shivom",1,"MBA",10.00,100));
		list.add(new Emp("Ranu",1,"LKG",10.00,400));
		list.add(new Emp("Tanu",1,"UKG",10.00,100));
		list.add(new Emp("Shivani",10,"MBA",10.00,200));
		list.add(new Emp("Aashi",1,"MBA",10.00,200));
		Comparator<Emp> sortByRollNumber=(a,b)->Long.compare(b.getRollNumber(),a.getRollNumber());
		Comparator<Emp> sortByAge=(a,b)->Integer.compare(b.getAge(),a.getAge());
		//list.stream().sorted(sortByRollNumber.thenComparing(sortByAge)).forEach(a->System.out.println(a));
		Optional<Emp> actualRecord=list.stream().sorted(sortByRollNumber.thenComparing(sortByAge)).findFirst();
		System.out.println(actualRecord);
		
	}

}

package com.test.in;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountRecord {

	public static void main(String[] args) {
		AssignDisputeVO data=new AssignDisputeVO();
		List<AssignDisputeVO> recordValue=data.getAssignDisputeDetails();
		Map<String, Long> recod=recordValue.stream().collect(Collectors.groupingBy(AssignDisputeVO::getcompany,Collectors.counting()));
		Map<String, List<AssignDisputeVO>> compareValue=recordValue.stream().collect(Collectors.groupingBy(AssignDisputeVO::getSpecilist,Collectors.toList()));
		for(Map.Entry<String, List<AssignDisputeVO>> entry : compareValue.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			Map<String, List<AssignDisputeVO>> companyValue=entry.getValue().stream().collect(Collectors.groupingBy(AssignDisputeVO::getcompany,Collectors.toList()));
			for(Map.Entry<String, List<AssignDisputeVO>> entryValue : companyValue.entrySet()) {
				Long assigned=entryValue.getValue().stream().filter(a->a.getAssigned().equals("1")).count();
				System.out.println(assigned);
			}
		}
	}

}

package com.test.in;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AssignDisputeList {
	
	public static void main(String args[]) {
		Long countRecord=0L;
		Long count=0L;
		List<AssignDisputeVO> unassignedValue=new ArrayList<AssignDisputeVO>();;
	AssignDisputeVO data=new AssignDisputeVO();
	Long assignedValue=0L;
	List<AssignDisputeVO> recordValue=data.getAssignDisputeDetails();
	//List<AssignDisputeVO> getDatial=getDatials.stream().filter(a->Objects.nonNull(a.getSpecilist())).collect(Collectors.toList());
	//getDatial.forEach(a->System.out.println(a));
	Map<String,List<AssignDisputeVO>> getDetails=recordValue.stream().filter(a->Objects.nonNull(a.getSpecilist())).collect(Collectors.groupingBy(AssignDisputeVO::getSpecilist,Collectors.toList()));
	//getDatial.forEach(t,v->System.out.println("Key"+k+"-"+v));
	for(Map.Entry<String, List<AssignDisputeVO>> entry : getDetails.entrySet()) {
		//System.out.println(entry.getKey()+"-"+entry.getValue());
		assignedValue=0L;
		List<AssignDisputeVO> getValue=entry.getValue();
		//getValue.forEach(a->System.out.println(a));
		countRecord=getValue.stream().count();
		//count+=countRecord;
		//System.out.println(countRecord);
		Map<String,List<AssignDisputeVO>> getCompany=getValue.stream().collect(Collectors.groupingBy(AssignDisputeVO::getcompany,Collectors.toList()));
		for(Map.Entry<String, List<AssignDisputeVO>> getComp : getCompany.entrySet()) {
			
			assignedValue +=getComp.getValue().stream().filter(a->a.getAssigned().equals("1")).count();
			unassignedValue=getComp.getValue().stream().filter(a->a.getUnassigned().equals("1")).collect(Collectors.toList());
			unassignedValue.size();
		}
		
	}
	System.out.println(assignedValue);
	
	}
}

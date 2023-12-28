package com.test.in;

import java.util.ArrayList;
import java.util.List;

public class AssignDisputeVO {
	
	private String specilist;
	private String assigned;
	private String unassigned;
	private Long seqNumber;
	private String company;
	private String total;
	
	public String getSpecilist() {
		return specilist;
	}
	public void setSpecilist(String specilist) {
		this.specilist = specilist;
	}
	public String getAssigned() {
		return assigned;
	}
	public void setAssigned(String assigned) {
		this.assigned = assigned;
	}
	public String getUnassigned() {
		return unassigned;
	}
	public void setUnassigned(String unassigned) {
		this.unassigned = unassigned;
	}
	public Long getSeqNumber() {
		return seqNumber;
	}
	public void setSeqNumber(Long seqNumber) {
		this.seqNumber = seqNumber;
	}
	public String getcompany() {
		return company;
	}
	public void setcompany(String company) {
		this.company = company;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public AssignDisputeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssignDisputeVO(String specilist, String assigned, String unassigned, Long seqNumber, String company) {
		super();
		this.specilist = specilist;
		this.assigned = assigned;
		this.unassigned = unassigned;
		this.seqNumber = seqNumber;
		this.company = company;
	}
	
	public List<AssignDisputeVO>  getAssignDisputeDetails(){
		List<AssignDisputeVO> record=new ArrayList<AssignDisputeVO>();
		record.add(new AssignDisputeVO("Computer","1","0",100L,"HCL"));
		record.add(new AssignDisputeVO("Computer","0","1",111L,"HCL"));
		record.add(new AssignDisputeVO("Computer","1","0",109L,"HCL"));
		record.add(new AssignDisputeVO("Computer","0","1",100L,"HCL"));
		record.add(new AssignDisputeVO("Math","0","1",102L,"HCL"));
		record.add(new AssignDisputeVO("Computer","0","1",100L,"HCL"));
		record.add(new AssignDisputeVO("Computer","1","0",101L,"BPL"));
		record.add(new AssignDisputeVO("Art","1","0",103L,"BPL"));
		record.add(new AssignDisputeVO("Computer","0","1",104L,"BPL"));
		record.add(new AssignDisputeVO("Computer","0","1",112L,"HCL"));
		record.add(new AssignDisputeVO("HR","0","1",100L,"TCS"));
		record.add(new AssignDisputeVO("HR","1","0",100L,"TCS"));
		record.add(new AssignDisputeVO("Computer","0","1",100L,"TCS"));
		record.add(new AssignDisputeVO("HR","0","1",100L,"TCS"));
		
		return record;
	}
	@Override
	public String toString() {
		return "AssignDisputeVO [specilist=" + specilist + ", assigned=" + assigned + ", unassigned=" + unassigned
				+ ", seqNumber=" + seqNumber + ", company=" + company + ", total=" + total + "]";
	}


}

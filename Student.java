package com.test.in;

public class Student {
	
	private Integer studentId;
	private int studentVersion;
	private String name;
	private String latName;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public int getStudentVersion() {
		return studentVersion;
	}
	public void setStudentVersion(int studentVersion) {
		this.studentVersion = studentVersion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLatName() {
		return latName;
	}
	public void setLatName(String latName) {
		this.latName = latName;
	}
	
	public Student() {
		
	}
	public Student(Integer studentId, int studentVersion, String name, String latName) {
		super();
		this.studentId = studentId;
		this.studentVersion = studentVersion;
		this.name = name;
		this.latName = latName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentVersion=" + studentVersion + ", name=" + name
				+ ", latName=" + latName + "]";
	}
	

}

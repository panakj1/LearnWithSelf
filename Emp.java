package com.test.in;

public class Emp {
	
	private String empName;
	private int age;
	private String departName;
	private double salary;
	private int rollNumber;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Emp(String empName, int age, String departName, double salary, int rollNumber) {
		super();
		this.empName = empName;
		this.age = age;
		this.departName = departName;
		this.salary = salary;
		this.rollNumber = rollNumber;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", age=" + age + ", departName=" + departName + ", salary=" + salary
				+ ", rollNumber=" + rollNumber + "]";
	}
	

}

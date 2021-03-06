package com.training.io;

import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		
	}
	
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}


package com.cogent.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String employeeName;
	private String employeePosition;
	private int employeeSalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Long employeeId, String employeeName, String employeePosition,  int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.employeeSalary = employeeSalary;
	}
	
	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePosition() {
		return employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePosition="
				+ employeePosition + ", employeeSalary=" + employeeSalary + "]";
	}
}

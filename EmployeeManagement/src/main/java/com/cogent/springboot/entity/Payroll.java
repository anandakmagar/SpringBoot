package com.cogent.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payroll_table")
public class Payroll {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long payrollId;
	private Long employeeId;
	private int hoursWorked;
	private int hourlyRate;
	public Payroll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payroll(Long payrollId, Long employeeId, int hoursWorked, int hourlyRate) {
		super();
		this.payrollId = payrollId;
		this.employeeId = employeeId;
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	public Long getPayrollId() {
		return payrollId;
	}
	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	@Override
	public String toString() {
		return "Payroll [payrollId=" + payrollId + ", employeeId=" + employeeId + ", hoursWorked=" + hoursWorked
				+ ", hourlyRate=" + hourlyRate + "]";
	}
	
	
	
	
}

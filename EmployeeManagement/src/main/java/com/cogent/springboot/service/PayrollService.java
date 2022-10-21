package com.cogent.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Payroll;

@Service
public interface PayrollService {
	public Payroll addPayroll(Payroll payroll);
	public List<Payroll> viewAllPayrolls();
	public void deleteByPayrollId(Long payrollId);
}

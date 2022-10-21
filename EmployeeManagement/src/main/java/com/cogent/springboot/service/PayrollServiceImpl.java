package com.cogent.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Payroll;
import com.cogent.springboot.repository.PayrollRepo;

@Service
public class PayrollServiceImpl implements PayrollService{
	@Autowired
	PayrollRepo payrollRepo;

	@Override
	public Payroll addPayroll(Payroll payroll) {
		return payrollRepo.save(payroll);
	}

	@Override
	public List<Payroll> viewAllPayrolls() {
		return payrollRepo.findAll();
	}

	@Override
	public void deleteByPayrollId(Long payrollId) {
		payrollRepo.deleteById(payrollId);
	}

}

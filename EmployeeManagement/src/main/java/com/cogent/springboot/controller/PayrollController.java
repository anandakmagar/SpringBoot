package com.cogent.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.springboot.entity.Payroll;
import com.cogent.springboot.service.PayrollService;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {
	@Autowired
	PayrollService payrollService;
	
	@PostMapping("/add-payroll")
	public Payroll addPayroll(@RequestBody Payroll payroll) {
		return payrollService.addPayroll(payroll);
		
	}
	
	@GetMapping("/view-payrolls")
	public List<Payroll> viewAllPayrolls(){
		return payrollService.viewAllPayrolls();
	}
	
	@DeleteMapping("/delete-payroll/{id}")
	public String deleteByPayrollId(@PathVariable("id") Long payrollId) {
		payrollService.deleteByPayrollId(payrollId);
		return "Record has been deleted successfully";
	}
	
}

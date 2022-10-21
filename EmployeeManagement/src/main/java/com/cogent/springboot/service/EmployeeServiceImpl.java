package com.cogent.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.springboot.entity.Employee;
import com.cogent.springboot.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> viewAllEmployees() {
		return employeeRepo.findAll();
	}
	
	@Override
	public void deleteByEmployeeId(Long employeeId) {
		employeeRepo.deleteById(employeeId);
	}
	
	

}

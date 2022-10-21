package com.cogent.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

//import com.cogent.springboot.controller.employeeId;
import com.cogent.springboot.entity.Employee;

@Service
public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public List<Employee> viewAllEmployees();
	public void deleteByEmployeeId(Long employeeId);
}

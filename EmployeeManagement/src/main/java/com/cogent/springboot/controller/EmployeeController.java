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

import com.cogent.springboot.entity.Employee;
import com.cogent.springboot.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/add-employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	}
	
	@GetMapping("/view-employees")
	public List<Employee> viewAllEmployees() {
		return employeeService.viewAllEmployees();
	}
	
	@DeleteMapping("/delete-employee/{id}")
	public String deleteByEmployeeId(@PathVariable("id") Long employeeId) {
		employeeService.deleteByEmployeeId(employeeId);
		return "Record has been deleted successfully";
	}
}

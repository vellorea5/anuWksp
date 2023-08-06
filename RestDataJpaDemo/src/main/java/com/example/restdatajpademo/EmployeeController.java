package com.example.restdatajpademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	// read all employees
	@RequestMapping("/employees")
	public List<Employee> getEmployees() {
		
		List<Employee> employees = employeeService.getEmployees();
		return employees;
	}
	
	// read specific employee
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		Employee employee = employeeService.getEmployee(id);
		return employee;
	}
	
	// add new employee
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		employee = employeeService.addEmployee(employee);
		return employee;
	}
}

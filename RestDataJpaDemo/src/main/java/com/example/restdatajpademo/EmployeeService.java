package com.example.restdatajpademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees() {
		List<Employee> empList = (List<Employee>)employeeRepository.findAll();
		return empList;
	}
	
	public Employee getEmployee(int id) {
		Employee employee = employeeRepository.findById(id).get();
		return employee;
	}
	
	public Employee addEmployee(Employee employee) {
		employee = employeeRepository.save(employee);
		return employee;
	}
}

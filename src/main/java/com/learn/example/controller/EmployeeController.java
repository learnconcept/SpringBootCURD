package com.learn.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.example.entity.Employee;
import com.learn.example.modle.EmployeeModel;
import com.learn.example.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	/*
	 * @Autowired Employee employee;
	 */
	
	
	@PostMapping("/insert")
	public void saveEmp(@RequestBody EmployeeModel empMod) {
		Employee employee = new Employee();
		employee.setEmpAdd(empMod.getAdd());
		employee.setEmpEmail(empMod.getEmail());
		employee.setEmpName(empMod.getName());
		
		employeeRepository.save(employee);
	}
}

package com.learn.example.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.example.entity.Employee;
import com.learn.example.entity.EmployeeAccount;
import com.learn.example.exception.RecordNotFound;
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
	public void saveEmp(@Valid @RequestBody EmployeeModel empMod) {
		Employee employee = new Employee();
		employee.setEmpAdd(empMod.getAdd());
		employee.setEmpEmail(empMod.getEmail());
		employee.setEmpName(empMod.getName());
		employee.setEmpAccount(empMod.getEmpAccount());
		employeeRepository.save(employee);
	}
	
	@GetMapping("/getAllUsers")
	public List<EmployeeModel> getAllUserDetails(){
		List<Employee> listEntity=employeeRepository.findAll();
		List<EmployeeModel> result = listEntity.stream().map(temp -> {
			EmployeeModel obj = new EmployeeModel();
            obj.setName(temp.getEmpName());
            obj.setEmail(temp.getEmpEmail());
            obj.setId(temp.getEmpId());
            obj.setAdd(temp.getEmpAdd());
            obj.setEmpAccount(temp.getEmpAccount());
            return obj;
        }).collect(Collectors.toList());
		return result;
	}
	
	@GetMapping("/getById/{id}")
	public Employee getDetailsById(@PathVariable("id") Integer id){
			return this.employeeRepository.findById(id)
			.orElseThrow(()->new RecordNotFound("EmployeeDetails not found "+id));
			/*
			 * EmployeeModel empModel = new EmployeeModel();
			 * empModel.setAdd(emp.get().getEmpAdd());
			 * empModel.setEmail(emp.get().getEmpEmail());
			 * empModel.setId(emp.get().getEmpId());
			 * empModel.setName(emp.get().getEmpName()); return empModel;
			 */
	}
	
	@PostMapping("updateRecord")
	public Employee updateEmpDetails(@RequestBody EmployeeModel employeeModel) {
		Employee emp=employeeRepository.findById(employeeModel.getId())
				.orElseThrow(()->new RecordNotFound("EmployeeDetails not found"));
		emp.setEmpAdd(employeeModel.getAdd());
		emp.setEmpEmail(employeeModel.getEmail());
		emp.setEmpName(employeeModel.getName());
		return employeeRepository.save(emp);
	}
}

package com.learn.example;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.learn.example.entity.Employee;
import com.learn.example.entity.EmployeeAccount;
import com.learn.example.modle.EmployeeModel;

public class Example {
	public static void main(String arg[]) {
		EmployeeModel emp = new EmployeeModel();
		ArrayList<EmployeeAccount> list =new ArrayList<>();
		EmployeeAccount acc = new EmployeeAccount("12345678");
		EmployeeAccount acc1 = new EmployeeAccount("87654321");
		list.add(acc1);
		list.add(acc);
		emp.setEmpAccount(list);
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(emp));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

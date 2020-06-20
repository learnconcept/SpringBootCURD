package com.learn.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	private String empName;
	private String empAdd;
	private String empEmail;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id", referencedColumnName = "empId" )
	private List<EmployeeAccount> empAccount;
	
	
	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, String empAdd, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
		this.empEmail = empEmail;
	}
	
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public List<EmployeeAccount> getEmpAccount() {
		return empAccount;
	}

	public void setEmpAccount(List<EmployeeAccount> empAccount) {
		this.empAccount = empAccount;
	}
}

package com.learn.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String accNumber;
	
	
	public EmployeeAccount(String accNumber) {
		super();
		this.accNumber = accNumber;
	}
	public EmployeeAccount() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	
}

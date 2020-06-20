package com.learn.example.modle;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeModel {
	
	private Integer id;
	@NotNull
	@Size(min=4, message = "Name should be minimum 4 characters")
	private String name;
	@NotNull
	@Size(min=2, message = "Address should be minimum 4 characters")
	private String add;
	@NotNull
	@Size(min=6, message = "Email should be minimum 4 characters")
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}

package com.thymleaf.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	private String roleName;

	

	public String getRoleName() {
		return roleName;
	}



	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}



	public Role() {
	
	}



	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}
	
	
	
	
	
}

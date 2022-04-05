package com.thymleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymleaf.model.Role;

public interface RoleRepo extends JpaRepository<Role, String> {

	
	public Role findByRoleName(String role_name);
}

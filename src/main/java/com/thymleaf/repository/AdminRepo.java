package com.thymleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymleaf.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, String> {

	
	public Admin findByLogin(String login);
	List<Admin> findByNomComplet(String nomComplet);
	
	
	
}

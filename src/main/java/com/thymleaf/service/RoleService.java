package com.thymleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.model.Role;
import com.thymleaf.repository.RoleRepo;

@Service
public class RoleService {

	
	@Autowired
	RoleRepo roleRepo;
	

	public Role saveRole(Role r) {
		
		return roleRepo.save(r);
	}
	
	
	
	public void delete(String id) {
		
		roleRepo.deleteById(id);
	}
	

	public List<Role> SelectAll(){
		
		return roleRepo.findAll();
	}
}

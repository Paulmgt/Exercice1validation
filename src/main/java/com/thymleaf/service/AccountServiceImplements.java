package com.thymleaf.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.thymleaf.model.Admin;
import com.thymleaf.model.Evaluation;
import com.thymleaf.model.Role;
import com.thymleaf.repository.AdminRepo;
import com.thymleaf.repository.RoleRepo;

@Transactional
@Service
public class AccountServiceImplements implements AccountService {

	
	@Autowired
	RoleRepo roleRepo;
	
	@Autowired
	AdminRepo adminRepo;
	
	
	@Bean
	// avoir un BCryptEncoder qui est initialisé une et une seule fois
	public BCryptPasswordEncoder getBCPE()
	{
		return new BCryptPasswordEncoder();
		
	}
	
	
	
	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		String hashPW=this.getBCPE().encode(admin.getPassword()); //hashPW = le mot de passe crypté
		System.out.print(hashPW);
		admin.setPassword(hashPW);
		return adminRepo.save(admin);
	}
	
	

	@Override
	public Role saveRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepo.save(role);
	}

	@Override
	public void addRoleToAdmin(String role_name, String login) {
		// TODO Auto-generated method stub
		
		Role role=roleRepo.findByRoleName(role_name);
		Admin admin=adminRepo.findByLogin(login);
		admin.getRoles().add(role);
	}

	@Override
	public Admin findAdminByUserrolename(String login) {
		// TODO Auto-generated method stub
		return adminRepo.findByLogin(login);
	}
	

	
}

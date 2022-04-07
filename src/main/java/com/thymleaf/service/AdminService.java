package com.thymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.model.Admin;
import com.thymleaf.repository.AdminRepo;

@Service
public class AdminService  {

	
	@Autowired
	AdminRepo adminRepo;
	
	public Admin saveAdmin(Admin a) {

		return adminRepo.save(a);
	}

	public Optional<Admin> searchById(String login) {
		return adminRepo.findById(login);

	}

	public void delete(String login) {

		adminRepo.deleteById(login);
	}

	public List<Admin> SelectAll() {

		return adminRepo.findAll();
	}
	
	public List<Admin> filtreNomComplet(String nomComplet){
		
		
		return adminRepo.findByNomComplet(nomComplet);
	}

	

	
	
	
}

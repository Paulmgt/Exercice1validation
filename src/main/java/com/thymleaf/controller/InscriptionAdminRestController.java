package com.thymleaf.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thymleaf.model.Admin;
import com.thymleaf.model.Role;
import com.thymleaf.service.AccountServiceImplements;

@RestController
//@RequestMapping("admin")
public class InscriptionAdminRestController {

//	@Autowired
//	AccountServiceImplements accountServiceImplements;
//	
//	
//	
//	
//	
//	
//	@PostMapping("")
//	public Admin saveOne(@RequestBody @Valid Admin admin)
//	{
//		return accountServiceImplements.saveAdmin(admin);
//	}
//	
//	@PostMapping("/{inscript}")
//	public void SaveRoletoUser(@RequestBody Role role,@PathVariable String login)
//	
//	{
//		 accountServiceImplements.addRoleToAdmin(role.getRoleName(),login);
//	}
	
}

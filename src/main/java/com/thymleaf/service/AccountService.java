package com.thymleaf.service;

import com.thymleaf.model.Admin;
import com.thymleaf.model.Role;

public interface AccountService {

	
	public Admin saveAdmin(Admin admin);
	public Role saveRole(Role role);
	public void addRoleToAdmin(String role_name, String login);
	public Admin findAdminByUserrolename(String login);
}

package com.thymleaf;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.thymleaf.model.Admin;
import com.thymleaf.model.Role;
import com.thymleaf.service.AccountServiceImplements;

@SpringBootApplication
public class Exercice1validationApplication implements CommandLineRunner {

	
	@Autowired
	AccountServiceImplements accountServiceImplements;
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Exercice1validationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Admin Admin1=new Admin("admin1", 1, "1234", "Admin1", "Espagne", "234553222", null);
		Role Role1=new Role("ORGANISATEUR");
		
		accountServiceImplements.saveAdmin(Admin1);
		accountServiceImplements.saveRole(Role1);
		accountServiceImplements.addRoleToAdmin( "ORGANISATEUR","admin1");
		
		
	}

}

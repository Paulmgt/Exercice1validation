package com.thymleaf.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfiig extends WebSecurityConfigurerAdapter{

	
	@Autowired
	private DataSource dataSource;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws   
	Exception {
		
//   	auth.inMemoryAuthentication().withUser("admin").password("{noop}1234").roles("GUIDE","ORGANISATEUR");		
//		auth.inMemoryAuthentication().withUser("user").password("{noop}1234").roles("USER");
		
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery(
						"select login as principal ,password, active as credentials from admin where login=?")
				.authoritiesByUsernameQuery(
						"select admin_login as principal , roles_role_name as role from admin_roles "
								+ "where admin_login=?")
				.passwordEncoder(bCryptPasswordEncoder).rolePrefix("ROLE_");
		
		
		// formatage pour la lisibilité 
		
		
//		auth.jdbcAuthentication().dataSource(dataSource)
//		.usersByUsernameQuery(
//				"select login as principal ,password, active as credentials from user where login=?")
//		.authoritiesByUsernameQuery(
//				"select user_login as principal , roles_role_name as role from user_roles "
//						+ "where user_login=?")
//		.passwordEncoder(bCryptPasswordEncoder).rolePrefix("ROLE_");
//		
		
// formatage pour la lisibilité 

		}
	
	
	// Pour les autorisations
	@Override
	protected void configure(HttpSecurity http) throws Exception { 
		http.formLogin();
		http.csrf().disable(); 
		
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/login/**").permitAll();// les url sont autorisé pour tout le monde (sans authentification)
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/recommforuser/**").permitAll();
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/sortieforuser/**").permitAll();
		http.authorizeRequests().antMatchers("/evaluation/**").permitAll();
		  // POST à l'url tasks/**  peut être effectuer uniquement par l'admin
		
		http.authorizeRequests().antMatchers("/evaltable/**").hasRole("ORGANISATEUR");
		http.authorizeRequests().antMatchers("/recommandation/**").hasRole("GUIDE");
		http.authorizeRequests().antMatchers("/sortie/**").hasRole("ORGANISATEUR");
		http.authorizeRequests().antMatchers("/recommandation/**").hasRole("ORGANISATEUR");
		http.authorizeRequests().antMatchers("/participant/**").hasRole("ORGANISATEUR");
		
//		http.authorizeRequests().antMatchers("/client/**").hasRole("SUPERVISOR");  
//		http.authorizeRequests().antMatchers(HttpMethod.POST,"/client/**").hasRole("ADMIN");  
//		http.authorizeRequests().antMatchers(HttpMethod.GET,"/client/**").hasRole("ADMIN");
//		http.authorizeRequests().antMatchers("/voyage/**").hasRole("SUPERVISOR");
//		http.authorizeRequests().antMatchers(HttpMethod.GET,"/voyage/**").hasRole("SUPERVISOR");
//		http.authorizeRequests().antMatchers(HttpMethod.DELETE,"/voyage/**").hasRole("SUPERVISOR");
		
		
		http.authorizeRequests().anyRequest().authenticated();         // autoriser l'accés des autres routage si l'utilisateur est authentifié
		
		
		
	} 
}

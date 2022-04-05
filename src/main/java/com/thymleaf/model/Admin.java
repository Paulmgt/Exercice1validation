package com.thymleaf.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String login;
	
	@NotNull(message = "veuillez renseigner ce champs")
	private int active;
	
	
	@NotEmpty(message = "veuillez renseigner ce champs")
	private String password;
	
	@NotEmpty(message = "veuillez renseigner ce champs")
	@Column(unique = true)
	@Size(min= 4, max = 50)
	private String nomComplet;
	
	@NotEmpty(message = "veuillez renseigner ce champs")
	@Lob
	private String adresse;
	
	@NotEmpty(message = "veuillez renseigner ce champs")
	private String telephone;
	
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role> roles;


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNomComplet() {
		return nomComplet;
	}


	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public Collection<Role> getRoles() {
		return roles;
	}


	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}


	


	public Admin(String login, @NotNull(message = "veuillez renseigner ce champs") int active,
			@NotEmpty(message = "veuillez renseigner ce champs") String password,
			@NotEmpty(message = "veuillez renseigner ce champs") @Size(min = 4, max = 50) String nomComplet,
			@NotEmpty(message = "veuillez renseigner ce champs") String adresse,
			@NotEmpty(message = "veuillez renseigner ce champs") String telephone, Collection<Role> roles) {
		super();
		this.login = login;
		this.active = active;
		this.password = password;
		this.nomComplet = nomComplet;
		this.adresse = adresse;
		this.telephone = telephone;
		this.roles = roles;
	}


	public Admin() {
	
	}


	@Override
	public String toString() {
		return "Admin [login=" + login + ", active=" + active + ", password=" + password + ", nomComplet=" + nomComplet
				+ ", adresse=" + adresse + ", telephone=" + telephone + ", roles=" + roles + "]";
	}
	
	
	
	
	
	
}

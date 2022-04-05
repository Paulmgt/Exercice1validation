package com.thymleaf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Participant implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty(message= "veuillez remplir ce champs")
	@Size(min= 4, max = 50)
	private String nom;
	
	@NotEmpty(message= "veuillez remplir ce champs")
	@Size(min= 4, max = 50)
	private String prenom;
	
	@NotEmpty(message= "veuillez remplir ce champs")
	private String email;
	
	@NotEmpty(message= "veuillez remplir ce champs")
	private String telephone;
	
	@NotNull(message= "veuillez remplir ce champs")
	private int age;
	
	
	@ManyToOne()
	@JoinColumn(name = "id_sortie" ,referencedColumnName = "id")
	private Sortie sortie;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Sortie getSortie() {
		return sortie;
	}


	public void setSortie(Sortie sortie) {
		this.sortie = sortie;
	}


	


	public Participant(@NotEmpty(message = "veuillez remplir ce champs") @Size(min = 4, max = 50) String nom,
			@NotEmpty(message = "veuillez remplir ce champs") @Size(min = 4, max = 50) String prenom,
			@NotEmpty(message = "veuillez remplir ce champs") String email,
			@NotEmpty(message = "veuillez remplir ce champs") String telephone,
			@NotNull(message = "veuillez remplir ce champs") int age, Sortie sortie) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.age = age;
		this.sortie = sortie;
	}


	public Participant() {
		
	}
	
	
	
	
	
}

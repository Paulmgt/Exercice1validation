package com.thymleaf.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Sortie implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 @NotEmpty(message= "veuillez remplir ce champs")
	 private String titre;
	 
	 @NotEmpty(message= "veuillez remplir ce champs")
	 private String destination;
	 
	 @NotEmpty(message= "veuillez remplir ce champs")
	 private String depart;
	 
	 @NotEmpty(message= "veuillez remplir ce champs")
	 private String retour;
	 
	 @NotNull(message= "veuillez remplir ce champs")
	 private double prix;
	 
	 
	  @NotEmpty(message= "veuillez remplir ce champs")
	 @Size(max =200)
	 private String description;
	 
	 
	@OneToMany(mappedBy = "sortie")
	private Set<Participant> participant;
	

	@OneToOne()
	@JoinColumn(name = "responsable" ,referencedColumnName = "nomComplet")
	private Admin admin;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getDepart() {
		return depart;
	}


	public void setDepart(String depart) {
		this.depart = depart;
	}


	public String getRetour() {
		return retour;
	}


	public void setRetour(String retour) {
		this.retour = retour;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Set<Participant> getParticipant() {
		return participant;
	}


	public void setParticipant(Set<Participant> participant) {
		this.participant = participant;
	}


	public Admin getAdmin() {
		return admin;
	}


	public void setAdmin(Admin admin) {
		this.admin = admin;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public Sortie(@NotEmpty String titre, @NotEmpty String destination, @NotEmpty String depart,
			@NotEmpty String retour, @NotNull double prix, @NotEmpty @Size(max = 200) String description,
			Set<Participant> participant, Admin admin) {
		super();
		this.titre = titre;
		this.destination = destination;
		this.depart = depart;
		this.retour = retour;
		this.prix = prix;
		this.description = description;
		this.participant = participant;
		this.admin = admin;
	}


	public Sortie() {
		super();
	}


	@Override
	public String toString() {
		return "Sortie [id=" + id + ", titre=" + titre + ", destination=" + destination + ", depart=" + depart
				+ ", retour=" + retour + ", description=" + description + ", participant=" + participant + ", admin="
				+ admin + "]";
	}
	
	 
	
	
	
}

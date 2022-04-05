package com.thymleaf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Evaluation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotEmpty (message= "veuillez remplir ce champs")
	@Size(max= 100) 
	private String titre;
	
	@NotNull(message= "veuillez remplir ce champs")
	@Size(min= 1, max= 5)
	private int note;
	
	@NotEmpty(message= "veuillez remplir ce champs")
	@Lob
	private String remarque;
	

	private String nom;

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

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getRemarque() {
		return remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	

	public Evaluation(@NotEmpty(message = "veuillez remplir ce champs") @Size(max = 100) String titre,
			@NotNull(message = "veuillez remplir ce champs") int note,
			@NotEmpty(message = "veuillez remplir ce champs") String remarque, String nom) {
		super();
		this.titre = titre;
		this.note = note;
		this.remarque = remarque;
		this.nom = nom;
	}

	public Evaluation() {
	
	}

	@Override
	public String toString() {
		return "Evaluation [id=" + id + ", titre=" + titre + ", note=" + note + ", remarque=" + remarque + ", nom="
				+ nom + "]";
	}
	
	
	
	
	
	
}

package com.thymleaf.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;


@Entity
public class Recommandation implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@NotEmpty(message= "veuillez remplir ce champs")
	private String titre;
	
	@NotEmpty(message= "veuillez remplir ce champs")
	@Lob
	private String texte;
	
	@NotEmpty(message= "veuillez remplir ce champs")
	private String date;

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

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Recommandation(@NotEmpty String titre, @NotEmpty String texte, @NotEmpty String date) {
	
		this.titre = titre;
		this.texte = texte;
		this.date = date;
	}

	public Recommandation() {
		
	}

	@Override
	public String toString() {
		return "Recommandation [id=" + id + ", titre=" + titre + ", texte=" + texte + ", date=" + date + "]";
	}
	
	
	
	
	
	
	
}

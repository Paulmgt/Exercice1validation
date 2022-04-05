package com.thymleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymleaf.model.Recommandation;

public interface RecommandationRepo extends JpaRepository<Recommandation, Integer> {

	List<Recommandation> findByTitre(String titre);
	List<Recommandation> findByTexte(String texte);
	List<Recommandation> findByDate(String date);
	
	
}

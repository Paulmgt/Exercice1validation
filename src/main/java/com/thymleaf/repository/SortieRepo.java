package com.thymleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymleaf.model.Sortie;

public interface SortieRepo extends JpaRepository<Sortie, Integer> {

	List<Sortie> findByTitre(String titre);
	List<Sortie> findByDestination(String destination);
	List<Sortie> findByDepart(String depart);
	List<Sortie> findByRetour(String retour);
	List<Sortie> findByDescription(String description);
	
}

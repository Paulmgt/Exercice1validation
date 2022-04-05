package com.thymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.model.Sortie;
import com.thymleaf.repository.SortieRepo;

@Service
public class SortieService {

	@Autowired
	SortieRepo sortieRepo;
	
	public Sortie saveSortie(Sortie recom) {

		return sortieRepo.save(recom);
	}

	public Optional<Sortie> searchById(int id) {
		return sortieRepo.findById(id);

	}

	public void delete(int id) {

		sortieRepo.deleteById(id);
	}

	public List<Sortie> SelectAll() {

		return sortieRepo.findAll();
	}
	
	public List<Sortie> filtreTitre(String titre){
		
		return sortieRepo.findByTitre(titre);
		
	}
	
	public List<Sortie> filtreDestination(String destination){
		
		return sortieRepo.findByDestination(destination);
		
		}
	
	public List<Sortie> filtreDepart(String depart) {
		
		return sortieRepo.findByDepart(depart);
		
	}
	
	public List<Sortie> filtreRetour(String retour) {
		
		return sortieRepo.findByRetour(retour);
	}
	

	
	
	public List<Sortie> filtreDescription(String description) {
		
		return sortieRepo.findByDescription(description);
	}
	
	
}

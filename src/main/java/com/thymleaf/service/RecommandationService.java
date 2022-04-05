package com.thymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.model.Recommandation;
import com.thymleaf.repository.RecommandationRepo;

@Service
public class RecommandationService {

	
	@Autowired
	RecommandationRepo recommandationRepo;
	
	
public Recommandation saveRecommandation(Recommandation recom) {
		
		return recommandationRepo.save(recom);
	}
	
	
	public Optional<Recommandation> searchById(int id)
	{
		return recommandationRepo.findById(id);
		
	}
	public void delete(int id) {
		
		recommandationRepo.deleteById(id);
	}
	
	public List<Recommandation> SelectAll(){
		
		return recommandationRepo.findAll();
	}
	
	public List<Recommandation> filtreTitre(String titre) {
		
		return recommandationRepo.findByTitre(titre);
		
		
	}
	
	
	public List<Recommandation> filtreTexte(String texte)  {
		
		return recommandationRepo.findByTexte(texte);
	}
	
	public List<Recommandation> filtreDate(String date)  {
		
		return recommandationRepo.findByDate(date);
	}
	
	
}

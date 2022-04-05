package com.thymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.model.Participant;
import com.thymleaf.repository.ParticipantRepo;

@Service
public class ParticipantService {

	
	@Autowired
	ParticipantRepo participantRepo;
	
	public Participant saveparticipant(Participant p) {

		return participantRepo.save(p);
	}

	public Optional<Participant> searchById(int id) {
		return participantRepo.findById(id);

	}

	public void delete(int id) {

		participantRepo.deleteById(id);
	}

	public List<Participant> SelectAll() {

		return participantRepo.findAll();
	}
	
	public List<Participant> filtrenom(String nom) {
		
		return participantRepo.findByNom(nom);
		
	}
	
public List<Participant> filtrprenom(String prenom) {
		
		return participantRepo.findByNom(prenom);
		
	}

public List<Participant> filtreemail(String email) {
	
	return participantRepo.findByEmail(email);
	
}

public List<Participant> filtretelephone(String telephone) {
	
	return participantRepo.findByTelephone(telephone);
	
}
	
public List<Participant> filtreage(int age)  {
	
	return participantRepo.findByAge(age);
	
}




public List<Participant> filtreNomOrPrenom(String nom, String prenom) {
	
	return participantRepo.findByNomOrPrenom(nom, prenom);
}

}

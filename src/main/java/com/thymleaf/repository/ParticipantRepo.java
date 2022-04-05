package com.thymleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymleaf.model.Participant;

public interface ParticipantRepo extends JpaRepository<Participant, Integer> {

	List<Participant> findByNom(String nom);
	List<Participant> findByPrenom(String prenom);
	List<Participant> findByEmail(String email);
	List<Participant> findByTelephone(String telephone);
	List<Participant> findByAge(int age);
	List<Participant> findByNomOrPrenom(String nom, String prenom);
	
	
	
}

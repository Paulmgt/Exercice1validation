package com.thymleaf.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thymleaf.model.Participant;
import com.thymleaf.service.ParticipantService;

@RestController
//@RequestMapping( "participant")
public class ParticipantRestController {

	
	
//	@Autowired
//	ParticipantService participantService;
//	
//	
//	
//	@GetMapping("")
//	public List<Participant> getAllParticipant()
//	{
//		return participantService.SelectAll();
//		
//	}
//	
//	
//	
//	@PostMapping("")
//	public Participant saveOne(@RequestBody @Valid Participant participant)
//	{
//		return participantService.saveparticipant(participant);
//	}
//	
//	
//	@DeleteMapping("/{id}")
//	public void  DeleteParticipant(@PathVariable int id)
//	{
//	participantService.delete(id);	
//	}
//	
//	@GetMapping("/{nom}")
//	public List<Participant> filtrenom(@PathVariable String nom)  {
//		
//		return participantService.filtrenom(nom);
//		
//	}
//	
//	
//	@GetMapping("/{prenom}")
//	public List<Participant> filtreprenom(@PathVariable String prenom)  {
//		
//		return participantService.filtrprenom(prenom);
//		
//	}
//	
//	
//	@GetMapping("/{email}")
//	public List<Participant> filtreemail(@PathVariable String email)  {
//		
//		return participantService.filtreemail(email);
//		
//	}
//	
//	
//	@GetMapping("/{telephone}")
//	public List<Participant> filtretelephone(@PathVariable String telephone)  {
//		
//		return participantService.filtreemail(telephone);
//		
//	}
//	
//	@GetMapping("/{age}")
//	public List<Participant> filtreage(@PathVariable int age)  {
//		
//		return participantService.filtreage(age);
//		
//	}
//	
//	
//
//	
//	@GetMapping("/{nomorprenom}")
//	public List<Participant> filtrenomorprenom(@PathVariable String nom, @PathVariable String prenom)  {
//		
//		return participantService.filtreNomOrPrenom(nom, prenom);
//		
//	}
	
}

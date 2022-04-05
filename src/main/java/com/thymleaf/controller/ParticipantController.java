package com.thymleaf.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thymleaf.model.Participant;
import com.thymleaf.service.ParticipantService;





@Controller
//@RequestMapping("participant")
public class ParticipantController {

	
	@Autowired
	ParticipantService participantService;
	
	
	@GetMapping("participant")
	public String PageParticipant(Model m)
	{
		List<Participant> participants=participantService.SelectAll(); // liste 
		Participant participant=new Participant(); // formulaire User unique
		m.addAttribute("participant", participant);
		m.addAttribute("participants", participants);
	return "participant";	
	}
	
	
	
	@PostMapping("participant/add")
	public String addClient(@Valid @ModelAttribute(name= "participant") Participant participant,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
//			List<Participant> participants=participantService.SelectAll(); // liste 
//			m.addAttribute("participants", participants);

			
		return "participant";
		}
		
		participantService.saveparticipant(participant);
		
		
		return "redirect:/participant"; // redirection vers le url ""=> localhost:8080/
	}
	
	@RequestMapping(value = "participant/delete/{id}", method ={RequestMethod.GET, RequestMethod.DELETE})
	public String supression(@PathVariable int id)
	{
	participantService.delete(id);
	return "redirect:/participant";
	}
}

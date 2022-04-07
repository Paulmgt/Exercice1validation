package com.thymleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymleaf.model.Recommandation;
import com.thymleaf.service.RecommandationService;


@Controller
public class RecommUserController {

	
	@Autowired
	RecommandationService recommandationService;
	
	
	
	@GetMapping("recommforuser")
	public String Pagerecomm(Model m)
	{
	List<Recommandation> recommandations=recommandationService.SelectAll(); // liste 
		
		m.addAttribute("recommandations", recommandations);
	return "recommforuser";	
	}
}

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

import com.thymleaf.model.Recommandation;
import com.thymleaf.service.RecommandationService;

@Controller
//@RequestMapping("recommandation")
public class RecommandationController {

	
	@Autowired
	RecommandationService recommandationService;
	
	
	
	@GetMapping("recommandation")
	public String Pagerecomm(Model m)
	{
	List<Recommandation> recommandations=recommandationService.SelectAll(); // liste 
		Recommandation recommandation=new Recommandation(); // formulaire User unique
		m.addAttribute("recommandation", recommandation);
		m.addAttribute("recommandations", recommandations);
	return "recommandation";	
	}
	
	
	
	@PostMapping("recommandation/add")
	public String addClient(@Valid @ModelAttribute(name= "recommandation") Recommandation recommandation,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
			List<Recommandation> recommandations=recommandationService.SelectAll(); // liste 
			m.addAttribute("recommandations", recommandations);

			
		return "recommandation";
		}
		
		recommandationService.saveRecommandation(recommandation);
		
		
		return "redirect:/recommandation"; // redirection vers le url ""=> localhost:8080/
	}
	
	@RequestMapping(value = "recommandation/delete/{id}", method ={RequestMethod.GET, RequestMethod.DELETE})
	public String supression(@PathVariable int id)
	{
	recommandationService.delete(id);
	return "redirect:/recommandation";
	
	}
}

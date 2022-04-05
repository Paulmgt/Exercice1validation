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

import com.thymleaf.model.Sortie;
import com.thymleaf.service.SortieService;

@Controller
//@RequestMapping("sortie")
public class SortieController {

	
	@Autowired
	SortieService sortieService;
	
	
	@GetMapping("sortie")
	public String PageSortie(Model m)
	{
		List<Sortie> sorties=sortieService.SelectAll(); // liste 
		Sortie sortie=new Sortie(); // formulaire User unique
		m.addAttribute("sortie", sortie);
		m.addAttribute("sorties", sorties);
	return "sortie";	
	}
	
	
	
	@PostMapping("sortie/add")
	public String addClient(@Valid @ModelAttribute(name= "sortie") Sortie sortie,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
			List<Sortie> sorties=sortieService.SelectAll(); // liste 
			m.addAttribute("sorties", sorties);

			
		return "sortie";
		}
		
		sortieService.saveSortie(sortie);
		
		
		return "redirect:/sortie"; // redirection vers le url ""=> localhost:8080/
	}
	
	@RequestMapping(value = "sortie/delete/{id}", method ={RequestMethod.GET, RequestMethod.DELETE})
	public String supression(@PathVariable int id)
	{
	sortieService.delete(id);
	return "redirect:/sortie";
	}
}

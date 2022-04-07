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
import org.springframework.web.bind.annotation.RequestParam;

import com.thymleaf.model.Admin;
import com.thymleaf.model.Sortie;
import com.thymleaf.service.AdminService;
import com.thymleaf.service.SortieService;

@Controller
//@RequestMapping("sortie")
public class SortieController {

	
	@Autowired
	SortieService sortieService;
	@Autowired
	AdminService adminService;
	
	
	@GetMapping("sortie")
	public String PageSortie(Model m)
	{
		
		List<Admin> admins=adminService.SelectAll(); 
		List<Sortie> sorties=sortieService.SelectAll(); // liste 
		Sortie sortie=new Sortie(); // formulaire User unique
		m.addAttribute("sortie", sortie);
		m.addAttribute("sorties", sorties);
		m.addAttribute("admins", admins);
		String nomComplet=""; // initialisation de nomcomplet d'admin
		m.addAttribute("nomComplet",nomComplet);
	return "sortie";	
	}
	
	
	
	@PostMapping("sortie/add")
	public String addClient(@Valid  Sortie sortie,@RequestParam String nomComplet)
	{
		// @RequestParam nom récupére le nom complet envoyé depuis le menu déroulant
		Admin ad= adminService.filtreNomComplet(nomComplet); // recherche d'admin
		sortie.setAdmin(ad); // association de admin=> sortie
		
	sortieService.saveSortie(sortie); // ajout de sortie avec responsable
	//System.out.println("responsable"+responsable.toString());
		
		
		return "redirect:/sortie"; // redirection vers le url ""=> localhost:8080/
	}
	
	@RequestMapping(value = "sortie/delete/{id}", method ={RequestMethod.GET, RequestMethod.DELETE})
	public String supression(@PathVariable int id)
	{
	sortieService.delete(id);
	return "redirect:/sortie";
	}
}

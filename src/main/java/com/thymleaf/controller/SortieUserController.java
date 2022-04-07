package com.thymleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymleaf.model.Sortie;
import com.thymleaf.service.SortieService;


@Controller
public class SortieUserController {

	
	@Autowired
	SortieService sortieService;
	
	
	@GetMapping("sortieforuser")
	public String PageSortie(Model m)
	{
		List<Sortie> sorties=sortieService.SelectAll(); // liste 
		
		
		m.addAttribute("sorties", sorties);
	return "sortieforuser";	
	}
}

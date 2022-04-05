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

import com.thymleaf.model.Recommandation;
import com.thymleaf.service.RecommandationService;

@RestController
//@RequestMapping("recommandation")
public class RecommlandationResrController {

//	@Autowired
//	RecommandationService recommandationService;
//	
//	
//	@GetMapping("")
//	public List<Recommandation> getAllRecommandation()
//	{
//		return recommandationService.SelectAll();
//		
//	}
//	
//	
//	
//	@PostMapping("")
//	public Recommandation saveOne(@RequestBody @Valid Recommandation recommandation)
//	{
//		return recommandationService.saveRecommandation(recommandation);
//	}
//	
//	
//	@DeleteMapping("/{id}")
//	public void  DeleteRecommandation(@PathVariable int id)
//	{
//	recommandationService.delete(id);	
//	}
//	
//	
//	
//	@GetMapping("/{titre}")
//	public List<Recommandation> filtretitre(@PathVariable String titre)  {
//		
//		return recommandationService.filtreTitre(titre);
//		
//	}
//	
//	@GetMapping("/{texte}")
//	public List<Recommandation> filtretexte(@PathVariable String texte)  {
//		
//		return recommandationService.filtreTexte(texte);
//		
//	}
//	
//	
//	@GetMapping("/{date}")
//	public List<Recommandation> filtredate(@PathVariable String date)  {
//		
//		return recommandationService.filtreDate(date);
//		
//	}
//	

	
}

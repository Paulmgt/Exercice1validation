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

import com.thymleaf.model.Sortie;
import com.thymleaf.service.SortieService;

@RestController
//@RequestMapping("sortie")
public class SortieResrController {

	
//	@Autowired
//	SortieService sortieService;
//	
//	
//	@GetMapping("")
//	public List<Sortie> getAllSortie()
//	{
//		return sortieService.SelectAll();
//		
//	}
//	
//	
//	@PostMapping("")
//	public Sortie saveOne(@RequestBody @Valid Sortie sortie)
//	{
//		return sortieService.saveSortie(sortie);
//	}
//	
//	
//	@DeleteMapping("/{id}")
//	public void  DeleteSortie(@PathVariable int id)
//	{
//	sortieService.delete(id);	
//	}
//	
//	
//	@GetMapping("/{titre}")
//	public List<Sortie> filtretitre(@PathVariable String titre)  {
//		
//		return sortieService.filtreTitre(titre);
//		
//	}
//	
//	
//	@GetMapping("/{destination}")
//	public List<Sortie> filtredestination(@PathVariable String destination)  {
//		
//		return sortieService.filtreDestination(destination);
//		
//	}
//	
//	
//	@GetMapping("/{depart}")
//	public List<Sortie> filtredepart(@PathVariable String depart)  {
//		
//		return sortieService.filtreDepart(depart);
//		
//	}
//	
//	
//	@GetMapping("/{retour}")
//	public List<Sortie> filtreretour(@PathVariable String retour)  {
//		
//		return sortieService.filtreTitre(retour);
//		
//	}
//	
//	
//	
//	@GetMapping("/{description}")
//	public List<Sortie> filtredescription(@PathVariable String description)  {
//		
//		return sortieService.filtreDescription(description);
//		
//	}
//	
	
	
}

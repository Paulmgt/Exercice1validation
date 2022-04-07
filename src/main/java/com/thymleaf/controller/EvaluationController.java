package com.thymleaf.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymleaf.model.Evaluation;
import com.thymleaf.service.EvaluationService;



@Controller
public class EvaluationController {

	@Autowired
	EvaluationService evaluationService;
	
	
	@GetMapping("evaluation")
	public String PageEvaluation(Model m)
	{
		 // liste 
		Evaluation evaluation=new Evaluation(); // formulaire User unique
		m.addAttribute("evaluation", evaluation);
		
	return "evaluation";	
	}
	
	
	
	@PostMapping("evaluation/add")
	public String addClient(@Valid @ModelAttribute(name= "evaluation") Evaluation evaluation,BindingResult result,Model m)
	{
		if(result.hasErrors())
		{
//			List<Evaluation> evaluations=evaluationService.SelectAll(); // liste 
//			m.addAttribute("evaluations", evaluations);

			
		return "evaluation";
		}
		
		evaluationService.saveevaluation(evaluation);
		
		
		return "redirect:/evaluation"; // redirection vers le url ""=> localhost:8080/
	}
	
	
}

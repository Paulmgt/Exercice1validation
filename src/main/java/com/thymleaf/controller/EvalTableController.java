package com.thymleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thymleaf.model.Evaluation;
import com.thymleaf.service.EvaluationService;


@Controller
public class EvalTableController {

	@Autowired
	EvaluationService evaluationService;
	
	
	@GetMapping("evaltable")
	public String PageEvaluation(Model m)
	{
		 
		
		List<Evaluation> evaluations=evaluationService.SelectAll();// liste 
		 // formulaire User unique
		m.addAttribute("evaluations", evaluations);
		
	return "evaltable";	
	}
	
	
	@RequestMapping(value = "evaltable/delete/{id}", method ={RequestMethod.GET, RequestMethod.DELETE})
	public String supression(@PathVariable int id)
	{
	evaluationService.delete(id);
	return "redirect:/evaltable";
	}
	
	
}

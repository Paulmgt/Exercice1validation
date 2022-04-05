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

import com.thymleaf.model.Evaluation;
import com.thymleaf.service.EvaluationService;

@RestController
//@RequestMapping("evaluation")
public class EvaluationRestController {

	
//	@Autowired
//	EvaluationService evaluationService;
//	
//	
//	
//	@GetMapping("")
//	public List<Evaluation> getAllEvaluation()
//	{
//		return evaluationService.SelectAll();
//		
//	}
//	
//	
//	
//	@PostMapping("")
//	public Evaluation saveOne(@RequestBody @Valid Evaluation evaluation)
//	{
//		return evaluationService.saveevaluation(evaluation);
//	}
//	
//	
//	@DeleteMapping("/{id}")
//	public void  DeleteEvaluation(@PathVariable int id)
//	{
//	evaluationService.delete(id);	
//	}
//	
	
}

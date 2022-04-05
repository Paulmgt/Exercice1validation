package com.thymleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thymleaf.model.Evaluation;
import com.thymleaf.repository.EvaluationRepo;

@Service
public class EvaluationService {

	
	@Autowired
	EvaluationRepo evaluationRepo;
	
	
	
	public Evaluation saveevaluation(Evaluation e) {

		return evaluationRepo.save(e);
	}

	public Optional<Evaluation> searchById(int id) {
		return evaluationRepo.findById(id);

	}

	public void delete(int id) {

		evaluationRepo.deleteById(id);
	}

	public List<Evaluation> SelectAll() {

		return evaluationRepo.findAll();
	}
	
	public List<Evaluation> filtrenotedesc(int note) {
		
		return evaluationRepo.findByNoteOrderByNoteDesc(note);
	}
}

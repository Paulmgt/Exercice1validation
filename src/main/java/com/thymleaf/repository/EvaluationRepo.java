package com.thymleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymleaf.model.Evaluation;

public interface EvaluationRepo extends JpaRepository<Evaluation, Integer> {

	List<Evaluation> findByNoteOrderByNoteDesc(int note);
}

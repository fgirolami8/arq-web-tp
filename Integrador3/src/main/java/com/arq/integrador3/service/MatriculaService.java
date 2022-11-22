package com.arq.integrador3.service;

import com.arq.integrador3.model.*;
import com.arq.integrador3.repository.EstudianteRepository;
import com.arq.integrador3.repository.MatriculaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService {

	
	@Autowired
	private MatriculaRepository matriculaRepository;
	
	
	
	public Matricula addMatricula(Matricula matricula) {
		return matriculaRepository.save(matricula);
	}
}

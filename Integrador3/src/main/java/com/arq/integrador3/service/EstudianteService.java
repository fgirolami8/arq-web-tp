package com.arq.integrador3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arq.integrador3.model.Estudiante;
import com.arq.integrador3.repository.EstudianteRepository;

@Service
public class EstudianteService{

	@Autowired
	private EstudianteRepository estudianteRepository;
	
		public void del(int id) {
		// TODO Auto-generated method stub
		estudianteRepository.deleteById(id);;
	}
	
	public Estudiante addEstudiante(Estudiante estudiante) {
		return estudianteRepository.save(estudiante);
	}

	public List<Estudiante> getEstudiantes() {
		return estudianteRepository.findAll();
	}

	public List<Estudiante> getEstudiantes_OrderByNombre() {
		return estudianteRepository.getEstudiantes_OrderByNombre();
	}

	public Estudiante getEstudianteByLU(int nroLibreta) {
		return estudianteRepository.getEstudianteByLU(nroLibreta);
	}

	public List<Estudiante> getEstudiantesByGnr(String genero) {
		return estudianteRepository.getEstudiantesByGnr(genero);
	}

	public List<Estudiante> getEstudiantesByCiudadCarrera(String ciudad, String carrera) {
		return estudianteRepository.getEstudiantesByCiudadCarrera(ciudad, carrera);
	}

}

package com.arq.integrador3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arq.integrador3.model.*;
import com.arq.integrador3.repository.CarreraRepository;

@Service
public class CarreraService {

	@Autowired
	private CarreraRepository carreraRepository;

	
	
	//GET ALL
		public List<Carrera> getCarreras() {
			return carreraRepository.findAll();
		}
	
	
	
	
	public List<Carrera> getCarrera_OrderByCantidadInscriptos() {
		return carreraRepository.getCarrera_OrderByCantidadInscriptos();
	}




	public Carrera addCarrera(Carrera carrera) {
		return carreraRepository.save(carrera);
	}
	
	
}

package com.arq.integrador3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.arq.integrador3.model.*;
import com.arq.integrador3.repository.*;


@Configuration
public class cargarDB {

	private static final Logger log = LoggerFactory.getLogger(cargarDB.class);

	@Bean
	CommandLineRunner initDatabase(EstudianteRepository estudianteRepository, CarreraRepository carreraRepository, MatriculaRepository matriculaRepository) {
		return args -> {
			Carrera c1 = new Carrera(1, "TUDAI");
			Carrera c2 = new Carrera(2, "Matematicas");
			Carrera c3 = new Carrera(3, "fisica");
			Estudiante e1 = new Estudiante(1, "Franco", "Girolami", 22, "m", 24567822, "Tandil", 125466);
			Estudiante e2 = new Estudiante(1, "Pepe", "Gon", 19, "m", 88867822, "Tandil", 775466);
			Estudiante e3 = new Estudiante(1, "mirta", "perez", 42, "f", 11165822, "Rauch", 156766);
			Estudiante e4 = new Estudiante(1, "Juana", "pereyra", 52, "f", 22222222, "Tandil", 876546);
			Matricula ec1 = new Matricula(e1, c1, 2);
			Matricula ec2 = new Matricula(e2, c1, 3);
			Matricula ec3 = new Matricula(e3, c2, 4);
			Matricula ec4 = new Matricula(e4, c3, 2);
			log.info("Preloading " + carreraRepository.save(c1));
			log.info("Preloading " + carreraRepository.save(c2));
			log.info("Preloading " + carreraRepository.save(c3));
			log.info("Preloading " + estudianteRepository.save(e1));
			log.info("Preloading " + estudianteRepository.save(e2));
			log.info("Preloading " + estudianteRepository.save(e3));
			log.info("Preloading " + matriculaRepository.save(ec1));
			log.info("Preloading " + matriculaRepository.save(ec2));
			log.info("Preloading " + matriculaRepository.save(ec3));
			log.info("Preloading " + matriculaRepository.save(ec4));
			
		};
	}
}
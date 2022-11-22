package com.arq.integrador3.model;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.arq.integrador3.controller.MatriculaDTO;
import com.arq.integrador3.repository.CarreraRepository;
import com.arq.integrador3.repository.EstudianteRepository;
import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.*;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Matricula{


	//	@Autowired
//	CarreraRepository carreraRepository;
	@JsonCreator
	public Matricula() {
	}
	@JsonCreator
	public Matricula(Estudiante estudiante, Carrera carrera, int antiguedad) {
		this.estudiante = estudiante;
		this.carrera = carrera;
		this.antiguedad = antiguedad;
	}

	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="estudiante_id")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name="carrera_id")
    private Carrera carrera;

    @Column
    private int antiguedad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
    
    

}

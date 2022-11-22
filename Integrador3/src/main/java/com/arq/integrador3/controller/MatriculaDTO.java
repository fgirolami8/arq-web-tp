package com.arq.integrador3.controller;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.arq.integrador3.model.Carrera;
import com.arq.integrador3.model.Estudiante;

public class MatriculaDTO {
    private int estudiante;
    private int carrera;
    private int antiguedad;
    
	public int getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(int estudiante) {
		this.estudiante = estudiante;
	}
	public int getCarrera() {
		return carrera;
	}
	public void setCarrera(int carrera) {
		this.carrera = carrera;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public MatriculaDTO(int estudiante, int carrera, int antiguedad) {
		super();
		this.estudiante = estudiante;
		this.carrera = carrera;
		this.antiguedad = antiguedad;
	}

    
}

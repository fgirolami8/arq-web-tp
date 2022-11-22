package com.arq.integrador3.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Carrera implements Serializable{
	@JsonCreator
	public Carrera() {	}
	@JsonCreator
	public Carrera(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nombre;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "carrera", cascade = CascadeType.ALL)
//    private List<Matricula> inscriptos;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//	public List<Matricula> getInscriptos() {
//		return inscriptos;
//	}
//
//	public void setInscriptos(List<Matricula> inscriptos) {
//		this.inscriptos = inscriptos;
//	}
//    
    
}

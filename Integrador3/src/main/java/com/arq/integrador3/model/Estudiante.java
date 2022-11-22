package com.arq.integrador3.model;

import javax.persistence.*;

//import com.fasterxml.jackson.annotation.JsonCreator;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

import java.io.Serializable;
import java.util.List;
//@Data
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Entity
public class Estudiante implements Serializable{

	
//	@JsonCreator
	public Estudiante() {
	}
//	@JsonCreator
	public Estudiante(int id, String nombre, String apellido, int edad, String genero, int dni, String ciudad, int lu) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
		this.ciudad = ciudad;
		this.lu = lu;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private int edad;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private int dni;

    @Column(nullable = false)
    private String ciudad;

    @Column(nullable = false)
    private int lu;
//
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "estudiante", cascade = CascadeType.ALL)
//    private List<Matricula> inscripciones;
//    
//    
    
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getLu() {
		return lu;
	}

	public void setLu(int lU) {
		lu = lU;
	}

//	public List<Matricula> getInscripciones() {
//		return inscripciones;
//	}
//
//	public void setInscripciones(List<Matricula> inscripciones) {
//		this.inscripciones = inscripciones;
//	}

	
}

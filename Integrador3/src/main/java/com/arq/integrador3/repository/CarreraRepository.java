package com.arq.integrador3.repository;

import org.springframework.stereotype.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arq.integrador3.model.Carrera;
import com.arq.integrador3.model.Estudiante;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Integer>{

	
	@Query(value="SELECT c.* FROM carrera c JOIN matricula m ON (c.id=m.carrera_id) GROUP BY c.nombre ORDER BY count(*) DESC", nativeQuery=true) 
	List<Carrera> getCarrera_OrderByCantidadInscriptos();
	
	@Query(value="SELECT * FROM carrera c WHERE id = ?", nativeQuery=true) 
	Carrera getCarreraById(int id);
	
	
	

	
	
	
}
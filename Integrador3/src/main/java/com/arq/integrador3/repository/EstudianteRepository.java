package com.arq.integrador3.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arq.integrador3.model.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{



	@Query(value="SELECT * FROM estudiante e ORDER BY nombre", nativeQuery=true) 
	List<Estudiante> getEstudiantes_OrderByNombre();


	@Query(value="SELECT * FROM estudiante e WHERE lu = ?", nativeQuery=true) 
	Estudiante getEstudianteByLU(int nroLibreta);

	@Query(value="SELECT * FROM estudiante e WHERE id = ?", nativeQuery=true) 
	Estudiante getEstudianteById(int id);
	
	@Query(value="SELECT * FROM estudiante e WHERE genero = ?", nativeQuery=true) 
	List<Estudiante> getEstudiantesByGnr(String genero);


	@Query(value="SELECT e.* FROM estudiante e JOIN matricula m ON (e.id=m.estudiante_id) JOIN carrera c ON (c.id=m.carrera_id) WHERE e.ciudad = ? AND c.nombre = ? GROUP BY e.id", nativeQuery=true) 
	List<Estudiante> getEstudiantesByCiudadCarrera(String ciudad, String carrera);

	

}



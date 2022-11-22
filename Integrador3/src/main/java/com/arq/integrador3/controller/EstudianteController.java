package com.arq.integrador3.controller;

import com.arq.integrador3.model.Estudiante;
import com.arq.integrador3.service.EstudianteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {


	@Autowired
	private EstudianteService estudianteService;




	//	GET ALL

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@Operation(
			summary = "devuelve lista de todos los estudiantes",
			description = "servicio encargado de devolver el listado de todos los estudiantes",
			tags = {"estudiante-controller"},//a que seccion de la interfaz swagger pertenece
			responses = {
					@ApiResponse(
								description = "Lista de estudiantes cargada con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se encontraron estudiantes", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	public List<Estudiante> getEstudiantes(){
		return estudianteService.getEstudiantes();
	}




	//2a TESTED

	@RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@Operation(
			summary = "crea un estudiante",
			description = "servicio encargado de crear/agregar un estudiante al listado de estudiantes",
			tags = {"estudiante-controller"},
			responses = {
					@ApiResponse(
								description = "Estudiante agregado con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se pudo crear estudiante", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	public Estudiante addEstudiante(@RequestBody Estudiante estudiante){
		return estudianteService.addEstudiante(estudiante);
	}


	
	
	//2c TESTED

	@RequestMapping(value="/orderByNombre", method = RequestMethod.GET, produces = "application/json")
	@Operation(
			summary = "devuelve lista de todos los estudiantes ordenados por su nombre",
			description = "servicio encargado de devolver el listado de todos los estudiantes ordenados por su nombre",
			tags = {"estudiante-controller"},
			responses = {
					@ApiResponse(
								description = "Lista de estudiantes cargada con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se encontraron estudiantes", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	public List<Estudiante> getEstudiantes_OrderByNombre(){
		return estudianteService.getEstudiantes_OrderByNombre();
	}

	
	

	//	 2d TESTED

	@RequestMapping(value="/lu/{nroLibreta}", method = RequestMethod.GET, produces = "application/json")
	@Operation(
			summary = "devuelve estudiante con determinado numero de libreta",
			description = "servicio encargado de devolver estudiante con determinado numero de libreta",
			tags = {"estudiante-controller"},
			responses = {
					@ApiResponse(
								description = "Estudiante encontrado con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se encontro al estudiante", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	public Estudiante getEstudianteByLU(@PathVariable int nroLibreta){
		return estudianteService.getEstudianteByLU(nroLibreta);
	}


	
	
	//	 2e TESTED

	@RequestMapping(value="/genero/{genero}", method = RequestMethod.GET, produces = "application/json")
	@Operation(
			summary = "devuelve lista de todos los estudiantes con un determinado genero",
			description = "servicio encargado de devolver el listado de todos los estudiantes de un determinado genero",
			tags = {"estudiante-controller"},
			responses = {
					@ApiResponse(
								description = "Lista de estudiantes cargada con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se encontraron estudiantes de el genero solicitado", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	public List<Estudiante> getEstudiantesByGnr(@PathVariable String genero){
		return estudianteService.getEstudiantesByGnr(genero);
	}

	
	//2g

	@RequestMapping(value="/{ciudad}/{carrera}", method = RequestMethod.GET, produces = "application/json")
	@Operation(
			summary = "devuelve lista de los estudiantes de determinada ciudad y matriculados en determinada carrera",
			description = "servicio encargado de devolver el listado de todos los estudiantes de una determinada ciudad y matriculados en determinada carrera",
			tags = {"estudiante-controller"},
			responses = {
					@ApiResponse(
								description = "Lista de estudiantes cargada con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se encontraron estudiantes de la ciudad y carrera solicitadas", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	    public List<Estudiante> getEstudiantesByCiudadCarrera(@PathVariable String ciudad, @PathVariable String carrera){
	        return estudianteService.getEstudiantesByCiudadCarrera(ciudad, carrera);
	    }



}

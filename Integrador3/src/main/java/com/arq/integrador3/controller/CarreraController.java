package com.arq.integrador3.controller;

import com.arq.integrador3.service.EstudianteService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import com.arq.integrador3.model.Carrera;
import com.arq.integrador3.model.Estudiante;
import com.arq.integrador3.service.CarreraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carreras")
public class CarreraController {


	@Autowired
	private CarreraService carreraService;

	//GET ALL
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@Operation(
			summary = "devuelve lista de todas las carreras",
			description = "servicio encargado de devolver el listado de todos las carreras",
			tags = {"carrera-controller"},
			responses = {
					@ApiResponse(
								description = "Lista de carreras cargada con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se encontraron carreras", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	public List<Carrera> getCarreras(){
		return carreraService.getCarreras();
	}
	
	//add Carrera
	@RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@Operation(
			summary = "crea una carrera",
			description = "servicio encargado de crear una carrera",
			tags = {"carrera-controller"},
			responses = {
					@ApiResponse(
								description = "carreras creada con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se pudo crear la carrera", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	public Carrera addCarrera(@RequestBody Carrera carrera){
		return carreraService.addCarrera(carrera);
	}
	
	
//	2f. TESTED

	@RequestMapping(value="/orderByCantInscriptos", method = RequestMethod.GET, produces = "application/json")
	@Operation(
			summary = "devuelve lista de todas las carreras ordenadas por cantidad de inscriptos",
			description = "servicio encargado de devolver el listado de todos las carreras ordenadas por cantidad de inscriptos",
			tags = {"carrera-controller"},
			responses = {
					@ApiResponse(
								description = "Lista de carreras cargada con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se encontraron carreras", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	    public List<Carrera> getCarrera_OrderByCantidadInscriptos(){
	        return carreraService.getCarrera_OrderByCantidadInscriptos();
	    }
	
	
	
}

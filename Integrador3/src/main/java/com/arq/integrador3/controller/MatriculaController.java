package com.arq.integrador3.controller;

import com.arq.integrador3.model.Carrera;
import com.arq.integrador3.model.Estudiante;
import com.arq.integrador3.model.Matricula;
import com.arq.integrador3.repository.CarreraRepository;
import com.arq.integrador3.repository.EstudianteRepository;
import com.arq.integrador3.service.CarreraService;
import com.arq.integrador3.service.EstudianteService;
import com.arq.integrador3.service.MatriculaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private MatriculaService matriculaService;
	@Autowired
	private EstudianteRepository estudianteRepository;
	@Autowired
	private CarreraRepository carreraRepository;

	

	//2b
	
	@RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@Operation(
			summary = "crea una matricula",
			description = "servicio encargado de crear una matricula para un estudiante y carrera determinados",
			tags = {"matricula-controller"},
			responses = {
					@ApiResponse(
								description = "Matricula creada con exito",
								responseCode = "200",
								content = @Content(mediaType = "application/json", schema = @Schema(implementation = Estudiante.class))
							),
					@ApiResponse(description = "No se pudo crear matricula", responseCode = "404", content = @Content),
                    @ApiResponse(description = "Error del servidor", responseCode = "500", content = @Content)
			}
	)
	public Matricula addMatricula(@RequestBody MatriculaDTO matriculaDTO){
		int a=matriculaDTO.getAntiguedad();
		Estudiante e=estudianteRepository.getEstudianteById(matriculaDTO.getEstudiante());
		Carrera c=carreraRepository.getCarreraById(matriculaDTO.getCarrera());
	    return matriculaService.addMatricula(new Matricula(e, c, a));
	}
	
	
	
	
	
}

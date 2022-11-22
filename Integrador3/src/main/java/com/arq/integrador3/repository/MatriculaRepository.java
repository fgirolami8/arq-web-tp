package com.arq.integrador3.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.arq.integrador3.model.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Integer>{

}

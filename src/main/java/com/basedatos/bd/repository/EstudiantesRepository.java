package com.basedatos.bd.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basedatos.bd.entity.Estudiantes;

@Repository("estudiantesRepository")
public interface EstudiantesRepository extends JpaRepository<Estudiantes, Serializable>{
	
	

}

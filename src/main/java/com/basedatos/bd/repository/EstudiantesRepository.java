package com.basedatos.bd.repository;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.basedatos.bd.entity.Estudiantes;

@Repository("estudiantesRepository")
public interface EstudiantesRepository extends JpaRepository<Estudiantes, Serializable>{
	public List<Estudiantes> findByMateriaOrderByNombreAsc (String materia);
	
	public List<Estudiantes> findByAsignacionAfter (Date asignacion);
	
	public List<Estudiantes> findByApellidoContaining(String apellido);

	public List<Estudiantes> findByNombreAndApellido(@Param("nombre") String nombre,
													@Param("apellido") String apellido);
	
	public List<Estudiantes> findByNombreEndingWith (String nombre);
	

}

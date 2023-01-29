package com.basedatos.bd.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import org.springframework.stereotype.Service;

import com.basedatos.bd.entity.Grado;





@Service
public class ServicioBd {
	
	@Autowired
	JdbcTemplate jt;
	
	@Autowired
	NamedParameterJdbcTemplate npjt;
	
	public List<Map<String, Object>> buscarPorNombre(String nombre){
		String query = "select nombre, telefono from usuario where nombre = :nombre";
		SqlParameterSource sps = new MapSqlParameterSource()
				.addValue("nombre", nombre);
		return npjt.queryForList(query, sps);
		
	}
	
	public List<Map<String, Object>> buscarPorGrado(String grado){
		String query = "SELECT es.nombre, g.grado FROM estudiantes es INNER JOIN grado g on g.id = es.idgrado WHERE g.grado = :grado";
		SqlParameterSource sps = new MapSqlParameterSource()
				.addValue("grado", grado);
		return npjt.queryForList(query, sps);
	}
	
	public List<Map<String, Object>> mostrarNotas(){
		String query = "select nombre, materia, nota, funnota(nota) from estudiantes";
		SqlParameterSource sps = new MapSqlParameterSource();
		return npjt.queryForList(query, sps);
	}
	
	public void insertaGrado(int id, String grado, String seccion) {
		jt.update("call painsertargrado (aid,agrado,aseccion)", id, grado, seccion);
	}

	
}

package com.idat.ec1.service;

import java.util.List;

import com.idat.ec1.model.Curso;


public interface CursoService {
	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);	
	List<Curso>listarCursos();
	Curso obtenerCursoId(Integer id);
}

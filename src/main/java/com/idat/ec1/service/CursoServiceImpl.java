package com.idat.ec1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec1.model.Curso;
import com.idat.ec1.repository.CursoRepository;


@Service
public class CursoServiceImpl implements CursoService{
	@Autowired
	private CursoRepository repository;

	@Override
	public void guardarCurso(Curso curso) {
		repository.save(curso);		
	}

	@Override
	public void actualizarCurso(Curso curso) {
		repository.saveAndFlush(curso);		
	}

	@Override
	public void eliminarCurso(Integer id) {
		repository.deleteById(id);		
	}

	@Override
	public List<Curso> listarCursos() {
		return repository.findAll();

	}

	@Override
	public Curso obtenerCursoId(Integer id) {
		return repository.findById(id).orElse(null);
	}
}

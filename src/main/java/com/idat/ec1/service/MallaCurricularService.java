package com.idat.ec1.service;

import java.util.List;

import com.idat.ec1.model.MallaCurricular;


public interface MallaCurricularService {
	void guardarMallaCurricular(MallaCurricular mallaCurricular);
	void actualizarMallaCurricular(MallaCurricular mallaCurricular);
	void eliminarMallaCurricular(Integer id);	
	List<MallaCurricular>listarMallaCurricular();
	MallaCurricular obtenerMallaCurricularId(Integer id);
}

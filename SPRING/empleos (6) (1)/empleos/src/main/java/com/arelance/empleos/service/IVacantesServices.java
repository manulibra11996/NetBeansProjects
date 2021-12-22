package com.arelance.empleos.service;

import java.util.List;

import com.arelance.empleosmodelo.Vacante;

public interface IVacantesServices {
	
	List<Vacante> listarVacantes();
	Vacante buscarPorID(Integer id);
	boolean altaVacante(Vacante vacante);

}

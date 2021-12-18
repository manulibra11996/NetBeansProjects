package com.arelance.biblioteca.service;

import java.util.List;

import com.arelance.biblioteca.modelo.Autor;


public interface IAutorService {

	List<Autor> listarLibros();
	boolean altaAutor(Autor autor);
}

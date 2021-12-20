package com.example.BibliotecaAutomatica.service;

import java.util.List;

import com.example.BibliotecaAutomatica.modelo.Autor;

public interface IAutorService {

	List<Autor> listarAutors();
	Autor buscarPorID(Integer id);
	boolean altaAutor(Autor autor);
	boolean bajaAutor(Autor autor);
	boolean modificarAutor(Autor autor);
}

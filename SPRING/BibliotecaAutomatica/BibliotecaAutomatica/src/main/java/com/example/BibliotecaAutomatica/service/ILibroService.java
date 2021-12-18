package com.example.BibliotecaAutomatica.service;

import java.util.List;

import com.example.BibliotecaAutomatica.modelo.Libro;

public interface ILibroService {

	List<Libro> listarLibros();
	Libro buscarPorID(Integer id);
	boolean altaLibro(Libro libro);
	boolean bajaLibro(Libro libro);
	boolean modificarLibro(Libro libro);
}

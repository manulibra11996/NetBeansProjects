package com.example.BibliotecaAutomatica.service;

import java.util.List;

import com.example.BibliotecaAutomatica.modelo.Autor;


public interface IAutorService {

	List<Autor> listarAutores();
	boolean altaAutor(Autor autor);
}

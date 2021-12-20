package com.example.BibliotecaAutomatica.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BibliotecaAutomatica.modelo.Autor;
import com.example.BibliotecaAutomatica.modelo.Nacionalidad;

@Service
public class AutorService implements IAutorService{

	private List<Autor> Autors;
	

	public AutorService() {
		Autors = getAutors();
	}

	@Override
	public List<Autor> listarAutors() {
		return Autors;
	}
	
	@SuppressWarnings("finally")
	private List<Autor> getAutors(){
		this.Autors = new LinkedList<>();
		try {

			
			
		}catch (Exception e) {
			throw e;
		}finally {
			return Autors;
		}
	}

	@Override
	public Autor buscarPorID(Integer id) {
		Autor Autor = null;
		for (Autor AutorItem : Autors) {
			if(AutorItem.getId() == id) {
				Autor = AutorItem;
				 break;
			}
			
		}
		return Autor;
	}

	@Override
	public boolean altaAutor(Autor autor) {
		return this.Autors.add(autor);
	}

	@Override
	public boolean bajaAutor(Autor autor) {
		return this.Autors.add(autor);
	}

	@Override
	public boolean modificarAutor(Autor autor) {
		return false;
	}

}

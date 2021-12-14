package com.example.BibliotecaAutomatica.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BibliotecaAutomatica.modelo.Autor;
import com.example.BibliotecaAutomatica.modelo.Nacionalidad;

@Service
public class AutorService implements IAutorService {

	private List<Autor> autores;

	public AutorService() {
		autores = getAutor();
	}
	
	@SuppressWarnings("finally")
	private List<Autor> getAutor() {
		this.autores = new LinkedList<>();
		try {
			Autor a1 = new Autor();
			a1.setId(1);
			a1.setNombre("AAA");
			a1.setApellido("XXX");
			a1.setNacionalidad(Nacionalidad.Terricola);
			autores.add(a1);

			Autor a2 = new Autor();
			a2.setId(1);
			a2.setNombre("BBB");
			a2.setApellido("YYY");
			a2.setNacionalidad(Nacionalidad.Extraterreste);
			autores.add(a2);
			
		} catch (Exception e) {
			throw e;
		} finally {
			return autores;
		}
	}
	
	@Override
	public List<Autor> listarAutores() {
		// TODO Auto-generated method stub
		return autores;
	}

	@Override
	public boolean altaAutor(Autor autor) {
		// TODO Auto-generated method stub
		return this.autores.add(autor);
	}


}

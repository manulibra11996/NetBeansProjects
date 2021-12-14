package com.example.BibliotecaAutomatica.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BibliotecaAutomatica.modelo.Libro;

@Service
public class LibroService implements ILibroService{

	private List<Libro> libros;
	

	public LibroService() {
		libros = getLibros();
	}

	@Override
	public List<Libro> listarLibros() {
		return libros;
	}
	
	@SuppressWarnings("finally")
	private List<Libro> getLibros(){
		this.libros = new LinkedList<>();
		try {
			Libro v1 = new Libro();
			v1.setId(1);
			v1.setIsbn("1257854");
			v1.setTitulo("La historia interminable");
			v1.setAutor("AAA");
			libros.add(v1);
			
			Libro v2 = new Libro();
			v2.setId(2);
			v2.setIsbn("1575");
			v2.setTitulo("Narnia");
			v2.setAutor("BBB");
			libros.add(v2);
			
		}catch (Exception e) {
			throw e;
		}finally {
			return libros;
		}
	}

	@Override
	public Libro buscarPorID(Integer id) {
		Libro libro = null;
		for (Libro libroItem : libros) {
			if(libroItem.getId() == id) {
				libro = libroItem;
				 break;
			}
			
		}
		return libro;
	}

	@Override
	public boolean altaLibro(Libro libro) {
		return this.libros.add(libro);
	}

	@Override
	public boolean bajaLibro(Libro libro) {
		return this.libros.add(libro);
	}

	@Override
	public boolean modificarLibro(Libro libro) {
		return false;
	}

}

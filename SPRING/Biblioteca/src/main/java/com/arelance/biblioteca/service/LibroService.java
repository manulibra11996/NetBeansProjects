package com.arelance.biblioteca.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.arelance.biblioteca.modelo.Libro;

@Service
public class LibroService implements ILibroService {

	private List<Libro> libros;

	
	public LibroService() {
		libros = getLibros();
	}
	
	@Override
	public List<Libro> listarLibros() {
		return libros;
	}
	
	@SuppressWarnings("finally")
	private List<Libro> getLibros() {
		this.libros = new LinkedList<>();
		try {
			Libro v1 = new Libro();
			v1.setId(1);
			v1.setISBN("1257854");
			v1.setTitulo("La historia interminable");
			v1.setNombre("AAA");
			libros.add(v1);

			Libro v2 = new Libro();
			v2.setId(2);
			v2.setISBN("1575");
			v2.setTitulo("Narnia");
			v2.setNombre("BBB");
			libros.add(v2);
			
			
		} catch (Exception e) {
			throw e;
		} finally {
			return libros;
		}
	}


	@Override
	public Libro buscarPorID(Integer id) {
		Libro libro = null;
		for (Libro libroItem : libros) {
			if (libroItem.getId() == id) {
				libro = libroItem;
				break;
			}
		}
		return libro;
	}

	@Override
	public boolean altaLibro(Libro libro) {
		// TODO Auto-generated method stub
		return this.libros.add(libro);
	}

	@Override
	public boolean bajaLibro(Libro libro) {
		// TODO Auto-generated method stub
		return this.libros.remove(libro);
	}

	@Override
	public boolean modificarLibro(Libro libro) {
		// TODO Auto-generated method stub
		return false;
	}

}

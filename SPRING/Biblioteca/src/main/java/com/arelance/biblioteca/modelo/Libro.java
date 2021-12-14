package com.arelance.biblioteca.modelo;

public class Libro {
	private Integer id;
	private String ISBN;
	private String titulo;
	private String nombre;
	
	

	public Libro(Integer id, String iSBN, String titulo, String nombre) {
		super();
		this.id = id;
		ISBN = iSBN;
		this.titulo = titulo;
		this.nombre = nombre;
	}

	public Libro() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


}

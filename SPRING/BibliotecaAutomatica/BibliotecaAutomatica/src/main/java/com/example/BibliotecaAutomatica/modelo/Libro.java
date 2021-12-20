package com.example.BibliotecaAutomatica.modelo;

public class Libro {
	private Integer id;
	private String isbn;
	private String titulo;
	private Autor autor;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	

	public Libro(Integer id, String isbn, String titulo, Autor autor) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

}

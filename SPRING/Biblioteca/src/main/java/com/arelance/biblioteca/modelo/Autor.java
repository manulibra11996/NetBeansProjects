package com.arelance.biblioteca.modelo;

public class Autor {

	private Integer id;
	private String nombre;
	private String apellido;
	private Nacionalidad nacionalidad;
	
	public Autor(Integer id, String nombre, String apellido, Nacionalidad nacionalidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacionalidad = nacionalidad;
	}
	
	public Autor() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}

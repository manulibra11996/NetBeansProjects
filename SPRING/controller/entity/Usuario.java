package com.example.demo.entity;



public class Usuario {
	
	private String nombre;
	private int edad;
	private Departamento departamento;
	private String img="no-image.png";
	
	
	public Usuario() {

	}
	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Usuario(String nombre, int edad, Departamento departamento) {
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
		
	}

	public Usuario(String nombre, int edad, Departamento departamento, String img) {
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
		this.img = img;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
	

}

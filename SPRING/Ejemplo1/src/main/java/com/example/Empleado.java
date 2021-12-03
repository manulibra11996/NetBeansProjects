package com.example;

public class Empleado {

	private Integer id;
	private String nombre;
	private String apellido;
	private Departamentos departamento;
	private Integer sexo;
	
	public Empleado(Integer id, String nombre, String apellido, Departamentos departamento, Integer sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.sexo = sexo;
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

	public Departamentos getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	
	
	
}

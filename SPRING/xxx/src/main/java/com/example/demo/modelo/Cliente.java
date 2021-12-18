package com.example.demo.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private int idCliente;

	private String apellido;


	private String email;


	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;


	private String nombrePersona;



	private String telefono;



	//bi-directional many-to-one association to Metodospago
	@OneToMany(mappedBy="cliente")
	private List<Metodospago> metodospagos;

	//bi-directional many-to-one association to Piso
	@OneToMany(mappedBy="cliente")
	private List<Piso> pisos;

	//bi-directional one-to-one association to Sesion
	@OneToOne(mappedBy="cliente")
	private Sesion sesion;

	public Cliente() {
	}



	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	

	public String getNombrePersona() {
		return this.nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Metodospago> getMetodospagos() {
		return this.metodospagos;
	}

	public void setMetodospagos(List<Metodospago> metodospagos) {
		this.metodospagos = metodospagos;
	}

	public Metodospago addMetodospago(Metodospago metodospago) {
		getMetodospagos().add(metodospago);
		metodospago.setCliente(this);

		return metodospago;
	}

	public Metodospago removeMetodospago(Metodospago metodospago) {
		getMetodospagos().remove(metodospago);
		metodospago.setCliente(null);

		return metodospago;
	}

	public List<Piso> getPisos() {
		return this.pisos;
	}

	public void setPisos(List<Piso> pisos) {
		this.pisos = pisos;
	}

	public Piso addPiso(Piso piso) {
		getPisos().add(piso);
		piso.setCliente(this);

		return piso;
	}

	public Piso removePiso(Piso piso) {
		getPisos().remove(piso);
		piso.setCliente(null);

		return piso;
	}

	public Sesion getSesion() {
		return this.sesion;
	}

	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}

}
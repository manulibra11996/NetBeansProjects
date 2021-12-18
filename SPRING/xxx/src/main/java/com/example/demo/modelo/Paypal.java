package com.example.demo.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the paypal database table.
 * 
 */
@Entity
@NamedQuery(name="Paypal.findAll", query="SELECT p FROM Paypal p")
public class Paypal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pago")
	private int idPago;

	private String correo;

	private String correoPayPal;

	private String nombrePayPal;

	//bi-directional many-to-one association to Metodospago
	@ManyToOne
	@JoinColumn(name="idPayPal")
	private Metodospago metodospago;

	public Paypal() {
	}

	public int getIdPago() {
		return this.idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreoPayPal() {
		return this.correoPayPal;
	}

	public void setCorreoPayPal(String correoPayPal) {
		this.correoPayPal = correoPayPal;
	}

	public String getNombrePayPal() {
		return this.nombrePayPal;
	}

	public void setNombrePayPal(String nombrePayPal) {
		this.nombrePayPal = nombrePayPal;
	}

	public Metodospago getMetodospago() {
		return this.metodospago;
	}

	public void setMetodospago(Metodospago metodospago) {
		this.metodospago = metodospago;
	}

}
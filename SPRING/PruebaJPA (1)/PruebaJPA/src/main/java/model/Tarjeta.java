package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tarjeta database table.
 * 
 */
@Entity
@NamedQuery(name="Tarjeta.findAll", query="SELECT t FROM Tarjeta t")
public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTarjeta;

	private int cvv;

	@Temporal(TemporalType.DATE)
	private Date fechaTarjeta;

	private String nombreTarjeta;

	private String numeroTarjeta;

	//bi-directional one-to-one association to Metodospago
	@OneToOne
	@JoinColumn(name="idTarjeta")
	private Metodospago metodospago;

	public Tarjeta() {
	}

	public int getIdTarjeta() {
		return this.idTarjeta;
	}

	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public int getCvv() {
		return this.cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Date getFechaTarjeta() {
		return this.fechaTarjeta;
	}

	public void setFechaTarjeta(Date fechaTarjeta) {
		this.fechaTarjeta = fechaTarjeta;
	}

	public String getNombreTarjeta() {
		return this.nombreTarjeta;
	}

	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}

	public String getNumeroTarjeta() {
		return this.numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Metodospago getMetodospago() {
		return this.metodospago;
	}

	public void setMetodospago(Metodospago metodospago) {
		this.metodospago = metodospago;
	}

}
package model;

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
	private int idPayPal;

	private String correoPayPal;

	private String nombrePayPal;

	//bi-directional one-to-one association to Metodospago
	@OneToOne
	@JoinColumn(name="idPayPal")
	private Metodospago metodospago;

	public Paypal() {
	}

	public int getIdPayPal() {
		return this.idPayPal;
	}

	public void setIdPayPal(int idPayPal) {
		this.idPayPal = idPayPal;
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
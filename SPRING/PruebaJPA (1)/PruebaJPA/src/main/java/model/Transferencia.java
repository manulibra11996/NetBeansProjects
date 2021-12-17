package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transferencia database table.
 * 
 */
@Entity
@NamedQuery(name="Transferencia.findAll", query="SELECT t FROM Transferencia t")
public class Transferencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTransferencia;

	private String nombreTransferencia;

	private String numeroCuenta;

	//bi-directional one-to-one association to Metodospago
	@OneToOne
	@JoinColumn(name="idTransferencia")
	private Metodospago metodospago;

	public Transferencia() {
	}

	public int getIdTransferencia() {
		return this.idTransferencia;
	}

	public void setIdTransferencia(int idTransferencia) {
		this.idTransferencia = idTransferencia;
	}

	public String getNombreTransferencia() {
		return this.nombreTransferencia;
	}

	public void setNombreTransferencia(String nombreTransferencia) {
		this.nombreTransferencia = nombreTransferencia;
	}

	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Metodospago getMetodospago() {
		return this.metodospago;
	}

	public void setMetodospago(Metodospago metodospago) {
		this.metodospago = metodospago;
	}

}
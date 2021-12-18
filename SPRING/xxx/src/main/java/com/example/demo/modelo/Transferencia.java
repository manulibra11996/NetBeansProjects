package com.example.demo.modelo;

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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_transferencia")
	private int idTransferencia;

	@Column(name="concepto_pago")
	private String conceptoPago;



	private String iban;


	@Column(name="id_pago")
	private int idPago;


	private String nombreTransferencia;

	private String numeroCuenta;

	//bi-directional many-to-one association to Metodospago
	@ManyToOne
	@JoinColumn(name="idTransferencia")
	private Metodospago metodospago;

	public Transferencia() {
	}

	

	public String getConceptoPago() {
		return this.conceptoPago;
	}

	public void setConceptoPago(String conceptoPago) {
		this.conceptoPago = conceptoPago;
	}

	public String getIban() {
		return this.iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public int getIdPago() {
		return this.idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
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
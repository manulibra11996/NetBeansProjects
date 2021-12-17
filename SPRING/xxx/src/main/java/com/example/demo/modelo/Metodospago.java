package com.example.demo.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the metodospago database table.
 * 
 */
@Entity
@NamedQuery(name="Metodospago.findAll", query="SELECT m FROM Metodospago m")
public class Metodospago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMetodosPago;

	private String nombreMetodoPago;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="metodospago")
	private List<Factura> facturas;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;

	//bi-directional many-to-one association to Paypal
	@OneToMany(mappedBy="metodospago")
	private List<Paypal> paypals;

	//bi-directional many-to-one association to Tarjeta
	@OneToMany(mappedBy="metodospago")
	private List<Tarjeta> tarjetas;

	//bi-directional many-to-one association to Transferencia
	@OneToMany(mappedBy="metodospago")
	private List<Transferencia> transferencias;

	public Metodospago() {
	}

	public int getIdMetodosPago() {
		return this.idMetodosPago;
	}

	public void setIdMetodosPago(int idMetodosPago) {
		this.idMetodosPago = idMetodosPago;
	}

	public String getNombreMetodoPago() {
		return this.nombreMetodoPago;
	}

	public void setNombreMetodoPago(String nombreMetodoPago) {
		this.nombreMetodoPago = nombreMetodoPago;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setMetodospago(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setMetodospago(null);

		return factura;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Paypal> getPaypals() {
		return this.paypals;
	}

	public void setPaypals(List<Paypal> paypals) {
		this.paypals = paypals;
	}

	public Paypal addPaypal(Paypal paypal) {
		getPaypals().add(paypal);
		paypal.setMetodospago(this);

		return paypal;
	}

	public Paypal removePaypal(Paypal paypal) {
		getPaypals().remove(paypal);
		paypal.setMetodospago(null);

		return paypal;
	}

	public List<Tarjeta> getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Tarjeta addTarjeta(Tarjeta tarjeta) {
		getTarjetas().add(tarjeta);
		tarjeta.setMetodospago(this);

		return tarjeta;
	}

	public Tarjeta removeTarjeta(Tarjeta tarjeta) {
		getTarjetas().remove(tarjeta);
		tarjeta.setMetodospago(null);

		return tarjeta;
	}

	public List<Transferencia> getTransferencias() {
		return this.transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	public Transferencia addTransferencia(Transferencia transferencia) {
		getTransferencias().add(transferencia);
		transferencia.setMetodospago(this);

		return transferencia;
	}

	public Transferencia removeTransferencia(Transferencia transferencia) {
		getTransferencias().remove(transferencia);
		transferencia.setMetodospago(null);

		return transferencia;
	}

}
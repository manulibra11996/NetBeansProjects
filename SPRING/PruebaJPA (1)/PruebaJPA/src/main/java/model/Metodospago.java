package model;

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
	private int idMetodosPago;

	private int idCliente;

	private String nombreMetodoPago;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="metodospago")
	private List<Factura> facturas;

	//bi-directional one-to-one association to Paypal
	@OneToOne(mappedBy="metodospago")
	private Paypal paypal;

	//bi-directional one-to-one association to Tarjeta
	@OneToOne(mappedBy="metodospago")
	private Tarjeta tarjeta;

	//bi-directional one-to-one association to Transferencia
	@OneToOne(mappedBy="metodospago")
	private Transferencia transferencia;

	public Metodospago() {
	}

	public int getIdMetodosPago() {
		return this.idMetodosPago;
	}

	public void setIdMetodosPago(int idMetodosPago) {
		this.idMetodosPago = idMetodosPago;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public Paypal getPaypal() {
		return this.paypal;
	}

	public void setPaypal(Paypal paypal) {
		this.paypal = paypal;
	}

	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public Transferencia getTransferencia() {
		return this.transferencia;
	}

	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}

}
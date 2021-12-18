package com.example.demo.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the factura database table.
 * 
 */
@Entity
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idfactura;

	@Column(name="articulo_idarticulo")
	private int articuloIdarticulo;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private int idFactura;

	private BigDecimal precio;

	private String precioFactura;

	@Column(name="usuario_idusuario")
	private int usuarioIdusuario;

	//bi-directional many-to-one association to Metodospago
	@ManyToOne
	@JoinColumn(name="idUsuarioCliente")
	private Metodospago metodospago;

	//bi-directional many-to-one association to Piso
	@ManyToOne
	@JoinColumn(name="idUsuarioDueno")
	private Piso piso;

	//bi-directional many-to-one association to Opinion
	@OneToMany(mappedBy="factura1")
	private List<Opinion> opinions1;

	//bi-directional many-to-one association to Opinion
	@OneToMany(mappedBy="factura2")
	private List<Opinion> opinions2;

	public Factura() {
	}

	public int getIdfactura() {
		return this.idfactura;
	}

	public void setIdfactura(int idfactura) {
		this.idfactura = idfactura;
	}

	public int getArticuloIdarticulo() {
		return this.articuloIdarticulo;
	}

	public void setArticuloIdarticulo(int articuloIdarticulo) {
		this.articuloIdarticulo = articuloIdarticulo;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getPrecioFactura() {
		return this.precioFactura;
	}

	public void setPrecioFactura(String precioFactura) {
		this.precioFactura = precioFactura;
	}

	public int getUsuarioIdusuario() {
		return this.usuarioIdusuario;
	}

	public void setUsuarioIdusuario(int usuarioIdusuario) {
		this.usuarioIdusuario = usuarioIdusuario;
	}

	public Metodospago getMetodospago() {
		return this.metodospago;
	}

	public void setMetodospago(Metodospago metodospago) {
		this.metodospago = metodospago;
	}

	public Piso getPiso() {
		return this.piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public List<Opinion> getOpinions1() {
		return this.opinions1;
	}

	public void setOpinions1(List<Opinion> opinions1) {
		this.opinions1 = opinions1;
	}

	public Opinion addOpinions1(Opinion opinions1) {
		getOpinions1().add(opinions1);
		opinions1.setFactura1(this);

		return opinions1;
	}

	public Opinion removeOpinions1(Opinion opinions1) {
		getOpinions1().remove(opinions1);
		opinions1.setFactura1(null);

		return opinions1;
	}

	public List<Opinion> getOpinions2() {
		return this.opinions2;
	}

	public void setOpinions2(List<Opinion> opinions2) {
		this.opinions2 = opinions2;
	}

	public Opinion addOpinions2(Opinion opinions2) {
		getOpinions2().add(opinions2);
		opinions2.setFactura2(this);

		return opinions2;
	}

	public Opinion removeOpinions2(Opinion opinions2) {
		getOpinions2().remove(opinions2);
		opinions2.setFactura2(null);

		return opinions2;
	}

}
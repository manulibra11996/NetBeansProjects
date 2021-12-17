package model;

import java.io.Serializable;
import javax.persistence.*;
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
	private int idFactura;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	private String precioFactura;

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

	public int getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
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

	public String getPrecioFactura() {
		return this.precioFactura;
	}

	public void setPrecioFactura(String precioFactura) {
		this.precioFactura = precioFactura;
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
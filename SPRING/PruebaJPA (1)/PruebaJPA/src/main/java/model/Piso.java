package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the piso database table.
 * 
 */
@Entity
@NamedQuery(name="Piso.findAll", query="SELECT p FROM Piso p")
public class Piso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPiso;

	private String descripcionPiso;

	@Temporal(TemporalType.DATE)
	private Date fechaAlquiler;

	private int idClienteDueno;

	private String imagenesPiso;

	private String metrosCuadrados;

	private String nombrePiso;

	private BigDecimal precio;

	private String ubicacionPiso;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="piso")
	private List<Factura> facturas;

	//bi-directional many-to-one association to Opinion
	@OneToMany(mappedBy="piso")
	private List<Opinion> opinions;

	//bi-directional many-to-one association to Categoriapiso
	@ManyToOne
	@JoinColumn(name="idCategoriaPiso")
	private Categoriapiso categoriapiso;

	public Piso() {
	}

	public int getIdPiso() {
		return this.idPiso;
	}

	public void setIdPiso(int idPiso) {
		this.idPiso = idPiso;
	}

	public String getDescripcionPiso() {
		return this.descripcionPiso;
	}

	public void setDescripcionPiso(String descripcionPiso) {
		this.descripcionPiso = descripcionPiso;
	}

	public Date getFechaAlquiler() {
		return this.fechaAlquiler;
	}

	public void setFechaAlquiler(Date fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}

	public int getIdClienteDueno() {
		return this.idClienteDueno;
	}

	public void setIdClienteDueno(int idClienteDueno) {
		this.idClienteDueno = idClienteDueno;
	}

	public String getImagenesPiso() {
		return this.imagenesPiso;
	}

	public void setImagenesPiso(String imagenesPiso) {
		this.imagenesPiso = imagenesPiso;
	}

	public String getMetrosCuadrados() {
		return this.metrosCuadrados;
	}

	public void setMetrosCuadrados(String metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getNombrePiso() {
		return this.nombrePiso;
	}

	public void setNombrePiso(String nombrePiso) {
		this.nombrePiso = nombrePiso;
	}

	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getUbicacionPiso() {
		return this.ubicacionPiso;
	}

	public void setUbicacionPiso(String ubicacionPiso) {
		this.ubicacionPiso = ubicacionPiso;
	}

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setPiso(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setPiso(null);

		return factura;
	}

	public List<Opinion> getOpinions() {
		return this.opinions;
	}

	public void setOpinions(List<Opinion> opinions) {
		this.opinions = opinions;
	}

	public Opinion addOpinion(Opinion opinion) {
		getOpinions().add(opinion);
		opinion.setPiso(this);

		return opinion;
	}

	public Opinion removeOpinion(Opinion opinion) {
		getOpinions().remove(opinion);
		opinion.setPiso(null);

		return opinion;
	}

	public Categoriapiso getCategoriapiso() {
		return this.categoriapiso;
	}

	public void setCategoriapiso(Categoriapiso categoriapiso) {
		this.categoriapiso = categoriapiso;
	}

}
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the opinion database table.
 * 
 */
@Entity
@NamedQuery(name="Opinion.findAll", query="SELECT o FROM Opinion o")
public class Opinion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idOpinion;

	private String contraOpinion;

	private int estrellas;

	private String textoOpinion;

	private String tituloOpinion;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Factura factura1;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="idDueno")
	private Factura factura2;

	//bi-directional many-to-one association to Piso
	@ManyToOne
	@JoinColumn(name="idPiso")
	private Piso piso;

	public Opinion() {
	}

	public int getIdOpinion() {
		return this.idOpinion;
	}

	public void setIdOpinion(int idOpinion) {
		this.idOpinion = idOpinion;
	}

	public String getContraOpinion() {
		return this.contraOpinion;
	}

	public void setContraOpinion(String contraOpinion) {
		this.contraOpinion = contraOpinion;
	}

	public int getEstrellas() {
		return this.estrellas;
	}

	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}

	public String getTextoOpinion() {
		return this.textoOpinion;
	}

	public void setTextoOpinion(String textoOpinion) {
		this.textoOpinion = textoOpinion;
	}

	public String getTituloOpinion() {
		return this.tituloOpinion;
	}

	public void setTituloOpinion(String tituloOpinion) {
		this.tituloOpinion = tituloOpinion;
	}

	public Factura getFactura1() {
		return this.factura1;
	}

	public void setFactura1(Factura factura1) {
		this.factura1 = factura1;
	}

	public Factura getFactura2() {
		return this.factura2;
	}

	public void setFactura2(Factura factura2) {
		this.factura2 = factura2;
	}

	public Piso getPiso() {
		return this.piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

}
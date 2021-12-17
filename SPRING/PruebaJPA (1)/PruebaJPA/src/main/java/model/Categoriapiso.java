package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categoriapiso database table.
 * 
 */
@Entity
@NamedQuery(name="Categoriapiso.findAll", query="SELECT c FROM Categoriapiso c")
public class Categoriapiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCategoriaPiso;

	private String nombreCategoriaPiso;

	//bi-directional many-to-one association to Piso
	@OneToMany(mappedBy="categoriapiso")
	private List<Piso> pisos;

	public Categoriapiso() {
	}

	public int getIdCategoriaPiso() {
		return this.idCategoriaPiso;
	}

	public void setIdCategoriaPiso(int idCategoriaPiso) {
		this.idCategoriaPiso = idCategoriaPiso;
	}

	public String getNombreCategoriaPiso() {
		return this.nombreCategoriaPiso;
	}

	public void setNombreCategoriaPiso(String nombreCategoriaPiso) {
		this.nombreCategoriaPiso = nombreCategoriaPiso;
	}

	public List<Piso> getPisos() {
		return this.pisos;
	}

	public void setPisos(List<Piso> pisos) {
		this.pisos = pisos;
	}

	public Piso addPiso(Piso piso) {
		getPisos().add(piso);
		piso.setCategoriapiso(this);

		return piso;
	}

	public Piso removePiso(Piso piso) {
		getPisos().remove(piso);
		piso.setCategoriapiso(null);

		return piso;
	}

}
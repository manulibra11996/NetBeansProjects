package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "opinion")
public class Opinion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idopinion")
	private Long idOpinion;
	
	@Column(name="TituloOpinion")
	private String tituloOpinion;
	
	@Column(name = "TextoOpinion")
	private String textoOpinion;

	@Column(name = "Estrellas")
	private Integer estrellas;
	
	@Column(name = "ContraOpinion")
	private String contraOpinion;

	public Long getIdOpinion() {
		return idOpinion;
	}

	public void setIdOpinion(Long idOpinion) {
		this.idOpinion = idOpinion;
	}

	public String getTituloOpinion() {
		return tituloOpinion;
	}

	public void setTituloOpinion(String tituloOpinion) {
		this.tituloOpinion = tituloOpinion;
	}

	public String getTextoOpinion() {
		return textoOpinion;
	}

	public void setTextoOpinion(String textoOpinion) {
		this.textoOpinion = textoOpinion;
	}

	public Integer getEstrellas() {
		return estrellas;
	}

	public void setEstrellas(Integer estrellas) {
		this.estrellas = estrellas;
	}

	public String getContraOpinion() {
		return contraOpinion;
	}

	public void setContraOpinion(String contraOpinion) {
		this.contraOpinion = contraOpinion;
	}
	

	
}

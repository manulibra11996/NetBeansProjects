/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "tarjeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjeta.findAll", query = "SELECT t FROM Tarjeta t"),
    @NamedQuery(name = "Tarjeta.findByIdtarjeta", query = "SELECT t FROM Tarjeta t WHERE t.idtarjeta = :idtarjeta"),
    @NamedQuery(name = "Tarjeta.findByNumeroTarjeta", query = "SELECT t FROM Tarjeta t WHERE t.numeroTarjeta = :numeroTarjeta"),
    @NamedQuery(name = "Tarjeta.findByA\u00f1oCaducidad", query = "SELECT t FROM Tarjeta t WHERE t.a\u00f1oCaducidad = :a\u00f1oCaducidad"),
    @NamedQuery(name = "Tarjeta.findByCvv", query = "SELECT t FROM Tarjeta t WHERE t.cvv = :cvv")})
public class Tarjeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtarjeta")
    private Integer idtarjeta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numero_tarjeta")
    private String numeroTarjeta;
    @Column(name = "a\u00f1o_caducidad")
    private Integer añoCaducidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cvv")
    private int cvv;

    public Tarjeta() {
    }

    public Tarjeta(Integer idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public Tarjeta(Integer idtarjeta, String numeroTarjeta, int cvv) {
        this.idtarjeta = idtarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
    }

    public Integer getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(Integer idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Integer getAñoCaducidad() {
        return añoCaducidad;
    }

    public void setAñoCaducidad(Integer añoCaducidad) {
        this.añoCaducidad = añoCaducidad;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtarjeta != null ? idtarjeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjeta)) {
            return false;
        }
        Tarjeta other = (Tarjeta) object;
        if ((this.idtarjeta == null && other.idtarjeta != null) || (this.idtarjeta != null && !this.idtarjeta.equals(other.idtarjeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.institutomunicipaldeportesalfa.domain.Tarjeta[ idtarjeta=" + idtarjeta + " ]";
    }
    
}

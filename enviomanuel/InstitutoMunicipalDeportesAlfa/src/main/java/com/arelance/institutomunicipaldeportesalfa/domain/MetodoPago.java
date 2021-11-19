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
@Table(name = "metodo_pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MetodoPago.findAll", query = "SELECT m FROM MetodoPago m"),
    @NamedQuery(name = "MetodoPago.findByIdmetodoPago", query = "SELECT m FROM MetodoPago m WHERE m.idmetodoPago = :idmetodoPago"),
    @NamedQuery(name = "MetodoPago.findByNombreMetodoPago", query = "SELECT m FROM MetodoPago m WHERE m.nombreMetodoPago = :nombreMetodoPago")})
public class MetodoPago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmetodo_pago")
    private Integer idmetodoPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_metodo_pago")
    private String nombreMetodoPago;

    public MetodoPago() {
    }

    public MetodoPago(Integer idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }

    public MetodoPago(Integer idmetodoPago, String nombreMetodoPago) {
        this.idmetodoPago = idmetodoPago;
        this.nombreMetodoPago = nombreMetodoPago;
    }

    public Integer getIdmetodoPago() {
        return idmetodoPago;
    }

    public void setIdmetodoPago(Integer idmetodoPago) {
        this.idmetodoPago = idmetodoPago;
    }

    public String getNombreMetodoPago() {
        return nombreMetodoPago;
    }

    public void setNombreMetodoPago(String nombreMetodoPago) {
        this.nombreMetodoPago = nombreMetodoPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmetodoPago != null ? idmetodoPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MetodoPago)) {
            return false;
        }
        MetodoPago other = (MetodoPago) object;
        if ((this.idmetodoPago == null && other.idmetodoPago != null) || (this.idmetodoPago != null && !this.idmetodoPago.equals(other.idmetodoPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.institutomunicipaldeportesalfa.domain.MetodoPago[ idmetodoPago=" + idmetodoPago + " ]";
    }
    
}

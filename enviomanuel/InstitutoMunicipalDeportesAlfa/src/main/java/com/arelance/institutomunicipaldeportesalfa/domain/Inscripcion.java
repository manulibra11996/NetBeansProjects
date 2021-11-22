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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "inscripcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i"),
    @NamedQuery(name = "Inscripcion.findByIdinscripcion", query = "SELECT i FROM Inscripcion i WHERE i.idinscripcion = :idinscripcion")})
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idinscripcion")
    private Integer idinscripcion;

    public Inscripcion() {
    }

    public Inscripcion(Integer idinscripcion) {
        this.idinscripcion = idinscripcion;
    }

    public Integer getIdinscripcion() {
        return idinscripcion;
    }

    public void setIdinscripcion(Integer idinscripcion) {
        this.idinscripcion = idinscripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinscripcion != null ? idinscripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.idinscripcion == null && other.idinscripcion != null) || (this.idinscripcion != null && !this.idinscripcion.equals(other.idinscripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.institutomunicipaldeportesalfa.domain.Inscripcion[ idinscripcion=" + idinscripcion + " ]";
    }
    
}

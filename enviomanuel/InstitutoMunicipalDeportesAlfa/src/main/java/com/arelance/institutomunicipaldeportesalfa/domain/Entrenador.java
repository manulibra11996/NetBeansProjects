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
@Table(name = "entrenador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrenador.findAll", query = "SELECT e FROM Entrenador e"),
    @NamedQuery(name = "Entrenador.findByIdentrenador", query = "SELECT e FROM Entrenador e WHERE e.identrenador = :identrenador"),
    @NamedQuery(name = "Entrenador.findByNombreEntrenador", query = "SELECT e FROM Entrenador e WHERE e.nombreEntrenador = :nombreEntrenador"),
    @NamedQuery(name = "Entrenador.findByApellidoEntrenador", query = "SELECT e FROM Entrenador e WHERE e.apellidoEntrenador = :apellidoEntrenador"),
    @NamedQuery(name = "Entrenador.findByTelefonoEntrenador", query = "SELECT e FROM Entrenador e WHERE e.telefonoEntrenador = :telefonoEntrenador"),
    @NamedQuery(name = "Entrenador.findByEmailEntrenador", query = "SELECT e FROM Entrenador e WHERE e.emailEntrenador = :emailEntrenador")})
public class Entrenador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "identrenador")
    private Integer identrenador;
    @Size(max = 45)
    @Column(name = "nombre_entrenador")
    private String nombreEntrenador;
    @Size(max = 45)
    @Column(name = "apellido_entrenador")
    private String apellidoEntrenador;
    @Column(name = "telefono_entrenador")
    private Integer telefonoEntrenador;
    @Size(max = 45)
    @Column(name = "email_entrenador")
    private String emailEntrenador;

    public Entrenador() {
    }

    public Entrenador(Integer identrenador) {
        this.identrenador = identrenador;
    }

    public Integer getIdentrenador() {
        return identrenador;
    }

    public void setIdentrenador(Integer identrenador) {
        this.identrenador = identrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getApellidoEntrenador() {
        return apellidoEntrenador;
    }

    public void setApellidoEntrenador(String apellidoEntrenador) {
        this.apellidoEntrenador = apellidoEntrenador;
    }

    public Integer getTelefonoEntrenador() {
        return telefonoEntrenador;
    }

    public void setTelefonoEntrenador(Integer telefonoEntrenador) {
        this.telefonoEntrenador = telefonoEntrenador;
    }

    public String getEmailEntrenador() {
        return emailEntrenador;
    }

    public void setEmailEntrenador(String emailEntrenador) {
        this.emailEntrenador = emailEntrenador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identrenador != null ? identrenador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entrenador)) {
            return false;
        }
        Entrenador other = (Entrenador) object;
        if ((this.identrenador == null && other.identrenador != null) || (this.identrenador != null && !this.identrenador.equals(other.identrenador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.institutomunicipaldeportesalfa.domain.Entrenador[ identrenador=" + identrenador + " ]";
    }
    
}

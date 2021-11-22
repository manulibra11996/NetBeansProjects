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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "actividad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a"),
    @NamedQuery(name = "Actividad.findByIdactividad", query = "SELECT a FROM Actividad a WHERE a.idactividad = :idactividad"),
    @NamedQuery(name = "Actividad.findByNombreActividad", query = "SELECT a FROM Actividad a WHERE a.nombreActividad = :nombreActividad"),
    @NamedQuery(name = "Actividad.findByLugar", query = "SELECT a FROM Actividad a WHERE a.lugar = :lugar"),
    @NamedQuery(name = "Actividad.findByPrecio", query = "SELECT a FROM Actividad a WHERE a.precio = :precio"),
    @NamedQuery(name = "Actividad.findByDescripcion", query = "SELECT a FROM Actividad a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Actividad.findByFechaComienzo", query = "SELECT a FROM Actividad a WHERE a.fechaComienzo = :fechaComienzo"),
    @NamedQuery(name = "Actividad.findByFechaFinalizacion", query = "SELECT a FROM Actividad a WHERE a.fechaFinalizacion = :fechaFinalizacion"),
    @NamedQuery(name = "Actividad.findByDiasActividad", query = "SELECT a FROM Actividad a WHERE a.diasActividad = :diasActividad")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idactividad")
    private Integer idactividad;
    @Size(max = 45)
    @Column(name = "nombre_actividad")
    private String nombreActividad;
    @Size(max = 45)
    @Column(name = "lugar")
    private String lugar;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Float precio;
    @Size(max = 1000)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "fecha_comienzo")
    private String fechaComienzo;
    @Size(max = 45)
    @Column(name = "fecha_finalizacion")
    private String fechaFinalizacion;
    @Size(max = 45)
    @Column(name = "dias_actividad")
    private String diasActividad;

    public Actividad() {
    }

    public Actividad(Integer idactividad) {
        this.idactividad = idactividad;
    }

    public Integer getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(Integer idactividad) {
        this.idactividad = idactividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(String fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getDiasActividad() {
        return diasActividad;
    }

    public void setDiasActividad(String diasActividad) {
        this.diasActividad = diasActividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactividad != null ? idactividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.idactividad == null && other.idactividad != null) || (this.idactividad != null && !this.idactividad.equals(other.idactividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.arelance.institutomunicipaldeportesalfa.domain.Actividad[ idactividad=" + idactividad + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgajpa.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author salvador
 */
@Entity
@Table(name = "aficiones")
@NamedQueries({
    @NamedQuery(name = "Find.findAll", query = "SELECT a FROM Aficion a")})
public class Aficion implements Serializable {

    private static Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aficion")
    private int idAficion;
    @Column(name = "nombre_aficion")
    private String nombre;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona persona;

    public Aficion() {
    }

    public Aficion(String nombre, String descripcion, Persona persona) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.idAficion;
        hash = 61 * hash + Objects.hashCode(this.nombre);
        hash = 61 * hash + Objects.hashCode(this.descripcion);
        hash = 61 * hash + Objects.hashCode(this.persona);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aficion other = (Aficion) obj;
        if (this.idAficion != other.idAficion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        return true;
    }

    /**
     * @return the idAficion
     */
    public int getIdAficion() {
        return idAficion;
    }

    /**
     * @param idAficion the idAficion to set
     */
    public void setIdAficion(int idAficion) {
        this.idAficion = idAficion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}

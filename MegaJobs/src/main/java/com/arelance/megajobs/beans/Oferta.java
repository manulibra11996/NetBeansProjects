/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.megajobs.beans;

import java.util.Objects;

/**
 *
 * @author Manuel
 */
public class Oferta {

    private String descripcionLarga;
    private Localizacion localizacion;
    private Integer salario;
    private Experiencia experiencia;

    public Oferta(String descripcionLarga, Localizacion localizacion, Integer salario, Experiencia experiencia) {
        this.descripcionLarga = descripcionLarga;
        this.localizacion = localizacion;
        this.salario = salario;
        this.experiencia = experiencia;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.descripcionLarga);
        hash = 67 * hash + Objects.hashCode(this.localizacion);
        hash = 67 * hash + Objects.hashCode(this.salario);
        hash = 67 * hash + Objects.hashCode(this.experiencia);
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
        final Oferta other = (Oferta) obj;
        if (!Objects.equals(this.descripcionLarga, other.descripcionLarga)) {
            return false;
        }
        if (this.localizacion != other.localizacion) {
            return false;
        }
        if (!Objects.equals(this.salario, other.salario)) {
            return false;
        }
        if (this.experiencia != other.experiencia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "descripcionLarga=" + descripcionLarga + ", localizacion=" + localizacion + ", salario=" + salario + ", experiencia=" + experiencia;
    }

}

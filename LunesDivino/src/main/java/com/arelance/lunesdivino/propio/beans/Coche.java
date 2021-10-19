/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.lunesdivino.propio.beans;

import java.util.Objects;

/**
 *
 * @author Manuel
 */
public final class Coche implements Cloneable {

    private final String matricula;
    private Propietario propietario;

    public Coche(String matricula) {
        this.matricula = matricula;
    }

    public Coche(String matricula, Propietario propietario) {
        this.matricula = matricula;
        this.propietario = propietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public Coche clone() throws CloneNotSupportedException {
        Coche clone = (Coche) super.clone();
        clone.propietario = this.getPropietario();
        return clone;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.matricula);
        hash = 17 * hash + Objects.hashCode(this.propietario);
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
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.propietario, other.propietario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula: " + matricula + ",propietario: " + propietario + '}';
    }

}

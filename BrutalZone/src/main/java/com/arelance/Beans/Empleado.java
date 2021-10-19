/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.Beans;

/**
 *
 * @author Manuel
 */
public class Empleado extends Persona {

    private float salario;

    public Empleado(String nombre, float salario) {
        super(nombre);
        this.salario = salario;
    }

    public Empleado(String nombre) {
        super(nombre);
    }

    public Empleado() {
        super(null);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Float.floatToIntBits(this.salario);
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
        final Empleado other = (Empleado) obj;
//        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
//            return false;
//        }
        return super.equals(other) && (Float.floatToIntBits(this.salario) == Float.floatToIntBits(other.salario));
    }

    public int compareTo(Empleado o) {
        int resultado = super.compareTo(o);
        if (resultado == 0 && o.getClass().equals(this.getClass())) {
            resultado = Float.compare(salario, o.salario);
        }
        return resultado;
    }

}

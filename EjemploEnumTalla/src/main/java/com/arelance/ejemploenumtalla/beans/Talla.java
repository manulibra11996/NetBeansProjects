/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemploenumtalla.beans;

/**
 *
 * @author Manuel
 */
public enum Talla {
    SMALL("S"), MEDIUM("M"), LARGE("L"), XLARGE("XL");
    private String abreviatura;

    private Talla(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

}

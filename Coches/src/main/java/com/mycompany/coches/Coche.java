/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coches;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author manuel
 */
@Named(value = "coche")
@RequestScoped
public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String comprador;
    private String[] extras;

    public Coche() {
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String[] getExtras() {
        return extras;
    }

    public void setExtras(String[] extras) {
        this.extras = extras;
    }

    public Marca[] getValuesMarca() {
        return Marca.values();
    }
    
    public Modelo[] getValuesModelo() {
        return Modelo.values();
    }
    
    public Color[] getValuesColor() {
        return Color.values();
    }
    
    public Comprador[] getValuesComprador() {
        return Comprador.values();
    }
    
    public Extra[] getValuesExtra() {
        return Extra.values();
    }
}

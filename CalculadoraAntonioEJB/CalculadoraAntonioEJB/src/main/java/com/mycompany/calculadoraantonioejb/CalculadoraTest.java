/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraantonioejb;

import java.io.Serializable;
import javax.inject.Named;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author salvador
 */
@Named(value = "calculadoraTest")
@SessionScoped
public class CalculadoraTest implements Serializable{
   @Inject
    private CalculadoraBeanLocal calculadoraBeanLocal;
  
    public CalculadoraTest() {
    }
     /**
     * @return the calculadoraBeanLocal
     */
    public CalculadoraBeanLocal getCalculadoraBeanLocal() {
        return calculadoraBeanLocal;
    }

    /**
     * @param calculadoraBeanLocal the calculadoraBeanLocal to set
     */
    public void setCalculadoraBeanLocal(CalculadoraBeanLocal calculadoraBeanLocal) {
        this.calculadoraBeanLocal = calculadoraBeanLocal;
    }
}

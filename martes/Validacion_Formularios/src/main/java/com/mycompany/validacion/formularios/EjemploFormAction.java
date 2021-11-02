/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.validacion.formularios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.inject.Named;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;



/**
 *
 * @author salvador
 */
@Model
public class EjemploFormAction {

    
    private Cuenta  cuenta;
    /**
     * Creates a new instance of EjemploFormAction
     */
    public EjemploFormAction() {
    }
    @PostConstruct
    public void init(){
        cuenta=new Cuenta();
        cuenta.setSaldo(new BigDecimal(0.00));
        cuenta.setNivelEndeudamiento(new BigDecimal(0.5));
        cuenta.setFechaRenovacion(new Date(System.currentTimeMillis()));
        
    }
    @Produces
    @Named
    @RequestScoped
    public Cuenta getCuenta(){
        return  cuenta;
    }
    
    public String crearCuenta(){
        return "verDetalle";
    }
    
}

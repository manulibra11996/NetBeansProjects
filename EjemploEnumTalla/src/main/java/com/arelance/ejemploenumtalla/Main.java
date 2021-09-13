/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemploenumtalla;

import com.arelance.ejemploenumtalla.beans.DiasLaborableSemana;
import com.arelance.ejemploenumtalla.beans.Talla;
import java.time.Month;

/**
 *
 * @author Manuel
 */
public class Main {
    public static void main(String[] args) {
        
//        -------------------Talla-----------------------------------------
        
//        Talla talla = Enum.valueOf(Talla.class, "medium".toUpperCase());
//        //Ejemplo equals
//        System.out.println(talla.MEDIUM.equals(talla));
//        
//        String msg = null;
//        
//        switch(talla){
//            case SMALL:
//                msg = "Soy la talla pequeña";
//                break;
//            case MEDIUM:
//                msg = "Soy la talla mediana";
//                break;
//            case LARGE:
//                msg = "Soy la talla grande";
//                break;
//            case XLARGE:
//                msg = "Soy la talla extra grande";
//                break;
//            
//        }
//        System.out.println(msg);
        
        
//        ----------------------Dias de semana--------------------------------
        
        DiasLaborableSemana.LUNES.asignarDiaFestivo();
        
        for (DiasLaborableSemana dia : DiasLaborableSemana.values()) {
            if (dia.isLaborable()) {
                System.out.println(dia);
            }
        }
        System.out.println(" ");
        DiasLaborableSemana.intercambiarDiaLaborable(DiasLaborableSemana.MARTES, 
                DiasLaborableSemana.DOMINGO);
        
        for (DiasLaborableSemana dia : DiasLaborableSemana.values()) {
            if (dia.isLaborable()) {
                System.out.println(dia);
            }
        }
        System.out.println(" ");
        
        System.out.println(DiasLaborableSemana.contarDiasFestivos());
  

}

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
public enum DiasLaborableSemana {
    LUNES(true),MARTES(true),MIERCOLES(true),JUEVES(true),VIERNES(true),SABADO(false),DOMINGO(false);
    private boolean laborable;

    private DiasLaborableSemana(boolean laborable) {
        this.laborable = laborable;
    }

    public boolean isLaborable() {
        return laborable;
    }

    public void setLaborable(boolean laborable) {
        this.laborable = laborable;
    }

   
    public DiasLaborableSemana asignarDiaFestivo (){
        DiasLaborableSemana retVal=null;
        
        laborable=false;
                
        for (DiasLaborableSemana diaSemana : DiasLaborableSemana.values()) {
            if (!this.equals(diaSemana) && diaSemana.laborable == false) {
                diaSemana.laborable =! diaSemana.laborable;
                retVal = diaSemana;
                return retVal;
            }
        }
        return retVal;
    }
    
    public static void intercambiarDiaLaborable (DiasLaborableSemana dia1, 
            DiasLaborableSemana dia2) throws UnableCrossDaysExeption{
        if (dia1.equals(dia2)) {
            throw new UnableCrossDaysExeption();
        }
        if(dia1.laborable != dia2.laborable){
            dia1.laborable = dia2.laborable;
            dia2.laborable =! dia1.laborable;
        }
    }
    
    public static int contarDiasFestivos(){
        int contador = 0;
        
        for (DiasLaborableSemana diaSemana : DiasLaborableSemana.values()) {
            if (!diaSemana.isLaborable()) {
                contador++;
            }
        }
        return contador;
    }
}

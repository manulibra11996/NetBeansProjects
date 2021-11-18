/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraantonioejb;

import javax.ejb.Stateful;

/**
 *
 * @author salvador
 */

@Stateful
public class CalculadoraBean implements CalculadoraBeanLocal {
    private int numero;
    @Override
    public int add(int num) {
        numero=numero+num;
       return numero;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int getNumber() {
      return numero;
    }
}

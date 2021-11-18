/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoraantonioejb;

import javax.ejb.Local;

/**
 *
 * @author salvador
 */
@Local
public interface CalculadoraBeanLocal {
    int add(int num);
    int getNumber();
}

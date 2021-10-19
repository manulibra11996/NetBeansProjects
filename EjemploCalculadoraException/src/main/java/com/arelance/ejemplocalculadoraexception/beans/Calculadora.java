/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplocalculadoraexception.beans;

/**
 *
 * @author Manuel
 */
public class Calculadora {

    /**
     * Realiza el calculo entre dividiendo y divisro, en caso de divisor es 0
     * salta una exepcion del tipo aritmetico
     *
     * @param dividiendo
     * @param divisor
     * @return dividiendo / divisor
     * @throws ArithmeticException
     */
    public double dividir(double dividiendo, double divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        return dividiendo / divisor;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciolambdn8.interfaces;

/**
 *
 * @author manuel
 */
@FunctionalInterface
public interface Operacion<T> {
    T calcular(T x, T y);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.filtrodto.dtos.filters;

import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class MinFilter extends Fiter {

    private int minimo;

    public MinFilter(int minimo) {
        this.minimo = minimo;
    }

    @Override
    public String execute() {

        return "edad>=" + minimo;
        // 
    }

}

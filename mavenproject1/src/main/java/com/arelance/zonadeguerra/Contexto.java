/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.zonadeguerra;

/**
 *
 * @author Manuel
 */
public class Contexto {

    private static Contexto contexto;

    private Contexto() {
    }

    public static Contexto getInstance() {
        if (contexto == null) {
            contexto = new Contexto();
        }
        return contexto;
    }

}

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
public class Dumy {

    public static void main(String[] args) {
        Contexto a = Contexto.getInstance();
        Contexto b = Contexto.getInstance();

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));

        Object c = new Object();
        System.out.println(c.getClass() == a.getClass());
        System.out.println(a instanceof Object);
    }
}

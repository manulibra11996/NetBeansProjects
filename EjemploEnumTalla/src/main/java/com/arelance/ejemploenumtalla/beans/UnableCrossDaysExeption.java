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
public class UnableCrossDaysExeption extends Exception {

    /**
     * Creates a new instance of <code>UnableCrossDaysExeption</code> without
     * detail message.
     */
    public UnableCrossDaysExeption() {
    }

    /**
     * Constructs an instance of <code>UnableCrossDaysExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UnableCrossDaysExeption(String msg) {
        super(msg);
    }
}

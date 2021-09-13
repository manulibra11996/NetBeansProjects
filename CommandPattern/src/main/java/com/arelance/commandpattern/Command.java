/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.commandpattern;

/**
 *
 * @author Admin
 */
public interface Command <T>{
    
    void execute(T t);
    
}

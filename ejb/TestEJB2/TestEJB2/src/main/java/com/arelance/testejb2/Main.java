/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.testejb2;


import beans.HolaMundoEjbRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author salvador
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Inicieando llamada...");
        try {
            Context jndi=new InitialContext();
//            HolaMundoEjbRemote holaMundo=(HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB2/HolaMundoEjebIml");
             HolaMundoEjbRemote holaMundo = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB2-1.0-SNAPSHOT/HolaMundoEjebIml!beans.HolaMundoEjbRemote");
            System.out.println(holaMundo.sumar(2,3));
        } catch (NamingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

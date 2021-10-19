/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.holamundoejb;

import beans.HolaMundoEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author salvador
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Iniciando Llmada Ejb");
        try {
            Context jndi = new InitialContext();
//            java:global/HolaMundoEJB-1.0-SNAPSHOT/HolaMundoEJBImpl!beans.HolaMundoEJBRemote
//            HolaMundoEJBRemote holaMundoEJBRemote=(HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote");
            HolaMundoEJBRemote holaMundoEJBRemote = (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB-1.0-SNAPSHOT/HolaMundoEJBImpl!beans.HolaMundoEJBRemote");
            System.out.println(holaMundoEJBRemote.sumar(5, 3));
        } catch (NamingException ex) {

        }
    }
}

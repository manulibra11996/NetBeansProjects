/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb2;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author manuel
 */
@Named(value = "ComprobarTest")
@SessionScoped
public class ComprobarTest implements Serializable {

    @Inject
    private ComprobarBeanLocal local;

    public ComprobarBeanLocal getComprobarBeanLocal() {
        return local;
    }

    
    public void setComprobarBeanLocal(ComprobarBeanLocal comprobarBeanLocal) {
        this.local = comprobarBeanLocal;
    }

}

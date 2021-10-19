/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.beans;

/**
 *
 * @author Manuel
 */
public class UserIlegalExeption extends Exception {

    @Override
    public String getMessage() {
        return "No existe el nick o el pasword";
    }

}

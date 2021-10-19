/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.commandpattern;

import java.util.List;

/**
 *
 * @author Admin
 */
public class ReportContacto implements Command<List<Contacto>> {

    @Override
    public void execute(List<Contacto> t) {
        t.forEach(item -> System.out.println(item.getNombre() + " " + item.getEmal()));
    }

}

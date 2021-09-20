/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.services.filtroservice;

import java.util.Iterator;
import javax.ejb.Local;

/**
 *
 * @author Manuel
 */
@Local
public interface FiltroService {
    public Iterator<Object> datosResumenEdad(int min, int max);
}

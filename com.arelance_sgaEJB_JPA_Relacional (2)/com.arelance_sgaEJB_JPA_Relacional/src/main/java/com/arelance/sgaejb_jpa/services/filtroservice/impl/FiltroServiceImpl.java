/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.services.filtroservice.impl;

import com.arelance.sgaejb_jpa.dao.filtro.FiltroDAO;
import com.arelance.sgaejb_jpa.services.filtroservice.FiltroService;
import java.util.Iterator;
import javax.inject.Inject;

/**
 *
 * @author Manuel
 */
public class FiltroServiceImpl implements FiltroService {

    @Inject
    private FiltroDAO filtroDAO;

    @Override
    public Iterator<Object> datosResumenEdad(int min, int max) {
        return filtroDAO.datosResumenEdad(min, max);
    }

   
}

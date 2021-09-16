/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.services.aficionservice.impl;

import com.arelance.sgaejb_jpa.dao.aficion.AficionDAO;
import com.arelance.sgaejb_jpa.services.aficionservice.AficionService;
import com.arelance.sgajpa.domain.Aficion;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.Query;

/**
 *
 * @author Manuel
 */
public class AficionServiceImpl implements AficionService{
   @Inject
    private AficionDAO aficionDAO;
    
    @Override
    public List<Aficion> listarAficiones() {
        return aficionDAO.listarAficiones();
    }

    @Override
    public Aficion findAficionByNombre(Aficion aficion) {
       return aficionDAO.findAficionByNombre(aficion);
    }

    @Override
    public Aficion findAficionByID(Aficion aficion) {
        return aficionDAO.findAficionByID(aficion);
    }

    @Override
    public Aficion findAficionByID(int id) {
        return aficionDAO.findAficionByID(id);
    }

    @Override
    public void addAficion(Aficion aficion) {
        aficionDAO.addAficion(aficion);
    }

    @Override
    public void updateAficion(Aficion aficion) {
        aficionDAO.updateAficion(aficion);
    }

    @Override
    public void removeAficion(Aficion aficion) {
        aficionDAO.removeAficion(aficion);
    }
    
}

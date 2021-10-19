/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.services.aficionservice.impl;

import com.arelance.sgaejb_jpa.dao.aficion.AficionDAO;
import com.arelance.sgaejb_jpa.services.aficionservice.AficionService;
import java.util.List;
import javax.ejb.Stateless;
import com.arelance.sgajpa.domain.Aficion;
import java.util.Set;
import javax.inject.Inject;

/**
 *
 * @author salvador
 */
@Stateless
public class AficionServiceImpl implements AficionService {

    @Inject
    private AficionDAO aficionDAO;

    @Override
    public List<Aficion> listarAficiones() {
        return aficionDAO.listarAficiones();
    }

    @Override
    public Aficion findAficionById(Aficion aficion) {
        return aficionDAO.findAficionById(aficion);
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

    @Override
    public Aficion findAficionById(Integer id) {
        return aficionDAO.findAficionById(id);
    }

    @Override
    public Set<String> listarResumenAficiones() {
        return aficionDAO.listarResumenAficiones();

    }

}

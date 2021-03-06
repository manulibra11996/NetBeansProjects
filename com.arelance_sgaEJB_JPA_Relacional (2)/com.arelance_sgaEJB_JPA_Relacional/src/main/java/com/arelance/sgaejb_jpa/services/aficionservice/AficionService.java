/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.services.aficionservice;

import com.arelance.sgajpa.domain.Aficion;
import java.util.List;
import java.util.Set;
import javax.ejb.Local;

/**
 *
 * @author salvador
 */
@Local
public interface AficionService {

    public List<Aficion> listarAficiones();

    public Set<String> listarResumenAficiones();

    public Aficion findAficionById(Aficion aficion);

    public Aficion findAficionById(Integer id);

    public void addAficion(Aficion aficion);

    public void updateAficion(Aficion aficion);

    public void removeAficion(Aficion aficion);
}

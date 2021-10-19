/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.sgaejb_jpa.services.aficionservice;

import com.arelance.sgajpa.domain.Aficion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author salvador
 */
@Local
public interface AficionService {

    public List<Aficion> listarAficiones();

    public Aficion findAficionByNombre(Aficion aficion);

    public Aficion findAficionByID(Aficion aficion);

    public Aficion findAficionByID(int id);

    public void addAficion(Aficion aficion);

    public void updateAficion(Aficion aficion);

    public void removeAficion(Aficion aficion);
}

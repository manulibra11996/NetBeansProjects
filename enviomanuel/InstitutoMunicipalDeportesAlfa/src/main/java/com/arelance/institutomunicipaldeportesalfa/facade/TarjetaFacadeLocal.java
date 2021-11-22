/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.facade;

import com.arelance.institutomunicipaldeportesalfa.domain.Tarjeta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface TarjetaFacadeLocal {

    void create(Tarjeta tarjeta);

    void edit(Tarjeta tarjeta);

    void remove(Tarjeta tarjeta);

    Tarjeta find(Object id);

    List<Tarjeta> findAll();

    List<Tarjeta> findRange(int[] range);

    int count();
    
}

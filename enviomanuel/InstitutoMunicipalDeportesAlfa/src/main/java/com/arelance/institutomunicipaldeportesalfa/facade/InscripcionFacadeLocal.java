/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.institutomunicipaldeportesalfa.facade;

import com.arelance.institutomunicipaldeportesalfa.domain.Inscripcion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface InscripcionFacadeLocal {

    void create(Inscripcion inscripcion);

    void edit(Inscripcion inscripcion);

    void remove(Inscripcion inscripcion);

    Inscripcion find(Object id);

    List<Inscripcion> findAll();

    List<Inscripcion> findRange(int[] range);

    int count();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;

import com.arelance.empresa.imd.dao.InscripcionTransferenciaDAO;
import com.arelance.empresa.imd.domain.Inscripciontransferencia;
import com.arelance.empresa.servicios.InscripcionTransferenciaService;
import java.util.List;
import javax.ejb.Local;
import javax.inject.Inject;

/**
 *
 * @author usuar
 */
@Local
public class InscripcionTransferenciaServiceImpl implements InscripcionTransferenciaService {

    @Inject
    InscripcionTransferenciaDAO inscripcionTransferenciaDAO;

    @Override
    public List<Inscripciontransferencia> obtener() {
        return inscripcionTransferenciaDAO.obtener();
    }

    @Override
    public void guardar(Inscripciontransferencia inscripciontransferencia) {
        inscripcionTransferenciaDAO.guardar(inscripciontransferencia);
    }

    @Override
    public void modificar(Inscripciontransferencia inscripciontransferencia) {
        inscripcionTransferenciaDAO.modificar(inscripciontransferencia);
    }

    @Override
    public void eliminar(Inscripciontransferencia inscripciontransferencia) {
        inscripcionTransferenciaDAO.eliminar(inscripciontransferencia);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;

import com.arelance.empresa.imd.dao.InscripcionTarjetaDAO;
import com.arelance.empresa.imd.domain.Inscripciontarjeta;
import com.arelance.empresa.imd.domain.Metodopagotarjeta;
import com.arelance.empresa.servicios.InscripcionTarjetaService;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author usuar
 */
public class InscripcionTarjetaServiceImpl implements InscripcionTarjetaService {

    @Inject
    InscripcionTarjetaDAO inscripcionTarjetaDAO;

    @Override
    public List<Inscripciontarjeta> obtener() {
        return inscripcionTarjetaDAO.obtener();
    }

    @Override
    public void guardar(Inscripciontarjeta inscripciontarjeta) {
        inscripcionTarjetaDAO.guardar(inscripciontarjeta);
    }

    @Override
    public void modificar(Inscripciontarjeta inscripciontarjeta) {
        inscripcionTarjetaDAO.modificar(inscripciontarjeta);
    }

    @Override
    public void eliminar(Inscripciontarjeta inscripciontarjeta) {
        inscripcionTarjetaDAO.eliminar(inscripciontarjeta);
    }

    @Override
    public Metodopagotarjeta ObtenerIdTarjeta() {
        return inscripcionTarjetaDAO.ObtenerIdTarjeta();
    }

}

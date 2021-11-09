/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.empresa.servicios.implementaciones;

import com.arelance.empresa.imd.dao.TarjetaCreditoDAO;
import java.util.List;
import com.arelance.empresa.imd.domain.Tarjetacredito;
import com.arelance.empresa.servicios.TarjetaCreditoService;
import javax.inject.Inject;

/**
 *
 * @author lenovo
 */
public class TarjetacreditoServiceImpl implements TarjetaCreditoService {

    @Inject
    private TarjetaCreditoDAO tarjetaCreditoDAO;

    @Override
    public List<Tarjetacredito> obtener() {
        return tarjetaCreditoDAO.obtener();
    }

    @Override
    public void AñadirTarjeta(Tarjetacredito tarjetacredito) {
      tarjetaCreditoDAO.AñadirTarjeta(tarjetacredito);
    }

    @Override
    public void ModificarTarjeta(Tarjetacredito tarjetacredito) {
        tarjetaCreditoDAO.ModificarTarjeta(tarjetacredito);
    }

    @Override
    public void RemoverTarjeta(Tarjetacredito tarjetacredito) {
        tarjetaCreditoDAO.RemoverTarjeta(tarjetacredito);
    }

}

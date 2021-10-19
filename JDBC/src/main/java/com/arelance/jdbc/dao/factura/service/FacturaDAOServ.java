/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.factura.service;

import com.arelance.jdbc.beans.Factura;
import com.arelance.jdbc.dao.factura.IFacturaDao;
import com.arelance.jdbc.dao.factura.impl.FacturaDAOImpl;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class FacturaDAOServ implements IFacturaDao {

    private IFacturaDao facturaDao = new FacturaDAOImpl();

    @Override
    public List<Factura> obtener() {
        return facturaDao.obtener();
    }

    @Override
    public void guardar(Factura factura) {
        facturaDao.guardar(factura);
    }

    @Override
    public void eliminar(Factura factura) {
        facturaDao.eliminar(factura);
    }

}

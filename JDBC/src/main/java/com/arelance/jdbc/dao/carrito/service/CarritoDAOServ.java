/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.carrito.service;

import com.arelance.jdbc.beans.Carrito;
import com.arelance.jdbc.dao.carrito.ICarritoDao;
import com.arelance.jdbc.dao.carrito.impl.CarritoDAOImpl;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class CarritoDAOServ implements ICarritoDao{

    private ICarritoDao carritoDao = new CarritoDAOImpl();

    @Override
    public List<Carrito> obtener() {
         return carritoDao.obtener();
    }

    @Override
    public void guardar(Carrito carrito) {
        carritoDao.guardar(carrito);
    }

    @Override
    public void eliminar(Carrito carrito) {
        carritoDao.eliminar(carrito);
    }

    @Override
    public void eliminarArt(Carrito carrito) {
        carritoDao.eliminarArt(carrito);
    }

}

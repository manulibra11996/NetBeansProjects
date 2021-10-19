/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.articulo.service;

import com.arelance.jdbc.beans.Articulo;
import com.arelance.jdbc.dao.articulo.IArticuloDao;
import com.arelance.jdbc.dao.articulo.impl.ArticuloDAOImpl;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class ArticuloDAOServ implements IArticuloDao {

    private IArticuloDao articuloDao = new ArticuloDAOImpl();

    @Override
    public List<Articulo> obtener() {
        return articuloDao.obtener();
    }

}

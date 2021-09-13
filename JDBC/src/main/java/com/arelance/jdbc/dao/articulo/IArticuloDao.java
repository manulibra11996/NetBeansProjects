/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.articulo;

import com.arelance.jdbc.beans.Articulo;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface IArticuloDao {

    public List<Articulo> obtener();
}

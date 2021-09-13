/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.carrito;

import com.arelance.jdbc.beans.Carrito;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface ICarritoDao {
    
    public List<Carrito> obtener();
    public void guardar(Carrito carrito);
    public void eliminar(Carrito carrito);
    public void eliminarArt(Carrito carrito);
}

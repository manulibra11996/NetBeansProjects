/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.factura;

import com.arelance.jdbc.beans.Factura;
import java.util.List;

/**
 *
 * @author Manuel
 */
public interface IFacturaDao {
    
    public List<Factura> obtener();
    public void guardar(Factura factura);
    public void eliminar(Factura factura);
}

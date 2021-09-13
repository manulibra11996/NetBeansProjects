/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.articulo.impl;

import com.arelance.jdbc.conexion.Conexion;
import com.arelance.jdbc.beans.Articulo;
import com.arelance.jdbc.dao.articulo.IArticuloDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class ArticuloDAOImpl implements IArticuloDao{

    @Override
    public List<Articulo> obtener() {

        String sql="SELECT * FROM articulo";

        List<Articulo> listaArticulo= new ArrayList<>();

        try {		
            try (Connection conn = Conexion.conectar()) {
                try (ResultSet rs = conn.createStatement().executeQuery(sql)){
                    while (rs.next()) {
                        Articulo a=new Articulo();
                        a.setIdArticulo(rs.getInt(1));
                        a.setNombre(rs.getString(2));
                        a.setDescripcion(rs.getString(3));
                        a.setPrecio(rs.getDouble(4));
                        listaArticulo.add(a);
                    }
                }
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase ArticuloDaoImple, método obtener");//Pide cambiarlo a logger log
        }
        return listaArticulo;

    }

}

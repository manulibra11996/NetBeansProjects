/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.articulo.impl;

import com.arelance.jdbc.Conexion;
import com.arelance.jdbc.beans.Articulo;
import com.arelance.jdbc.dao.articulo.IArticuloDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

/**
 *
 * @author Manuel
 */
public class ArticuloDAOImpl implements IArticuloDao{

    @Override
    public List<Articulo> obtener() {
        ResultSet rs=null;

        String sql="SELECT * FROM articulo";

        List<Articulo> listaArticulo= new ArrayList<>();

        try {		
            Connection conn=  Conexion.conectar();
            rs=conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                    Articulo a=new Articulo();
                    a.setId_articulo(rs.getInt(1));
                    a.setNombre(rs.getString(2));
                    a.setDescripcion(rs.getString(3));
                    a.setPrecio(rs.getDouble(4));
                    listaArticulo.add(a);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
                System.out.println("Error: Clase ArticuloDaoImple, método obtener");
        }finally{ 
            return listaArticulo;
        }
    }

}

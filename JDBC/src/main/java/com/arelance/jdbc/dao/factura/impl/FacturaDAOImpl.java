/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.factura.impl;

import com.arelance.jdbc.conexion.Conexion;
import com.arelance.jdbc.beans.Factura;
import com.arelance.jdbc.dao.factura.IFacturaDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class FacturaDAOImpl implements IFacturaDao{

    @Override
    public List<Factura> obtener() {
        ResultSet rs=null;

        String sql="SELECT idfactura, usuario_idusuario, articulo_idarticulo, precio FROM factura";

        List<Factura> listaFactura = new ArrayList<>();

        try {	
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    Factura f=new Factura();
                    f.setId_factura(rs.getInt(1));
                    f.setId_usuario(rs.getInt(2));
                    f.setId_articulo(rs.getInt(3));
                    f.setPrecio(rs.getDouble(4));
                    listaFactura.add(f);
                }
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase FacturaDaoImple, método obtener");
        }
        return listaFactura;
    }
    

    @Override
    public void guardar(Factura factura) {
        String sql="INSERT INTO factura (usuario_idusuario,articulo_idarticulo,precio) VALUES (" + factura.getId_usuario() + "," + factura.getId_articulo() +"," + factura.getPrecio() + ")";

        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase FacturaDaoImple, método guardar");
        } 
    }

    @Override
    public void eliminar(Factura factura) {
        String sql="DELETE FROM factura WHERE usuario_idusuario= '" + factura.getId_usuario() + "'";

        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase FacturaDaoImple, método eliminar");
        } 
    }

}
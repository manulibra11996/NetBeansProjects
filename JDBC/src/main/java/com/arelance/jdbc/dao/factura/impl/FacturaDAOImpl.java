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

        String sql="SELECT idfactura, usuario_idusuario, articulo_idarticulo, precio FROM factura";

        List<Factura> listaFactura = new ArrayList<>();

        try {	
            try (Connection conn = Conexion.conectar()) {
                try(ResultSet rs = conn.createStatement().executeQuery(sql)){
                    while (rs.next()) {
                        Factura f=new Factura();
                        f.setIdFactura(rs.getInt(1));
                        f.setIdUsuario(rs.getInt(2));
                        f.setIdArticulo(rs.getInt(3));
                        f.setPrecio(rs.getDouble(4));
                        listaFactura.add(f);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase FacturaDaoImple, método obtener");//Pide cambiarlo a logger log
        }
        return listaFactura;
    }
    

    @Override
    public void guardar(Factura factura) {
        String sql="INSERT INTO factura (usuario_idusuario,articulo_idarticulo,precio) VALUES (" + factura.getIdUsuario()+ "," + factura.getIdArticulo() +"," + factura.getPrecio() + ")";

        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase FacturaDaoImple, método guardar");//Pide cambiarlo a logger log
        } 
    }

    @Override
    public void eliminar(Factura factura) {
        String sql="DELETE FROM factura WHERE usuario_idusuario= '" + factura.getIdUsuario() + "'";

        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase FacturaDaoImple, método eliminar");//Pide cambiarlo a logger log
        } 
    }

}
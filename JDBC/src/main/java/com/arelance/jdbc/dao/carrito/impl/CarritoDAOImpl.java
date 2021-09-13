/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.carrito.impl;

import com.arelance.jdbc.conexion.Conexion;
import com.arelance.jdbc.beans.Carrito;
import com.arelance.jdbc.dao.carrito.ICarritoDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class CarritoDAOImpl implements ICarritoDao{

    @Override
    public List<Carrito> obtener() {
        ResultSet rs=null;

        String sql="SELECT idcarrito, usuario_idusuario, articulo_idarticulo FROM carrito";

        List<Carrito> listaCarrito = new ArrayList<>();

        try {	
            try (Connection conn = Conexion.conectar()) {
                rs=conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    Carrito c=new Carrito();
                    c.setIdcarrito(rs.getInt(1));
                    c.setId_usuario(rs.getInt(2));
                    c.setId_articulo(rs.getInt(3));
                    listaCarrito.add(c);
                }
                rs.close();
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase CarritoDaoImple, método obtener");
        }
        return listaCarrito;

    }
    

    @Override
    public void guardar(Carrito carrito) {
        String sql="INSERT INTO carrito (usuario_idusuario, articulo_idarticulo) VALUES (" + carrito.getId_usuario() + "," + carrito.getId_articulo() + ")";

        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase CarritoDaoImple, método guardar");
        } 
    }

    @Override
    public void eliminar(Carrito carrito) {
        String sql="DELETE FROM carrito WHERE usuario_idusuario= '" + carrito.getId_usuario() + "'";

        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase CarritoDaoImple, método eliminar");
        } 
    }

    @Override
    public void eliminar_art(Carrito carrito) {
        String sql="DELETE FROM carrito WHERE (usuario_idusuario= '" + carrito.getId_usuario() + "') AND (articulo_idarticulo= '" + carrito.getId_articulo() + "')";

        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase CarritoDaoImple, método eliminar");
        } 
    }

}
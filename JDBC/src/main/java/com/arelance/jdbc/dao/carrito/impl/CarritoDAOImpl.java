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
public class CarritoDAOImpl implements ICarritoDao {

    @Override
    public List<Carrito> obtener() {

        String sql = "SELECT idcarrito, usuario_idusuario, articulo_idarticulo FROM carrito";

        List<Carrito> listaCarrito = new ArrayList<>();

        try {
            try (Connection conn = Conexion.conectar()) {
                try (ResultSet rs = conn.createStatement().executeQuery(sql)) {
                    while (rs.next()) {
                        Carrito c = new Carrito();
                        c.setIdCarrito(rs.getInt(1));
                        c.setIdUsuario(rs.getInt(2));
                        c.setIdArticulo(rs.getInt(3));
                        listaCarrito.add(c);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase CarritoDaoImple, método obtener");//Pide cambiarlo a logger log
        }
        return listaCarrito;

    }

    @Override
    public void guardar(Carrito carrito) {
        String sql = "INSERT INTO carrito (usuario_idusuario, articulo_idarticulo) VALUES (" + carrito.getIdUsuario() + "," + carrito.getIdArticulo() + ")";

        try {
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase CarritoDaoImple, método guardar");//Pide cambiarlo a logger log
        }
    }

    @Override
    public void eliminar(Carrito carrito) {
        String sql = "DELETE FROM carrito WHERE usuario_idusuario= '" + carrito.getIdUsuario() + "'";

        try {
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase CarritoDaoImple, método eliminar");//Pide cambiarlo a logger log
        }
    }

    @Override
    public void eliminarArt(Carrito carrito) {
        String sql = "DELETE FROM carrito WHERE (usuario_idusuario= '" + carrito.getIdUsuario() + "') AND (articulo_idarticulo= '" + carrito.getIdArticulo() + "')";

        try {
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase CarritoDaoImple, método eliminar");//Pide cambiarlo a logger log
        }
    }

}

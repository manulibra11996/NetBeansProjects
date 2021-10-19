/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.usuario.impl;

import com.arelance.jdbc.Conexion;
import com.arelance.jdbc.beans.Articulo;
import com.arelance.jdbc.beans.Usuario;
import com.arelance.jdbc.dao.articulo.IArticuloDao;
import com.arelance.jdbc.dao.usuario.IUsuarioDao;
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
public class UsuarioDAOImpl implements IUsuarioDao {

    @Override
    public List<Usuario> obtener() {
        ResultSet rs = null;

        String sql = "SELECT * FROM usuario";

        List<Usuario> listaUsuarios = new ArrayList<>();

        try {
            Connection conn = Conexion.conectar();
            rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId_usuario(rs.getInt(1));
                u.setNick(rs.getString(2));
                u.setContraseña(rs.getString(3));
                listaUsuarios.add(u);
            }
            rs.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase UsuarioDaoImple, método obtener");
        }

        return listaUsuarios;
    }

    @Override
    public void guardar(Usuario usuario) {
        ResultSet rs = null;

        String sql = "INSERT INTO usuario (nick,contraseña) VALUES ('" + usuario.getNick() + "','" + usuario.getContraseña() + "')";

        try {
            Connection conn = Conexion.conectar();
            rs = conn.createStatement().executeQuery(sql);

            rs.close();
            Conexion.conectar().close();
        } catch (SQLException e) {
            System.out.println("Error: Clase UsuarioDaoImple, método obtener");
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.jdbc.dao.usuario.impl;

import com.arelance.jdbc.conexion.Conexion;
import com.arelance.jdbc.beans.Usuario;
import com.arelance.jdbc.dao.usuario.IUsuarioDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class UsuarioDAOImpl implements IUsuarioDao{

    @Override
    public List<Usuario> obtener() {

        String sql="SELECT * FROM usuario";

        List<Usuario> listaUsuarios= new ArrayList<>();

        try {	
            try (Connection conn = Conexion.conectar()) {
                try(ResultSet rs = conn.createStatement().executeQuery(sql)){
                    while (rs.next()) {
                        Usuario u=new Usuario();
                        u.setIdUsuario(rs.getInt(1));
                        u.setNick(rs.getString(2));
                        u.setContrasena(rs.getString(3));
                        listaUsuarios.add(u);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase UsuarioDaoImple, método obtener");//Pide cambiarlo a logger log
        }
        return listaUsuarios;

    }

    @Override
    public void guardar(Usuario usuario) {
        String sql="INSERT INTO usuario (nick,contraseña) VALUES ('" + usuario.getNick() + "','" + usuario.getContrasena()+"')";

        try {			
            try (Connection conn = Conexion.conectar()) {
                conn.createStatement().executeUpdate(sql);
            }
        } catch (SQLException e) {
                System.out.println("Error: Clase UsuarioDaoImple, método guardar");//Pide cambiarlo a logger log
        } 

    }

}
